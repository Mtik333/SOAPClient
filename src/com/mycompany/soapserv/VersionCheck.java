package com.mycompany.soapserv;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.IOException;
import java.util.Set;

public class VersionCheck implements SOAPHandler<SOAPMessageContext> {
    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        System.out.println("Client executing SOAP Handler");

        Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        // If it is an outgoing message
        if (outboundProperty.booleanValue()) {

            try {
                SOAPMessage soapMessagg = context.getMessage();
                SOAPEnvelope soapEnvelope = soapMessagg.getSOAPPart().getEnvelope();

                // Grab the header of the SOAP envelop
                SOAPHeader soapHeader = soapEnvelope.getHeader();

                // Attach a new header if there is none...
                if (soapHeader == null) {
                    soapHeader = soapEnvelope.addHeader();
                }

                // add the property to the header
                QName qname = new QName("http://soapserv.mycompany.com/", "appVersion");

                // Create a new HeaderElement in order to place the new property
                SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(qname);

                soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
                soapHeaderElement.addTextNode("1.0");
                soapMessagg.saveChanges();

                // Output the message to the Console -- for debug
                soapMessagg.writeTo(System.out);

            } catch (SOAPException e) {
                System.err.println(e);
            } catch (IOException e) {
                System.err.println(e);
            }

        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }
}