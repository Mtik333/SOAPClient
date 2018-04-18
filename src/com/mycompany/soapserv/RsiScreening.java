
package com.mycompany.soapserv;

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
 *         &lt;element name="auditoriumId" type="{http://soapserv.mycompany.com/}rsiAuditorium" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieId" type="{http://soapserv.mycompany.com/}rsiMovie" minOccurs="0"/>
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
    "auditoriumId",
    "id",
    "movieId",
    "screeningStart"
})
public class RsiScreening {

    protected RsiAuditorium auditoriumId;
    protected Integer id;
    protected RsiMovie movieId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar screeningStart;

    /**
     * Gets the value of the auditoriumId property.
     * 
     * @return
     *     possible object is
     *     {@link RsiAuditorium }
     *     
     */
    public RsiAuditorium getAuditoriumId() {
        return auditoriumId;
    }

    /**
     * Sets the value of the auditoriumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsiAuditorium }
     *     
     */
    public void setAuditoriumId(RsiAuditorium value) {
        this.auditoriumId = value;
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
     * Gets the value of the movieId property.
     * 
     * @return
     *     possible object is
     *     {@link RsiMovie }
     *     
     */
    public RsiMovie getMovieId() {
        return movieId;
    }

    /**
     * Sets the value of the movieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsiMovie }
     *     
     */
    public void setMovieId(RsiMovie value) {
        this.movieId = value;
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
