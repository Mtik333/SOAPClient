package controllers;

import com.mycompany.soapserv.*;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
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
        System.out.println(seat.getId());
        button.setOnMouseClicked(event -> {
                    createReservation();
                }
        );
    }

    private void createReservation() {
        int number = (int) numbers.getSelectionModel().getSelectedItem();
        URL url = null;
        try {
            url = new URL("https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://soapserv.mycompany.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
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
        return hello.getSeats().stream().filter(seat -> seat.getId() == number).findFirst().get();
    }
}
