package com.mycompany.soapserv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeReservation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="changeReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://soapserv.mycompany.com/}rsiReservation" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://soapserv.mycompany.com/}rsiSeat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeReservation", propOrder = {
        "arg0",
        "arg1"
})
public class ChangeReservation {

    protected RsiReservation arg0;
    protected RsiSeat arg1;

    /**
     * Gets the value of the arg0 property.
     *
     * @return possible object is
     * {@link RsiReservation }
     */
    public RsiReservation getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     *
     * @param value allowed object is
     *              {@link RsiReservation }
     */
    public void setArg0(RsiReservation value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     *
     * @return possible object is
     * {@link RsiSeat }
     */
    public RsiSeat getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     *
     * @param value allowed object is
     *              {@link RsiSeat }
     */
    public void setArg1(RsiSeat value) {
        this.arg1 = value;
    }

}
