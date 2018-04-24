package controllers;

import com.mycompany.soapserv.*;
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
import sample.CustomProxySelector;

import javax.xml.ws.soap.MTOMFeature;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.ProxySelector;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MovieDetailsController implements Initializable {

    public static RsiMovie movie;
    static Map<RsiScreening, RsiAuditorium> mapScreeningAuditorium = new HashMap<>();
    @FXML
    public ImageView imageView;
    @FXML
    public TextField titleTextField;
    @FXML
    public TextField directorTextField;
    @FXML
    public TextField actorsTextField;
    @FXML
    public Label movieDescription;
    @FXML
    public ListView screeningsListView;

    private static Map.Entry<RsiScreening, RsiAuditorium> findScreening(String name) {
        for (Map.Entry<RsiScreening, RsiAuditorium> entry : mapScreeningAuditorium.entrySet()) {
            String[] test2 = name.split("\t");
            String test = test2[0];
            if (entry.getKey().getAuditoriumId().getName().contentEquals(test)) {
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm");
                String date;
                date = sdf.format(entry.getKey().getScreeningStart().toGregorianCalendar().getTime());
                if (date.contentEquals(test2[2]))
                    return entry;
            }
        }
        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        mapScreeningAuditorium = new HashMap<>();
        HelloWorldImplService implService = new HelloWorldImplService();
        HelloWorld hello = implService.getHelloWorldImplPort(new MTOMFeature());
        byte[] bytes = hello.downloadImage(movie.getId() + ".png");
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        Image image = new Image(bais);
        imageView.setImage(image);
        titleTextField.setText(movie.getTitle());
        directorTextField.setText(movie.getDirector());
        actorsTextField.setText(movie.getActors());
        movieDescription.setText(movie.getDescription());
        List<RsiScreening> screeningCollection = hello.getScreenings().stream().filter(rsiScreening -> rsiScreening.getMovieId().getId().equals(movie.getId())).collect(Collectors.toList());
        for (RsiScreening rsiScreening : screeningCollection) {
            getAuditoriumNames(hello, rsiScreening);
        }
        List<String> titles = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm");
        String date;
        for (Map.Entry<RsiScreening, RsiAuditorium> entry : mapScreeningAuditorium.entrySet()) {
            date = sdf.format(entry.getKey().getScreeningStart().toGregorianCalendar().getTime());
            titles.add(entry.getKey().getAuditoriumId().getName() + "\t\t" + date);
        }
        ObservableList<String> list = FXCollections.observableArrayList(titles);
        screeningsListView.setItems(list);
        screeningsListView.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            @Override
            public ListCell<String> call(ListView<String> param) {
                return new XCell();
            }
        });
    }

    private void getAuditoriumNames(HelloWorld helloWorld, RsiScreening screening) {
        List<RsiAuditorium> auditoriums = helloWorld.getAuditoriums();
        for (RsiAuditorium auditorium : auditoriums) {
            if (screening.getAuditoriumId().equals(screening.getAuditoriumId())) {
                mapScreeningAuditorium.put(screening, auditorium);
            }
        }
    }

    @FXML
    public void dismiss() {
        Stage stage = (Stage) imageView.getScene().getWindow();
        stage.close();
    }

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
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/SeatDetails.fxml"));
                    SeatDetails.rsiScreening = findScreening(lastItem).getKey();
                    SeatDetails.rsiAuditorium = findScreening(lastItem).getKey().getAuditoriumId();
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
                setGraphic(hbox);
            }
        }
    }
}
