
package com.mycompany.soapserv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rsiReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rsiReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="clientReserverId" type="{http://soapserv.mycompany.com/}rsiClient" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reservationContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="screeningId" type="{http://soapserv.mycompany.com/}rsiScreening" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rsiReservation", propOrder = {
    "active",
    "clientReserverId",
    "id",
    "reservationContact",
    "reserved",
    "screeningId"
})
public class RsiReservation {

    protected Boolean active;
    protected RsiClient clientReserverId;
    protected Integer id;
    protected String reservationContact;
    protected Boolean reserved;
    protected RsiScreening screeningId;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the clientReserverId property.
     * 
     * @return
     *     possible object is
     *     {@link RsiClient }
     *     
     */
    public RsiClient getClientReserverId() {
        return clientReserverId;
    }

    /**
     * Sets the value of the clientReserverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsiClient }
     *     
     */
    public void setClientReserverId(RsiClient value) {
        this.clientReserverId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the reservationContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationContact() {
        return reservationContact;
    }

    /**
     * Sets the value of the reservationContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationContact(String value) {
        this.reservationContact = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserved(Boolean value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the screeningId property.
     * 
     * @return
     *     possible object is
     *     {@link RsiScreening }
     *     
     */
    public RsiScreening getScreeningId() {
        return screeningId;
    }

    /**
     * Sets the value of the screeningId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsiScreening }
     *     
     */
    public void setScreeningId(RsiScreening value) {
        this.screeningId = value;
    }

}
