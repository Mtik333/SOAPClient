package controllers;

import com.mycompany.soapserv.HelloWorld;
import com.mycompany.soapserv.RsiMovie;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class MovieDetailsController implements Initializable {

    private RsiMovie movie;
    @FXML
    private ImageView imageView;

    public void setMovie(RsiMovie rsiMovie){
        this.movie=rsiMovie;
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
        imageView.setImage(image);
    }
}
