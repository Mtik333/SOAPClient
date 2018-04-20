package controllers;

import com.mycompany.soapserv.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(seat.getId());
        button.setOnMouseClicked(event -> {
            createReservation();
            }
        );
    }

    private void createReservation(){
        RsiReservation rsiReservation = new RsiReservation();
        rsiReservation.setActive(true);
        rsiReservation.setReserved(true);
        RsiSeatReserved seatReserved = new RsiSeatReserved();
        rsiReservation.getRsiSeatReservedCollection().add(seatReserved);
        URL url = null;
        try {
            url = new URL("https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://soapserv.mycompany.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        hello.createReservation(rsiReservation);
    }
}
