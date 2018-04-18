package controllers;

import com.mycompany.soapserv.HelloWorld;
import com.mycompany.soapserv.InvalidPasswordException_Exception;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    static {
        //for localhost testing only
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier((String hostname, javax.net.ssl.SSLSession sslSession) -> {
            return hostname.equals("localhost");
        });
    }

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    public void tryLogin() throws IOException, InvalidPasswordException_Exception {
        String username2 = username.getText();
        String password2 = password.getText();
        System.out.println("xd");
        URL url = new URL("https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
        QName qname = new QName("http://soapserv.mycompany.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        Map<String, Object> req_ctx = ((BindingProvider)hello).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList(username2));
        headers.put("Password", Collections.singletonList(password2));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        boolean okay = hello.authenticateClient();
        int i=0;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/FXMLDocument.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("ABC");
        stage.setScene(new Scene(root1));
        stage.show();
        dismiss();
    }

    public void dismiss() {
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
