package controllers;

import com.mycompany.soapserv.HelloWorld;
import com.mycompany.soapserv.RsiAuditorium;
import com.mycompany.soapserv.RsiMovie;
import com.mycompany.soapserv.RsiScreening;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.util.Callback;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class MovieDetailsController implements Initializable {

    public static RsiMovie movie;
    @FXML
    public ImageView imageView;
    @FXML
    public TextField titleTextField;
    @FXML
    public TextField directorTextField;
    @FXML
    public TextField actorsTextField;
    @FXML
    public ListView screeningsListView;

    static List<RsiScreening> screeningList = new ArrayList<>();

    static class XCell extends ListCell<String> {
        HBox hbox = new HBox();
        Label label = new Label("(empty)");
        Pane pane = new Pane();
        Button button = new Button("Details");
        String lastItem;

        public XCell() {
            super();
            hbox.getChildren().addAll(label, pane, button);
            HBox.setHgrow(pane, Priority.ALWAYS);
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
//                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/MovieDetails.fxml"));
//                    Parent root1 = null;
//                    try {
//                        root1 = (Parent) fxmlLoader.load();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    Stage stage = new Stage();
//                    stage.setTitle("Movie details");
//                    stage.setScene(new Scene(root1));
//                    MovieDetailsController controller =
//                            fxmlLoader.<MovieDetailsController>getController();
//
//                    stage.show();
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
                label.setText(item!=null ? item : "<null>");
                setGraphic(hbox);
            }
        }
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
        Image image = new Image(new ByteArrayInputStream(hello.downloadImage("rss.png")));
        if (image!=null)
            imageView.setImage(image);
        titleTextField.setText(movie.getTitle());
        directorTextField.setText(movie.getDirector());
        actorsTextField.setText(movie.getActors());

        List<RsiScreening> screeningCollection = movie.getRsiScreeningCollection();
        screeningList = screeningCollection;


//        List<RsiAuditorium> auditoriums = screeningList.stream().map(RsiScreening::getAuditoriumId).collect(Collectors.toList());
//
//        List<String> titles = screeningList.stream().map(RsiScreening::getAuditoriumId).map(RsiAuditorium::getName).collect(Collectors.toList());
//        ObservableList<String> list = FXCollections.observableArrayList(titles);
//        screeningsListView.setItems(list);
//        screeningsListView.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
//            @Override
//            public ListCell<String> call(ListView<String> param) {
//                return new XCell();
//            }
//        });

    }
}