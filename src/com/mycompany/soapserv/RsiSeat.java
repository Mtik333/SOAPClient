
package com.mycompany.soapserv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rsiSeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rsiSeat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsiSeatReservedCollection" type="{http://soapserv.mycompany.com/}rsiSeatReserved" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seatNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seatRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rsiSeat", propOrder = {
    "rsiSeatReservedCollection",
    "id",
    "seatNumber",
    "seatRow"
})
public class RsiSeat {

    protected List<RsiSeatReserved> rsiSeatReservedCollection;
    protected Integer id;
    protected int seatNumber;
    protected int seatRow;

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
     * Gets the value of the seatNumber property.
     * 
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     */
    public void setSeatNumber(int value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the seatRow property.
     * 
     */
    public int getSeatRow() {
        return seatRow;
    }

    /**
     * Sets the value of the seatRow property.
     * 
     */
    public void setSeatRow(int value) {
        this.seatRow = value;
    }

}
