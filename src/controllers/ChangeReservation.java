package controllers;

import com.mycompany.soapserv.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import sample.CustomProxySelector;

import java.net.ProxySelector;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class ChangeReservation implements Initializable {
    static RsiReservation reservation;
    @FXML
    public ChoiceBox choiceBox;
    @FXML
    public Button changeButton;
    List<RsiSeatReserved> seatReservedsFromScreening = new ArrayList<>();
    List<RsiSeat> seats = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        HelloWorldImplService implService = new HelloWorldImplService();
        HelloWorld hello = implService.getHelloWorldImplPort();
        seatReservedsFromScreening = hello.getReservedSeats().stream().filter(rsiSeatReserved -> rsiSeatReserved.getScreeningId().getId().equals(reservation.getScreeningId().getId())).collect(Collectors.toList());
        seats = hello.getSeats();
        for (RsiSeatReserved seat : seatReservedsFromScreening) {
            seats = seats.stream().filter(myseat -> myseat.getId().intValue() != seat.getSeatId().getId().intValue()).collect(Collectors.toList());
        }
        List<Integer> numbers = seats.stream().map(seat -> seat.getId()).collect(Collectors.toList());
        choiceBox.getItems().addAll(numbers);
        choiceBox.getSelectionModel().select(0);
        changeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RsiSeat newSeat = seats.stream().filter(rsiSeat -> ((rsiSeat.getSeatNumber()-1)*5+rsiSeat.getSeatRow()) == (int) choiceBox.getSelectionModel().getSelectedItem()).findFirst().get();
                hello.changeReservation(reservation, newSeat);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Reserved seat");
                alert.setContentText("You changed reservation succesfully");
                alert.showAndWait();
                Stage stage = (Stage) choiceBox.getScene().getWindow();
                stage.close();
            }
        });
    }

    @FXML
    public void dismiss() {
        Stage stage = (Stage) choiceBox.getScene().getWindow();
        stage.close();
    }

}
