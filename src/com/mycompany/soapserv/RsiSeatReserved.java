
package com.mycompany.soapserv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rsiSeatReserved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rsiSeatReserved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reservationId" type="{http://soapserv.mycompany.com/}rsiReservation" minOccurs="0"/>
 *         &lt;element name="screeningId" type="{http://soapserv.mycompany.com/}rsiScreening" minOccurs="0"/>
 *         &lt;element name="seatId" type="{http://soapserv.mycompany.com/}rsiSeat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rsiSeatReserved", propOrder = {
    "id",
    "reservationId",
    "screeningId",
    "seatId"
})
public class RsiSeatReserved {

    protected Integer id;
    protected RsiReservation reservationId;
    protected RsiScreening screeningId;
    protected RsiSeat seatId;

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
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link RsiReservation }
     *     
     */
    public RsiReservation getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsiReservation }
     *     
     */
    public void setReservationId(RsiReservation value) {
        this.reservationId = value;
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

    /**
     * Gets the value of the seatId property.
     * 
     * @return
     *     possible object is
     *     {@link RsiSeat }
     *     
     */
    public RsiSeat getSeatId() {
        return seatId;
    }

    /**
     * Sets the value of the seatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsiSeat }
     *     
     */
    public void setSeatId(RsiSeat value) {
        this.seatId = value;
    }

}
