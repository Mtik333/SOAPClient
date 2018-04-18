
package com.mycompany.soapserv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.soapserv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DownloadImage_QNAME = new QName("http://soapserv.mycompany.com/", "downloadImage");
    private final static QName _RsiReservation_QNAME = new QName("http://soapserv.mycompany.com/", "rsiReservation");
    private final static QName _RsiSeat_QNAME = new QName("http://soapserv.mycompany.com/", "rsiSeat");
    private final static QName _GetProducts_QNAME = new QName("http://soapserv.mycompany.com/", "getProducts");
    private final static QName _GetScreenings_QNAME = new QName("http://soapserv.mycompany.com/", "getScreenings");
    private final static QName _GetReservations_QNAME = new QName("http://soapserv.mycompany.com/", "getReservations");
    private final static QName _RsiMovie_QNAME = new QName("http://soapserv.mycompany.com/", "rsiMovie");
    private final static QName _InvalidPasswordException_QNAME = new QName("http://soapserv.mycompany.com/", "InvalidPasswordException");
    private final static QName _AuthenticateClientResponse_QNAME = new QName("http://soapserv.mycompany.com/", "authenticateClientResponse");
    private final static QName _DownloadImageResponse_QNAME = new QName("http://soapserv.mycompany.com/", "downloadImageResponse");
    private final static QName _GetMoviesResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getMoviesResponse");
    private final static QName _GetMovies_QNAME = new QName("http://soapserv.mycompany.com/", "getMovies");
    private final static QName _GetReservedSeats_QNAME = new QName("http://soapserv.mycompany.com/", "getReservedSeats");
    private final static QName _RsiScreening_QNAME = new QName("http://soapserv.mycompany.com/", "rsiScreening");
    private final static QName _GetClientsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getClientsResponse");
    private final static QName _GetHelloWorldAsStringResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getHelloWorldAsStringResponse");
    private final static QName _GetClients_QNAME = new QName("http://soapserv.mycompany.com/", "getClients");
    private final static QName _GetProductsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getProductsResponse");
    private final static QName _GetAuditoriums_QNAME = new QName("http://soapserv.mycompany.com/", "getAuditoriums");
    private final static QName _GetHelloWorldAsString_QNAME = new QName("http://soapserv.mycompany.com/", "getHelloWorldAsString");
    private final static QName _RsiSeatReserved_QNAME = new QName("http://soapserv.mycompany.com/", "rsiSeatReserved");
    private final static QName _GetAuditoriumsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getAuditoriumsResponse");
    private final static QName _GetReservationsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getReservationsResponse");
    private final static QName _GetSeats_QNAME = new QName("http://soapserv.mycompany.com/", "getSeats");
    private final static QName _RsiClient_QNAME = new QName("http://soapserv.mycompany.com/", "rsiClient");
    private final static QName _GetScreeningsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getScreeningsResponse");
    private final static QName _GetReservedSeatsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getReservedSeatsResponse");
    private final static QName _RsiAuditorium_QNAME = new QName("http://soapserv.mycompany.com/", "rsiAuditorium");
    private final static QName _AuthenticateClient_QNAME = new QName("http://soapserv.mycompany.com/", "authenticateClient");
    private final static QName _GetSeatsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getSeatsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.soapserv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAuditoriums }
     * 
     */
    public GetAuditoriums createGetAuditoriums() {
        return new GetAuditoriums();
    }

    /**
     * Create an instance of {@link GetHelloWorldAsString }
     * 
     */
    public GetHelloWorldAsString createGetHelloWorldAsString() {
        return new GetHelloWorldAsString();
    }

    /**
     * Create an instance of {@link RsiSeatReserved }
     * 
     */
    public RsiSeatReserved createRsiSeatReserved() {
        return new RsiSeatReserved();
    }

    /**
     * Create an instance of {@link GetClients }
     * 
     */
    public GetClients createGetClients() {
        return new GetClients();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetHelloWorldAsStringResponse }
     * 
     */
    public GetHelloWorldAsStringResponse createGetHelloWorldAsStringResponse() {
        return new GetHelloWorldAsStringResponse();
    }

    /**
     * Create an instance of {@link GetClientsResponse }
     * 
     */
    public GetClientsResponse createGetClientsResponse() {
        return new GetClientsResponse();
    }

    /**
     * Create an instance of {@link RsiScreening }
     * 
     */
    public RsiScreening createRsiScreening() {
        return new RsiScreening();
    }

    /**
     * Create an instance of {@link GetMovies }
     * 
     */
    public GetMovies createGetMovies() {
        return new GetMovies();
    }

    /**
     * Create an instance of {@link GetReservedSeats }
     * 
     */
    public GetReservedSeats createGetReservedSeats() {
        return new GetReservedSeats();
    }

    /**
     * Create an instance of {@link GetMoviesResponse }
     * 
     */
    public GetMoviesResponse createGetMoviesResponse() {
        return new GetMoviesResponse();
    }

    /**
     * Create an instance of {@link AuthenticateClientResponse }
     * 
     */
    public AuthenticateClientResponse createAuthenticateClientResponse() {
        return new AuthenticateClientResponse();
    }

    /**
     * Create an instance of {@link DownloadImageResponse }
     * 
     */
    public DownloadImageResponse createDownloadImageResponse() {
        return new DownloadImageResponse();
    }

    /**
     * Create an instance of {@link GetReservations }
     * 
     */
    public GetReservations createGetReservations() {
        return new GetReservations();
    }

    /**
     * Create an instance of {@link RsiMovie }
     * 
     */
    public RsiMovie createRsiMovie() {
        return new RsiMovie();
    }

    /**
     * Create an instance of {@link InvalidPasswordException }
     * 
     */
    public InvalidPasswordException createInvalidPasswordException() {
        return new InvalidPasswordException();
    }

    /**
     * Create an instance of {@link GetScreenings }
     * 
     */
    public GetScreenings createGetScreenings() {
        return new GetScreenings();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link DownloadImage }
     * 
     */
    public DownloadImage createDownloadImage() {
        return new DownloadImage();
    }

    /**
     * Create an instance of {@link RsiReservation }
     * 
     */
    public RsiReservation createRsiReservation() {
        return new RsiReservation();
    }

    /**
     * Create an instance of {@link RsiSeat }
     * 
     */
    public RsiSeat createRsiSeat() {
        return new RsiSeat();
    }

    /**
     * Create an instance of {@link AuthenticateClient }
     * 
     */
    public AuthenticateClient createAuthenticateClient() {
        return new AuthenticateClient();
    }

    /**
     * Create an instance of {@link GetSeatsResponse }
     * 
     */
    public GetSeatsResponse createGetSeatsResponse() {
        return new GetSeatsResponse();
    }

    /**
     * Create an instance of {@link RsiAuditorium }
     * 
     */
    public RsiAuditorium createRsiAuditorium() {
        return new RsiAuditorium();
    }

    /**
     * Create an instance of {@link GetReservedSeatsResponse }
     * 
     */
    public GetReservedSeatsResponse createGetReservedSeatsResponse() {
        return new GetReservedSeatsResponse();
    }

    /**
     * Create an instance of {@link GetScreeningsResponse }
     * 
     */
    public GetScreeningsResponse createGetScreeningsResponse() {
        return new GetScreeningsResponse();
    }

    /**
     * Create an instance of {@link RsiClient }
     * 
     */
    public RsiClient createRsiClient() {
        return new RsiClient();
    }

    /**
     * Create an instance of {@link GetReservationsResponse }
     * 
     */
    public GetReservationsResponse createGetReservationsResponse() {
        return new GetReservationsResponse();
    }

    /**
     * Create an instance of {@link GetSeats }
     * 
     */
    public GetSeats createGetSeats() {
        return new GetSeats();
    }

    /**
     * Create an instance of {@link GetAuditoriumsResponse }
     * 
     */
    public GetAuditoriumsResponse createGetAuditoriumsResponse() {
        return new GetAuditoriumsResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "downloadImage")
    public JAXBElement<DownloadImage> createDownloadImage(DownloadImage value) {
        return new JAXBElement<DownloadImage>(_DownloadImage_QNAME, DownloadImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsiReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "rsiReservation")
    public JAXBElement<RsiReservation> createRsiReservation(RsiReservation value) {
        return new JAXBElement<RsiReservation>(_RsiReservation_QNAME, RsiReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsiSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "rsiSeat")
    public JAXBElement<RsiSeat> createRsiSeat(RsiSeat value) {
        return new JAXBElement<RsiSeat>(_RsiSeat_QNAME, RsiSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScreenings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getScreenings")
    public JAXBElement<GetScreenings> createGetScreenings(GetScreenings value) {
        return new JAXBElement<GetScreenings>(_GetScreenings_QNAME, GetScreenings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getReservations")
    public JAXBElement<GetReservations> createGetReservations(GetReservations value) {
        return new JAXBElement<GetReservations>(_GetReservations_QNAME, GetReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsiMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "rsiMovie")
    public JAXBElement<RsiMovie> createRsiMovie(RsiMovie value) {
        return new JAXBElement<RsiMovie>(_RsiMovie_QNAME, RsiMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidPasswordException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "InvalidPasswordException")
    public JAXBElement<InvalidPasswordException> createInvalidPasswordException(InvalidPasswordException value) {
        return new JAXBElement<InvalidPasswordException>(_InvalidPasswordException_QNAME, InvalidPasswordException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "authenticateClientResponse")
    public JAXBElement<AuthenticateClientResponse> createAuthenticateClientResponse(AuthenticateClientResponse value) {
        return new JAXBElement<AuthenticateClientResponse>(_AuthenticateClientResponse_QNAME, AuthenticateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "downloadImageResponse")
    public JAXBElement<DownloadImageResponse> createDownloadImageResponse(DownloadImageResponse value) {
        return new JAXBElement<DownloadImageResponse>(_DownloadImageResponse_QNAME, DownloadImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getMoviesResponse")
    public JAXBElement<GetMoviesResponse> createGetMoviesResponse(GetMoviesResponse value) {
        return new JAXBElement<GetMoviesResponse>(_GetMoviesResponse_QNAME, GetMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getMovies")
    public JAXBElement<GetMovies> createGetMovies(GetMovies value) {
        return new JAXBElement<GetMovies>(_GetMovies_QNAME, GetMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservedSeats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getReservedSeats")
    public JAXBElement<GetReservedSeats> createGetReservedSeats(GetReservedSeats value) {
        return new JAXBElement<GetReservedSeats>(_GetReservedSeats_QNAME, GetReservedSeats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsiScreening }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "rsiScreening")
    public JAXBElement<RsiScreening> createRsiScreening(RsiScreening value) {
        return new JAXBElement<RsiScreening>(_RsiScreening_QNAME, RsiScreening.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getClientsResponse")
    public JAXBElement<GetClientsResponse> createGetClientsResponse(GetClientsResponse value) {
        return new JAXBElement<GetClientsResponse>(_GetClientsResponse_QNAME, GetClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getHelloWorldAsStringResponse")
    public JAXBElement<GetHelloWorldAsStringResponse> createGetHelloWorldAsStringResponse(GetHelloWorldAsStringResponse value) {
        return new JAXBElement<GetHelloWorldAsStringResponse>(_GetHelloWorldAsStringResponse_QNAME, GetHelloWorldAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getClients")
    public JAXBElement<GetClients> createGetClients(GetClients value) {
        return new JAXBElement<GetClients>(_GetClients_QNAME, GetClients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuditoriums }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getAuditoriums")
    public JAXBElement<GetAuditoriums> createGetAuditoriums(GetAuditoriums value) {
        return new JAXBElement<GetAuditoriums>(_GetAuditoriums_QNAME, GetAuditoriums.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getHelloWorldAsString")
    public JAXBElement<GetHelloWorldAsString> createGetHelloWorldAsString(GetHelloWorldAsString value) {
        return new JAXBElement<GetHelloWorldAsString>(_GetHelloWorldAsString_QNAME, GetHelloWorldAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsiSeatReserved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "rsiSeatReserved")
    public JAXBElement<RsiSeatReserved> createRsiSeatReserved(RsiSeatReserved value) {
        return new JAXBElement<RsiSeatReserved>(_RsiSeatReserved_QNAME, RsiSeatReserved.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuditoriumsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getAuditoriumsResponse")
    public JAXBElement<GetAuditoriumsResponse> createGetAuditoriumsResponse(GetAuditoriumsResponse value) {
        return new JAXBElement<GetAuditoriumsResponse>(_GetAuditoriumsResponse_QNAME, GetAuditoriumsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getReservationsResponse")
    public JAXBElement<GetReservationsResponse> createGetReservationsResponse(GetReservationsResponse value) {
        return new JAXBElement<GetReservationsResponse>(_GetReservationsResponse_QNAME, GetReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getSeats")
    public JAXBElement<GetSeats> createGetSeats(GetSeats value) {
        return new JAXBElement<GetSeats>(_GetSeats_QNAME, GetSeats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "rsiClient")
    public JAXBElement<RsiClient> createRsiClient(RsiClient value) {
        return new JAXBElement<RsiClient>(_RsiClient_QNAME, RsiClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScreeningsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getScreeningsResponse")
    public JAXBElement<GetScreeningsResponse> createGetScreeningsResponse(GetScreeningsResponse value) {
        return new JAXBElement<GetScreeningsResponse>(_GetScreeningsResponse_QNAME, GetScreeningsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservedSeatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getReservedSeatsResponse")
    public JAXBElement<GetReservedSeatsResponse> createGetReservedSeatsResponse(GetReservedSeatsResponse value) {
        return new JAXBElement<GetReservedSeatsResponse>(_GetReservedSeatsResponse_QNAME, GetReservedSeatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsiAuditorium }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "rsiAuditorium")
    public JAXBElement<RsiAuditorium> createRsiAuditorium(RsiAuditorium value) {
        return new JAXBElement<RsiAuditorium>(_RsiAuditorium_QNAME, RsiAuditorium.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "authenticateClient")
    public JAXBElement<AuthenticateClient> createAuthenticateClient(AuthenticateClient value) {
        return new JAXBElement<AuthenticateClient>(_AuthenticateClient_QNAME, AuthenticateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getSeatsResponse")
    public JAXBElement<GetSeatsResponse> createGetSeatsResponse(GetSeatsResponse value) {
        return new JAXBElement<GetSeatsResponse>(_GetSeatsResponse_QNAME, GetSeatsResponse.class, null, value);
    }

}
