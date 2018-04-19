
package com.mycompany.soapserv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rsiAuditorium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rsiAuditorium">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsiSeatCollection" type="{http://soapserv.mycompany.com/}rsiSeat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rsiScreeningCollection" type="{http://soapserv.mycompany.com/}rsiScreening" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rsiAuditorium", propOrder = {
    "rsiSeatCollection",
    "rsiScreeningCollection",
    "id",
    "name",
    "seatsNumber"
})
public class RsiAuditorium {

    protected List<RsiSeat> rsiSeatCollection;
    protected List<RsiScreening> rsiScreeningCollection;
    protected Integer id;
    protected String name;
    protected int seatsNumber;

    /**
     * Gets the value of the rsiSeatCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsiSeatCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsiSeatCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RsiSeat }
     * 
     * 
     */
    public List<RsiSeat> getRsiSeatCollection() {
        if (rsiSeatCollection == null) {
            rsiSeatCollection = new ArrayList<RsiSeat>();
        }
        return this.rsiSeatCollection;
    }

    /**
     * Gets the value of the rsiScreeningCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsiScreeningCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsiScreeningCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RsiScreening }
     * 
     * 
     */
    public List<RsiScreening> getRsiScreeningCollection() {
        if (rsiScreeningCollection == null) {
            rsiScreeningCollection = new ArrayList<RsiScreening>();
        }
        return this.rsiScreeningCollection;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the seatsNumber property.
     * 
     */
    public int getSeatsNumber() {
        return seatsNumber;
    }

    /**
     * Sets the value of the seatsNumber property.
     * 
     */
    public void setSeatsNumber(int value) {
        this.seatsNumber = value;
    }

}
