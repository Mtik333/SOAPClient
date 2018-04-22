package controllers;

import com.mycompany.soapserv.*;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ReservationDetails implements Initializable {

    public static RsiSeat seat;
    public static RsiScreening screening;
    public static RsiAuditorium auditorium;

    @FXML
    public Button button;
    @FXML
    public TextField seatId;
    @FXML
    public ChoiceBox numbers;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        seatId.setText(seat.getId().toString());
        numbers.getItems().addAll(FXCollections.observableArrayList(1, 2, 3));
        numbers.getSelectionModel().select(0);
        System.out.println(seat.getId());
        button.setOnMouseClicked(event -> {
                    createReservation();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Reservation status");
                    alert.setHeaderText("Reservation successful");
                    alert.setContentText("You reserved tickets for screening successfully");
                    alert.showAndWait();
                    Stage stage_root = (Stage) numbers.getScene().getWindow();
                    stage_root.close();
                }
        );
    }

    private void createReservation() {
        int number = (int) numbers.getSelectionModel().getSelectedItem();
        HelloWorldImplService implService = new HelloWorldImplService();
        HelloWorld hello = implService.getHelloWorldImplPort();
        for (int i = 0; i < number; i++) {
            RsiReservation rsiReservation = new RsiReservation();
            rsiReservation.setActive(true);
            rsiReservation.setReserved(true);
            rsiReservation.setClientReserverId(Everything.rsiClient);
            rsiReservation.setScreeningId(screening);
            hello.createReservation(rsiReservation, findSeatByNumber(hello, seat.getId() + i));
        }
    }

    private RsiSeat findSeatByNumber(HelloWorld hello, int number) {
        return hello.getSeats().stream().filter(seat -> ((seat.getSeatNumber() - 1) * 5 + seat.getSeatRow()) == number).findFirst().get();
    }
}
