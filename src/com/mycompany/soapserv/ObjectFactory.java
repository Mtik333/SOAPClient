
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

    private final static QName _GetProducts_QNAME = new QName("http://soapserv.mycompany.com/", "getProducts");
    private final static QName _RsiAuditorium_QNAME = new QName("http://soapserv.mycompany.com/", "rsiAuditorium");
    private final static QName _GetHelloWorldAsStringResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getHelloWorldAsStringResponse");
    private final static QName _GetAuditoriumsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getAuditoriumsResponse");
    private final static QName _GetProductsResponse_QNAME = new QName("http://soapserv.mycompany.com/", "getProductsResponse");
    private final static QName _AuthenticateClient_QNAME = new QName("http://soapserv.mycompany.com/", "authenticateClient");
    private final static QName _InvalidPasswordException_QNAME = new QName("http://soapserv.mycompany.com/", "InvalidPasswordException");
    private final static QName _AuthenticateClientResponse_QNAME = new QName("http://soapserv.mycompany.com/", "authenticateClientResponse");
    private final static QName _GetAuditoriums_QNAME = new QName("http://soapserv.mycompany.com/", "getAuditoriums");
    private final static QName _GetHelloWorldAsString_QNAME = new QName("http://soapserv.mycompany.com/", "getHelloWorldAsString");

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
     * Create an instance of {@link AuthenticateClientResponse }
     * 
     */
    public AuthenticateClientResponse createAuthenticateClientResponse() {
        return new AuthenticateClientResponse();
    }

    /**
     * Create an instance of {@link AuthenticateClient }
     * 
     */
    public AuthenticateClient createAuthenticateClient() {
        return new AuthenticateClient();
    }

    /**
     * Create an instance of {@link InvalidPasswordException }
     * 
     */
    public InvalidPasswordException createInvalidPasswordException() {
        return new InvalidPasswordException();
    }

    /**
     * Create an instance of {@link GetAuditoriumsResponse }
     * 
     */
    public GetAuditoriumsResponse createGetAuditoriumsResponse() {
        return new GetAuditoriumsResponse();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link RsiAuditorium }
     * 
     */
    public RsiAuditorium createRsiAuditorium() {
        return new RsiAuditorium();
    }

    /**
     * Create an instance of {@link GetHelloWorldAsStringResponse }
     * 
     */
    public GetHelloWorldAsStringResponse createGetHelloWorldAsStringResponse() {
        return new GetHelloWorldAsStringResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RsiAuditorium }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "rsiAuditorium")
    public JAXBElement<RsiAuditorium> createRsiAuditorium(RsiAuditorium value) {
        return new JAXBElement<RsiAuditorium>(_RsiAuditorium_QNAME, RsiAuditorium.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuditoriumsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "getAuditoriumsResponse")
    public JAXBElement<GetAuditoriumsResponse> createGetAuditoriumsResponse(GetAuditoriumsResponse value) {
        return new JAXBElement<GetAuditoriumsResponse>(_GetAuditoriumsResponse_QNAME, GetAuditoriumsResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserv.mycompany.com/", name = "authenticateClient")
    public JAXBElement<AuthenticateClient> createAuthenticateClient(AuthenticateClient value) {
        return new JAXBElement<AuthenticateClient>(_AuthenticateClient_QNAME, AuthenticateClient.class, null, value);
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

}
