package controllers;

import com.mycompany.soapserv.HelloWorld;
import com.mycompany.soapserv.HelloWorldImplService;
import com.mycompany.soapserv.RsiMovie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.util.Callback;
import sample.CustomProxySelector;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class FXMLDocumentController implements Initializable {

    static List<RsiMovie> movies = new ArrayList<>();
    @FXML
    private ListView listView;

    private static RsiMovie findMovie(String name) {
        return movies.stream().filter(myname -> myname.getTitle().equals(name)).findFirst().get();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        HelloWorldImplService implService = new HelloWorldImplService();
        HelloWorld hello = implService.getHelloWorldImplPort();
        List<RsiMovie> movieList = hello.getMovies();
        movies = movieList;
        List<String> titles = FXCollections.observableArrayList(movieList.stream().map(RsiMovie::getTitle)
                .collect(Collectors.toList()));
        ObservableList<String> list = FXCollections.observableArrayList(titles);
        listView.setItems(list);
        listView.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            @Override
            public ListCell<String> call(ListView<String> param) {
                return new XCell();
            }
        });
    }

    @FXML
    private void goToMyReservations() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/MyReservations.fxml"));
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage_root = (Stage) listView.getScene().getWindow();
        stage_root.setTitle("RSI Cinema - my reservations");
        stage_root.setScene(new Scene(root1));
//
//        Stage stage = new Stage();
//        stage.setTitle("My reservations");
//        stage.setScene(new Scene(root1));
        stage_root.showAndWait();
    }

    @FXML
    public void dismiss() {
        Stage stage = (Stage) listView.getScene().getWindow();
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
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/MovieDetails.fxml"));
                    MovieDetailsController.movie = FXMLDocumentController.findMovie(lastItem);
                    Parent root1 = null;
                    try {
                        root1 = (Parent) fxmlLoader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Stage stage = new Stage();
                    stage.setTitle("Movie details");
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
