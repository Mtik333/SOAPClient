package controllers;

import com.mycompany.soapserv.HelloWorld;
import com.mycompany.soapserv.RsiReservation;
import com.qoppa.pdf.PDFException;
import com.qoppa.pdfViewerFX.PDFViewer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.util.Callback;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class MyReservationsController implements Initializable {

    static List<RsiReservation> reservationList;
    @FXML
    public ListView listView;

    public static RsiReservation findReservation(String id) {
        int reservationId = Integer.parseInt(id.replace("-", ""));
        for (RsiReservation rsiReservation : reservationList) {
            if (rsiReservation.getId().intValue() == reservationId) {
                return rsiReservation;
            }
        }
        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        URL url = null;
        try {
            url = new URL("https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://soapserv.mycompany.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        reservationList = hello.getReservations().stream().filter(reservation -> reservation.getClientReserverId().getId().intValue() == Everything.rsiClient.getId().intValue()).collect(Collectors.toList());
        List<String> reservations = new ArrayList<>();
        for (RsiReservation rsiReservation : reservationList) {
            StringBuilder sb = new StringBuilder();
            sb.append(rsiReservation.getId() + "\t");
            sb.append(rsiReservation.getScreeningId().getMovieId().getTitle() + "\t");
            sb.append(rsiReservation.getScreeningId().getScreeningStart());
            reservations.add(sb.toString());
        }
        ObservableList<String> list = FXCollections.observableArrayList(reservations);
        listView.setItems(list);
        listView.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            @Override
            public ListCell<String> call(ListView<String> param) {
                return new XCell();
            }
        });
    }

    static class XCell extends ListCell<String> {
        HBox hbox = new HBox();
        Label label = new Label("(empty)");
        Label label2 = new Label("aaa");
        Label label3 = new Label();
        Pane pane = new Pane();
        Button editButton = new Button("Edit");
        Button cancelButton = new Button("Cancel");
        Button button = new Button("Details");
        String lastItem;

        public XCell() {
            super();
            hbox.getChildren().addAll(label, label2, label3, pane, button, editButton, cancelButton);
            HBox.setHgrow(pane, Priority.ALWAYS);
            editButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/ChangeReservationSeat.fxml"));
                    ChangeReservation.reservation = findReservation(label.getText());
                    Parent root1 = null;
                    try {
                        root1 = (Parent) fxmlLoader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Stage stage = new Stage();
                    stage.setTitle("Seat details");
                    stage.setScene(new Scene(root1));
                    stage.showAndWait();
                }
            });

            cancelButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmation Dialog");
                    alert.setHeaderText("Look, a Confirmation Dialog");
                    alert.setContentText("Are you ok with this?");
                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.get() == ButtonType.OK) {
                        URL url = null;
                        try {
                            url = new URL("https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                        QName qname = new QName("http://soapserv.mycompany.com/", "HelloWorldImplService");
                        Service service = Service.create(url, qname);
                        HelloWorld hello = service.getPort(HelloWorld.class);
                        RsiReservation test = findReservation(label.getText());
                        hello.removeReservation(test);
                    } else {
                        alert.close();
                    }
                }
            });

            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    //https://kbdeveloper.qoppa.com/javafx-pdf-viewer/
                    URL url = null;
                    try {
                        url = new URL("https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    QName qname = new QName("http://soapserv.mycompany.com/", "HelloWorldImplService");
                    Service service = Service.create(url, qname);
                    HelloWorld hello = service.getPort(HelloWorld.class);
                    byte[] bais = hello.pdfReservation(reservationList.get(0));
                    File file = new File("itext-test.pdf");
                    FileOutputStream fileout = null;
                    try {
                        fileout = new FileOutputStream(file);
                        fileout.write(bais);
                        PDFViewer m_PDFViewer = new PDFViewer();
                        m_PDFViewer.loadPDF(file.toURL());
                        BorderPane borderPane = new BorderPane(m_PDFViewer);
                        Scene scene = new Scene(borderPane);
                        Stage stage = new Stage();
                        stage.setTitle("JavaFX PDFViewer - Qoppa Software");
                        stage.setScene(scene);
                        stage.centerOnScreen();
                        stage.show();
                    } catch (IOException | PDFException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        @Override
        protected void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            setText(null);  // No text in label of super class
            if (empty) {
                lastItem = null;
                setGraphic(null);
            } else {
                lastItem = item;
                label.setText(item != null ? item : "<null>");
                String[] text = label.getText().split("\t");
                label.setText(text[0] + "-");
                label2.setText(text[1] + "-");
                label3.setText(text[2]);
                setGraphic(hbox);
            }
        }
    }
}
