
package com.mycompany.soapserv;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="rsiSeatReservedCollection" type="{http://soapserv.mycompany.com/}rsiSeatReserved" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reservationContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "rsiSeatReservedCollection",
    "active",
    "id",
    "reservationContact",
    "reserved"
})
public class RsiReservation {

    protected List<RsiSeatReserved> rsiSeatReservedCollection;
    protected Boolean active;
    protected Integer id;
    protected String reservationContact;
    protected Boolean reserved;

    /**
     * Gets the value of the rsiSeatReservedCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsiSeatReservedCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsiSeatReservedCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RsiSeatReserved }
     * 
     * 
     */
    public List<RsiSeatReserved> getRsiSeatReservedCollection() {
        if (rsiSeatReservedCollection == null) {
            rsiSeatReservedCollection = new ArrayList<RsiSeatReserved>();
        }
        return this.rsiSeatReservedCollection;
    }

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

}
