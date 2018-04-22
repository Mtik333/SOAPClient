package controllers;

import com.mycompany.soapserv.HelloWorld;
import com.mycompany.soapserv.RsiReservation;
import com.mycompany.soapserv.RsiSeat;
import com.mycompany.soapserv.RsiSeatReserved;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
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
        URL url = null;
        try {
            url = new URL("https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://soapserv.mycompany.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
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
                RsiSeat newSeat = seats.stream().filter(rsiSeat -> rsiSeat.getId().intValue() == (int) choiceBox.getSelectionModel().getSelectedItem()).findFirst().get();
                hello.changeReservation(reservation, newSeat);
            }
        });
    }
    @FXML
    public void dismiss() {
        Stage stage = (Stage) choiceBox.getScene().getWindow();
        stage.close();
    }

}
