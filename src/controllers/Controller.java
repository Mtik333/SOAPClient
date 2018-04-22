package controllers;

import com.mycompany.soapserv.HelloWorld;
import com.mycompany.soapserv.HelloWorldImplService;
import com.mycompany.soapserv.InvalidPasswordException_Exception;
import com.mycompany.soapserv.RsiClient;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    public void tryLogin() throws IOException {
        String username2 = username.getText();
        String password2 = password.getText();
        System.out.println("xd");
        HelloWorldImplService implService = new HelloWorldImplService();
        HelloWorld hello = implService.getHelloWorldImplPort();
        Map<String, Object> req_ctx = ((BindingProvider) hello).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8111/SOAPServer/HelloWorldImplService?wsdl");
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList(username2));
        headers.put("Password", Collections.singletonList(password2));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        try {
            boolean okay = hello.authenticateClient();
            int i = 0;
            List<RsiClient> clients = hello.getClients();
            Everything.setClient(clients, username2);
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/FXMLDocument.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("RSI Cinema - Movies");
            stage.setScene(new Scene(root1));
            stage.show();
            dismiss();
        }
        catch (InvalidPasswordException_Exception ipe) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid credentials");
            alert.setContentText("You entered invalid credentials. Try again");
            alert.showAndWait();
        }
    }

    public void dismiss() {
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
