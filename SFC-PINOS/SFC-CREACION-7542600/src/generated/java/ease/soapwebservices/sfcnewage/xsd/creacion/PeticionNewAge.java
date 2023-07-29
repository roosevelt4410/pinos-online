
package ease.soapwebservices.sfcnewage.xsd.creacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.PeticionP7542600WS;


/**
 * <p>Clase Java para PeticionNewAge complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PeticionNewAge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoPaginable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="avanzar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indMasDatos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pantPagina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retroceder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeticionNewAgeCreacion",  propOrder = {
    "autoPaginable",
    "avanzar",
    "clave",
    "entidad",
    "idioma",
    "indMasDatos",
    "oficina",
    "pantPagina",
    "password",
    "retroceder",
    "tipoOperacion",
    "usuario"
})
@XmlSeeAlso({
    PeticionP7542600WS.class
})
public class PeticionNewAge {

    protected Boolean autoPaginable;
    protected Boolean avanzar;
    @XmlElementRef(name = "clave", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clave;
    @XmlElementRef(name = "entidad", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entidad;
    @XmlElementRef(name = "idioma", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idioma;
    @XmlElementRef(name = "indMasDatos", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indMasDatos;
    @XmlElementRef(name = "oficina", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficina;
    @XmlElementRef(name = "pantPagina", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pantPagina;
    @XmlElementRef(name = "password", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    protected Boolean retroceder;
    @XmlElementRef(name = "tipoOperacion", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOperacion;
    @XmlElementRef(name = "usuario", namespace = "http://sfcNewAge.soapwebservices.ease/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuario;

    /**
     * Obtiene el valor de la propiedad autoPaginable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPaginable() {
        return autoPaginable;
    }

    /**
     * Define el valor de la propiedad autoPaginable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPaginable(Boolean value) {
        this.autoPaginable = value;
    }

    /**
     * Obtiene el valor de la propiedad avanzar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvanzar() {
        return avanzar;
    }

    /**
     * Define el valor de la propiedad avanzar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvanzar(Boolean value) {
        this.avanzar = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClave(JAXBElement<String> value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntidad(JAXBElement<String> value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idioma.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdioma() {
        return idioma;
    }

    /**
     * Define el valor de la propiedad idioma.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdioma(JAXBElement<String> value) {
        this.idioma = value;
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
     * Obtiene el valor de la propiedad oficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOficina() {
        return oficina;
    }

    /**
     * Define el valor de la propiedad oficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOficina(JAXBElement<String> value) {
        this.oficina = value;
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
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad retroceder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetroceder() {
        return retroceder;
    }

    /**
     * Define el valor de la propiedad retroceder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetroceder(Boolean value) {
        this.retroceder = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoOperacion(JAXBElement<String> value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuario(JAXBElement<String> value) {
        this.usuario = value;
    }

}
