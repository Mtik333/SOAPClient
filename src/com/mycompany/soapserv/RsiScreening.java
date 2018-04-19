
package com.mycompany.soapserv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for rsiScreening complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rsiScreening">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsiReservationCollection" type="{http://soapserv.mycompany.com/}rsiReservation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rsiSeatReservedCollection" type="{http://soapserv.mycompany.com/}rsiSeatReserved" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="screeningStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rsiScreening", propOrder = {
    "rsiReservationCollection",
    "rsiSeatReservedCollection",
    "id",
    "screeningStart"
})
public class RsiScreening {

    protected List<RsiReservation> rsiReservationCollection;
    protected List<RsiSeatReserved> rsiSeatReservedCollection;
    protected Integer id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar screeningStart;

    /**
     * Gets the value of the rsiReservationCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsiReservationCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsiReservationCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RsiReservation }
     * 
     * 
     */
    public List<RsiReservation> getRsiReservationCollection() {
        if (rsiReservationCollection == null) {
            rsiReservationCollection = new ArrayList<RsiReservation>();
        }
        return this.rsiReservationCollection;
    }

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
     * Gets the value of the screeningStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScreeningStart() {
        return screeningStart;
    }

    /**
     * Sets the value of the screeningStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScreeningStart(XMLGregorianCalendar value) {
        this.screeningStart = value;
    }

}
