/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.soapserv;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

/**
 *
 * @author Rashas
 */
public class WSSClient {

    static {
        //for localhost testing only
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier((String hostname, javax.net.ssl.SSLSession sslSession) -> {
            return hostname.equals("localhost");
        });
    }

    public static void main(String[] args) throws MalformedURLException {

        try {
            System.setProperty("javax.net.ssl.trustStore","D:\\RSI_PS6");
            System.setProperty("javax.net.ssl.trustStorePassword","herbata");
            URL url = new URL("https://localhost:8443/SOAPServer/HelloWorldImplService?wsdl");
            QName qname = new QName("http://soapserv.mycompany.com/", "HelloWorldImplService");
            
            HelloWorldImplService helloService = new HelloWorldImplService();
            HelloWorld hello = helloService.getHelloWorldImplPort();
            List<RsiAuditorium> auditoriums = hello.getAuditoriums();
            for (RsiAuditorium auditorium : auditoriums){
                System.out.println(auditorium.getName());
            }
            
//            List<Product> p = hello.getProducts();
//            p.forEach((pp) -> {
//                System.out.println(pp.getNazwa());
//            });
//            
//            Map<String, Object> req_ctx = ((BindingProvider) hello).getRequestContext();
//            req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, helloService.getWSDLDocumentLocation().toString());
//            
//            Map<String, List<String>> headers = new HashMap<>();
//            headers.put("Username", Collections.singletonList("rashgas"));
//            headers.put("Password", Collections.singletonList("tajne"));
//            req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
//            
//            System.out.println("oczymalem: " + hello.getHelloWorldAsString("ads"));
//            System.out.println("oczymalem: " + hello.getProducts().toString());
        } catch (Exception ex) {
            Logger.getLogger(WSSClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
