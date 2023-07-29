
package ease.soapwebservices.sfcnewage.xsd.creacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.RespuestaP7542600WS;


/**
 * <p>Clase Java para RespuestaNewAge complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaNewAge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claveFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claveInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indMasDatos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pantPagina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tiempoEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalRegistros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaNewAgeCreacion", propOrder = {
    "claveFin",
    "claveInicio",
    "descRetorno",
    "indMasDatos",
    "pantPagina",
    "retorno",
    "tiempoEjecucion",
    "totalRegistros"
})
@XmlSeeAlso({
    RespuestaP7542600WS.class
})
public class RespuestaNewAge {

    @XmlElementRef(name = "claveFin", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claveFin;
    @XmlElementRef(name = "claveInicio", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claveInicio;
    @XmlElementRef(name = "descRetorno", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descRetorno;
    @XmlElementRef(name = "indMasDatos", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indMasDatos;
    @XmlElementRef(name = "pantPagina", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pantPagina;
    @XmlElementRef(name = "retorno", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retorno;
    @XmlElementRef(name = "tiempoEjecucion", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tiempoEjecucion;
    protected Integer totalRegistros;

    /**
     * Obtiene el valor de la propiedad claveFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaveFin() {
        return claveFin;
    }

    /**
     * Define el valor de la propiedad claveFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaveFin(JAXBElement<String> value) {
        this.claveFin = value;
    }

    /**
     * Obtiene el valor de la propiedad claveInicio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaveInicio() {
        return claveInicio;
    }

    /**
     * Define el valor de la propiedad claveInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaveInicio(JAXBElement<String> value) {
        this.claveInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad descRetorno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescRetorno() {
        return descRetorno;
    }

    /**
     * Define el valor de la propiedad descRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescRetorno(JAXBElement<String> value) {
        this.descRetorno = value;
    }

    /**
     * Obtiene el valor de la propiedad indMasDatos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndMasDatos() {
        return indMasDatos;
    }

    /**
     * Define el valor de la propiedad indMasDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndMasDatos(JAXBElement<String> value) {
        this.indMasDatos = value;
    }

    /**
     * Obtiene el valor de la propiedad pantPagina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPantPagina() {
        return pantPagina;
    }

    /**
     * Define el valor de la propiedad pantPagina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPantPagina(JAXBElement<String> value) {
        this.pantPagina = value;
    }

    /**
     * Obtiene el valor de la propiedad retorno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetorno() {
        return retorno;
    }

    /**
     * Define el valor de la propiedad retorno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetorno(JAXBElement<String> value) {
        this.retorno = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoEjecucion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    /**
     * Define el valor de la propiedad tiempoEjecucion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTiempoEjecucion(JAXBElement<String> value) {
        this.tiempoEjecucion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRegistros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRegistros() {
        return totalRegistros;
    }

    /**
     * Define el valor de la propiedad totalRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRegistros(Integer value) {
        this.totalRegistros = value;
    }

}
