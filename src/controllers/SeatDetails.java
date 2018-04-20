package controllers;

import com.mycompany.soapserv.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class SeatDetails implements Initializable {
    @FXML
    public GridPane gridPane;
    public static RsiScreening rsiScreening;
    public static RsiAuditorium rsiAuditorium;
    List<RsiSeatReserved> seatReservedsFromScreening = new ArrayList<>();
    List<RsiSeatReserved> seatReservedsFromSeat = new ArrayList<>();
    List<RsiSeat> seats = new ArrayList<>();

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
        seatReservedsFromScreening = rsiScreening.getRsiSeatReservedCollection();
        seats = hello.getSeats();
        seatReservedsFromSeat = seats.get(0).getRsiSeatReservedCollection();

        for (int i=0; i<25; i++){
            Node node = gridPane.getChildren().get(i);
            Pane pane = new Pane();
            pane.setOnMouseClicked(e->{
                Node source = (Node)e.getSource();
                reservationMaker(GridPane.getColumnIndex(source)+1, GridPane.getRowIndex(source)+1);
            });
            Label label = new Label();
            label.setText(String.valueOf(i+1));
            pane.getChildren().add(label);
            if (test2(seats.get(i))){
                pane.setStyle("-fx-background-color: red;");
            }
            else pane.setStyle("-fx-background-color: green;");
            //gridPane.getChildren().add(0,pane);
            gridPane.add(pane,i/5,i%5);
        }
    }

    public boolean test2(RsiSeat seat){
        for (RsiSeatReserved seatReserved : seat.getRsiSeatReservedCollection()){
            for (RsiSeatReserved screeningSeatReserver : seatReservedsFromScreening){
                if (seatReserved.getId().equals(screeningSeatReserver.getId()))
                    return true;
            }
        }
        return false;
    }

    public RsiSeat findSeatByRowColumn(int column, int row){
        for (RsiSeat seat : seats){
            if (seat.getSeatNumber()==column && seat.getSeatRow()==row){
                return seat;
            }
        }
        return null;
    }


    public void reservationMaker(int column, int row){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/ReservationDetails.fxml"));
        ReservationDetails.seat=findSeatByRowColumn(column,row);
        ReservationDetails.screening=rsiScreening;
        ReservationDetails.auditorium=rsiAuditorium;
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setTitle("Seat details");
        stage.setScene(new Scene(root1));
        stage.show();
    }

}
