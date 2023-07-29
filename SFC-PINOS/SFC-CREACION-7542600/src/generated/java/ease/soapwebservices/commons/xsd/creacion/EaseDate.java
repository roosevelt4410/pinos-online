
package ease.soapwebservices.commons.xsd.creacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EaseDate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EaseDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nombreDia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreMes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EaseDate", propOrder = {
    "anno",
    "dia",
    "format",
    "mes",
    "nombreDia",
    "nombreMes",
    "valueDate"
})
public class EaseDate {

    protected Integer anno;
    protected Integer dia;
    @XmlElementRef(name = "format", namespace = "http://commons.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> format;
    protected Integer mes;
    @XmlElementRef(name = "nombreDia", namespace = "http://commons.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreDia;
    @XmlElementRef(name = "nombreMes", namespace = "http://commons.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreMes;
    @XmlElementRef(name = "valueDate", namespace = "http://commons.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valueDate;

    /**
     * Obtiene el valor de la propiedad anno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnno() {
        return anno;
    }

    /**
     * Define el valor de la propiedad anno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnno(Integer value) {
        this.anno = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDia(Integer value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad format.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormat(JAXBElement<String> value) {
        this.format = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMes(Integer value) {
        this.mes = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreDia() {
        return nombreDia;
    }

    /**
     * Define el valor de la propiedad nombreDia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreDia(JAXBElement<String> value) {
        this.nombreDia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreMes() {
        return nombreMes;
    }

    /**
     * Define el valor de la propiedad nombreMes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreMes(JAXBElement<String> value) {
        this.nombreMes = value;
    }

    /**
     * Obtiene el valor de la propiedad valueDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValueDate() {
        return valueDate;
    }

    /**
     * Define el valor de la propiedad valueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValueDate(JAXBElement<String> value) {
        this.valueDate = value;
    }

}
