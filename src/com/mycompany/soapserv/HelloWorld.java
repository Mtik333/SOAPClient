
package com.mycompany.soapserv;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://soapserv.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws InvalidPasswordException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHelloWorldAsString", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetHelloWorldAsString")
    @ResponseWrapper(localName = "getHelloWorldAsStringResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetHelloWorldAsStringResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getHelloWorldAsStringRequest", output = "http://soapserv.mycompany.com/HelloWorld/getHelloWorldAsStringResponse", fault = {
        @FaultAction(className = InvalidPasswordException_Exception.class, value = "http://soapserv.mycompany.com/HelloWorld/getHelloWorldAsString/Fault/InvalidPasswordException")
    })
    public String getHelloWorldAsString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws InvalidPasswordException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.Boolean
     * @throws InvalidPasswordException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authenticateClient", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.AuthenticateClient")
    @ResponseWrapper(localName = "authenticateClientResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.AuthenticateClientResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/authenticateClientRequest", output = "http://soapserv.mycompany.com/HelloWorld/authenticateClientResponse", fault = {
        @FaultAction(className = InvalidPasswordException_Exception.class, value = "http://soapserv.mycompany.com/HelloWorld/authenticateClient/Fault/InvalidPasswordException")
    })
    public Boolean authenticateClient()
        throws InvalidPasswordException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapserv.RsiMovie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovies", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetMovies")
    @ResponseWrapper(localName = "getMoviesResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetMoviesResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getMoviesRequest", output = "http://soapserv.mycompany.com/HelloWorld/getMoviesResponse")
    public List<RsiMovie> getMovies();

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadImage", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.DownloadImage")
    @ResponseWrapper(localName = "downloadImageResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.DownloadImageResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/downloadImageRequest", output = "http://soapserv.mycompany.com/HelloWorld/downloadImageResponse")
    public byte[] downloadImage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapserv.RsiClient>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClients", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetClients")
    @ResponseWrapper(localName = "getClientsResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetClientsResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getClientsRequest", output = "http://soapserv.mycompany.com/HelloWorld/getClientsResponse")
    public List<RsiClient> getClients();

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapserv.RsiScreening>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getScreenings", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetScreenings")
    @ResponseWrapper(localName = "getScreeningsResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetScreeningsResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getScreeningsRequest", output = "http://soapserv.mycompany.com/HelloWorld/getScreeningsResponse")
    public List<RsiScreening> getScreenings();

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapserv.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProducts", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetProducts")
    @ResponseWrapper(localName = "getProductsResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetProductsResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getProductsRequest", output = "http://soapserv.mycompany.com/HelloWorld/getProductsResponse")
    public List<Product> getProducts();

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapserv.RsiAuditorium>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAuditoriums", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetAuditoriums")
    @ResponseWrapper(localName = "getAuditoriumsResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetAuditoriumsResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getAuditoriumsRequest", output = "http://soapserv.mycompany.com/HelloWorld/getAuditoriumsResponse")
    public List<RsiAuditorium> getAuditoriums();

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapserv.RsiSeat>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSeats", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetSeats")
    @ResponseWrapper(localName = "getSeatsResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetSeatsResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getSeatsRequest", output = "http://soapserv.mycompany.com/HelloWorld/getSeatsResponse")
    public List<RsiSeat> getSeats();

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapserv.RsiSeatReserved>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReservedSeats", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetReservedSeats")
    @ResponseWrapper(localName = "getReservedSeatsResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetReservedSeatsResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getReservedSeatsRequest", output = "http://soapserv.mycompany.com/HelloWorld/getReservedSeatsResponse")
    public List<RsiSeatReserved> getReservedSeats();

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapserv.RsiReservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReservations", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetReservations")
    @ResponseWrapper(localName = "getReservationsResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.GetReservationsResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/getReservationsRequest", output = "http://soapserv.mycompany.com/HelloWorld/getReservationsResponse")
    public List<RsiReservation> getReservations();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createReservation", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.CreateReservation")
    @ResponseWrapper(localName = "createReservationResponse", targetNamespace = "http://soapserv.mycompany.com/", className = "com.mycompany.soapserv.CreateReservationResponse")
    @Action(input = "http://soapserv.mycompany.com/HelloWorld/createReservationRequest", output = "http://soapserv.mycompany.com/HelloWorld/createReservationResponse")
    public void createReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        RsiReservation arg0);

}
