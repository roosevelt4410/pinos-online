
package com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import ease.soapwebservices.commons.xsd.creacion.EaseDate;
import ease.soapwebservices.commons.xsd.creacion.RegistroNewAge;


/**
 * <p>Clase Java para Registro_P7542600WS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Registro_P7542600WS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://commons.soapwebservices.ease/xsd}RegistroNewAge"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cheqdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codprogr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codultex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descccue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desccent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desccpro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desctidc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domicili" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecblqac" type="{http://commons.soapwebservices.ease/xsd}EaseDate" minOccurs="0"/&gt;
 *         &lt;element name="fecblqrd" type="{http://commons.soapwebservices.ease/xsd}EaseDate" minOccurs="0"/&gt;
 *         &lt;element name="fechacti" type="{http://commons.soapwebservices.ease/xsd}EaseDate" minOccurs="0"/&gt;
 *         &lt;element name="fechalta" type="{http://commons.soapwebservices.ease/xsd}EaseDate" minOccurs="0"/&gt;
 *         &lt;element name="fechbaja" type="{http://commons.soapwebservices.ease/xsd}EaseDate" minOccurs="0"/&gt;
 *         &lt;element name="fecultex" type="{http://commons.soapwebservices.ease/xsd}EaseDate" minOccurs="0"/&gt;
 *         &lt;element name="idclient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indblqac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indblqrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obscuent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rnumcuen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sitactmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swdistin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="texblqac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texblqrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipidcli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpacumul" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tpanudef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tpcaduca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tpexcedi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tplibera" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tpretblo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tpretesp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tpretman" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registro_P7542600WS", propOrder = {
    "apellid1",
    "apellid2",
    "cheqdata",
    "codcuent",
    "codentid",
    "codprogr",
    "codultex",
    "descccue",
    "desccent",
    "desccpro",
    "desctidc",
    "domicili",
    "fecblqac",
    "fecblqrd",
    "fechacti",
    "fechalta",
    "fechbaja",
    "fecultex",
    "idclient",
    "indblqac",
    "indblqrd",
    "nombreid",
    "obscuent",
    "rnumcuen",
    "sitactmo",
    "swdistin",
    "texblqac",
    "texblqrd",
    "tipidcli",
    "tpacumul",
    "tpanudef",
    "tpcaduca",
    "tpexcedi",
    "tplibera",
    "tpretblo",
    "tpretesp",
    "tpretman"
})
public class RegistroP7542600WS
    extends RegistroNewAge
{

    @XmlElementRef(name = "apellid1", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellid1;
    @XmlElementRef(name = "apellid2", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellid2;
    @XmlElementRef(name = "cheqdata", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cheqdata;
    @XmlElementRef(name = "codcuent", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuent;
    @XmlElementRef(name = "codentid", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codentid;
    @XmlElementRef(name = "codprogr", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codprogr;
    protected Integer codultex;
    @XmlElementRef(name = "descccue", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descccue;
    @XmlElementRef(name = "desccent", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desccent;
    @XmlElementRef(name = "desccpro", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desccpro;
    @XmlElementRef(name = "desctidc", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desctidc;
    @XmlElementRef(name = "domicili", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicili;
    @XmlElementRef(name = "fecblqac", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EaseDate> fecblqac;
    @XmlElementRef(name = "fecblqrd", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EaseDate> fecblqrd;
    @XmlElementRef(name = "fechacti", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EaseDate> fechacti;
    @XmlElementRef(name = "fechalta", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EaseDate> fechalta;
    @XmlElementRef(name = "fechbaja", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EaseDate> fechbaja;
    @XmlElementRef(name = "fecultex", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EaseDate> fecultex;
    @XmlElementRef(name = "idclient", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclient;
    @XmlElementRef(name = "indblqac", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indblqac;
    @XmlElementRef(name = "indblqrd", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indblqrd;
    @XmlElementRef(name = "nombreid", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreid;
    @XmlElementRef(name = "obscuent", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obscuent;
    protected Integer rnumcuen;
    @XmlElementRef(name = "sitactmo", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sitactmo;
    protected Integer swdistin;
    @XmlElementRef(name = "texblqac", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texblqac;
    @XmlElementRef(name = "texblqrd", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texblqrd;
    @XmlElementRef(name = "tipidcli", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipidcli;
    protected Long tpacumul;
    protected Long tpanudef;
    protected Long tpcaduca;
    protected Long tpexcedi;
    protected Long tplibera;
    protected Long tpretblo;
    protected Long tpretesp;
    protected Long tpretman;

    /**
     * Obtiene el valor de la propiedad apellid1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellid1() {
        return apellid1;
    }

    /**
     * Define el valor de la propiedad apellid1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellid1(JAXBElement<String> value) {
        this.apellid1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellid2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellid2() {
        return apellid2;
    }

    /**
     * Define el valor de la propiedad apellid2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellid2(JAXBElement<String> value) {
        this.apellid2 = value;
    }

    /**
     * Obtiene el valor de la propiedad cheqdata.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheqdata() {
        return cheqdata;
    }

    /**
     * Define el valor de la propiedad cheqdata.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheqdata(JAXBElement<String> value) {
        this.cheqdata = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuent() {
        return codcuent;
    }

    /**
     * Define el valor de la propiedad codcuent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuent(JAXBElement<String> value) {
        this.codcuent = value;
    }

    /**
     * Obtiene el valor de la propiedad codentid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodentid() {
        return codentid;
    }

    /**
     * Define el valor de la propiedad codentid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodentid(JAXBElement<String> value) {
        this.codentid = value;
    }

    /**
     * Obtiene el valor de la propiedad codprogr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodprogr() {
        return codprogr;
    }

    /**
     * Define el valor de la propiedad codprogr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodprogr(JAXBElement<String> value) {
        this.codprogr = value;
    }

    /**
     * Obtiene el valor de la propiedad codultex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodultex() {
        return codultex;
    }

    /**
     * Define el valor de la propiedad codultex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodultex(Integer value) {
        this.codultex = value;
    }

    /**
     * Obtiene el valor de la propiedad descccue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescccue() {
        return descccue;
    }

    /**
     * Define el valor de la propiedad descccue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescccue(JAXBElement<String> value) {
        this.descccue = value;
    }

    /**
     * Obtiene el valor de la propiedad desccent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesccent() {
        return desccent;
    }

    /**
     * Define el valor de la propiedad desccent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesccent(JAXBElement<String> value) {
        this.desccent = value;
    }

    /**
     * Obtiene el valor de la propiedad desccpro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesccpro() {
        return desccpro;
    }

    /**
     * Define el valor de la propiedad desccpro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesccpro(JAXBElement<String> value) {
        this.desccpro = value;
    }

    /**
     * Obtiene el valor de la propiedad desctidc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesctidc() {
        return desctidc;
    }

    /**
     * Define el valor de la propiedad desctidc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesctidc(JAXBElement<String> value) {
        this.desctidc = value;
    }

    /**
     * Obtiene el valor de la propiedad domicili.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomicili() {
        return domicili;
    }

    /**
     * Define el valor de la propiedad domicili.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomicili(JAXBElement<String> value) {
        this.domicili = value;
    }

    /**
     * Obtiene el valor de la propiedad fecblqac.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public JAXBElement<EaseDate> getFecblqac() {
        return fecblqac;
    }

    /**
     * Define el valor de la propiedad fecblqac.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public void setFecblqac(JAXBElement<EaseDate> value) {
        this.fecblqac = value;
    }

    /**
     * Obtiene el valor de la propiedad fecblqrd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public JAXBElement<EaseDate> getFecblqrd() {
        return fecblqrd;
    }

    /**
     * Define el valor de la propiedad fecblqrd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public void setFecblqrd(JAXBElement<EaseDate> value) {
        this.fecblqrd = value;
    }

    /**
     * Obtiene el valor de la propiedad fechacti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public JAXBElement<EaseDate> getFechacti() {
        return fechacti;
    }

    /**
     * Define el valor de la propiedad fechacti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public void setFechacti(JAXBElement<EaseDate> value) {
        this.fechacti = value;
    }

    /**
     * Obtiene el valor de la propiedad fechalta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public JAXBElement<EaseDate> getFechalta() {
        return fechalta;
    }

    /**
     * Define el valor de la propiedad fechalta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public void setFechalta(JAXBElement<EaseDate> value) {
        this.fechalta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechbaja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public JAXBElement<EaseDate> getFechbaja() {
        return fechbaja;
    }

    /**
     * Define el valor de la propiedad fechbaja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public void setFechbaja(JAXBElement<EaseDate> value) {
        this.fechbaja = value;
    }

    /**
     * Obtiene el valor de la propiedad fecultex.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public JAXBElement<EaseDate> getFecultex() {
        return fecultex;
    }

    /**
     * Define el valor de la propiedad fecultex.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EaseDate }{@code >}
     *     
     */
    public void setFecultex(JAXBElement<EaseDate> value) {
        this.fecultex = value;
    }

    /**
     * Obtiene el valor de la propiedad idclient.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclient() {
        return idclient;
    }

    /**
     * Define el valor de la propiedad idclient.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclient(JAXBElement<String> value) {
        this.idclient = value;
    }

    /**
     * Obtiene el valor de la propiedad indblqac.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndblqac() {
        return indblqac;
    }

    /**
     * Define el valor de la propiedad indblqac.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndblqac(JAXBElement<String> value) {
        this.indblqac = value;
    }

    /**
     * Obtiene el valor de la propiedad indblqrd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndblqrd() {
        return indblqrd;
    }

    /**
     * Define el valor de la propiedad indblqrd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndblqrd(JAXBElement<String> value) {
        this.indblqrd = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreid() {
        return nombreid;
    }

    /**
     * Define el valor de la propiedad nombreid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreid(JAXBElement<String> value) {
        this.nombreid = value;
    }

    /**
     * Obtiene el valor de la propiedad obscuent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObscuent() {
        return obscuent;
    }

    /**
     * Define el valor de la propiedad obscuent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObscuent(JAXBElement<String> value) {
        this.obscuent = value;
    }

    /**
     * Obtiene el valor de la propiedad rnumcuen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRnumcuen() {
        return rnumcuen;
    }

    /**
     * Define el valor de la propiedad rnumcuen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRnumcuen(Integer value) {
        this.rnumcuen = value;
    }

    /**
     * Obtiene el valor de la propiedad sitactmo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSitactmo() {
        return sitactmo;
    }

    /**
     * Define el valor de la propiedad sitactmo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSitactmo(JAXBElement<String> value) {
        this.sitactmo = value;
    }

    /**
     * Obtiene el valor de la propiedad swdistin.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwdistin() {
        return swdistin;
    }

    /**
     * Define el valor de la propiedad swdistin.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwdistin(Integer value) {
        this.swdistin = value;
    }

    /**
     * Obtiene el valor de la propiedad texblqac.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexblqac() {
        return texblqac;
    }

    /**
     * Define el valor de la propiedad texblqac.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexblqac(JAXBElement<String> value) {
        this.texblqac = value;
    }

    /**
     * Obtiene el valor de la propiedad texblqrd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexblqrd() {
        return texblqrd;
    }

    /**
     * Define el valor de la propiedad texblqrd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexblqrd(JAXBElement<String> value) {
        this.texblqrd = value;
    }

    /**
     * Obtiene el valor de la propiedad tipidcli.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipidcli() {
        return tipidcli;
    }

    /**
     * Define el valor de la propiedad tipidcli.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipidcli(JAXBElement<String> value) {
        this.tipidcli = value;
    }

    /**
     * Obtiene el valor de la propiedad tpacumul.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpacumul() {
        return tpacumul;
    }

    /**
     * Define el valor de la propiedad tpacumul.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpacumul(Long value) {
        this.tpacumul = value;
    }

    /**
     * Obtiene el valor de la propiedad tpanudef.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpanudef() {
        return tpanudef;
    }

    /**
     * Define el valor de la propiedad tpanudef.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpanudef(Long value) {
        this.tpanudef = value;
    }

    /**
     * Obtiene el valor de la propiedad tpcaduca.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpcaduca() {
        return tpcaduca;
    }

    /**
     * Define el valor de la propiedad tpcaduca.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpcaduca(Long value) {
        this.tpcaduca = value;
    }

    /**
     * Obtiene el valor de la propiedad tpexcedi.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpexcedi() {
        return tpexcedi;
    }

    /**
     * Define el valor de la propiedad tpexcedi.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpexcedi(Long value) {
        this.tpexcedi = value;
    }

    /**
     * Obtiene el valor de la propiedad tplibera.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTplibera() {
        return tplibera;
    }

    /**
     * Define el valor de la propiedad tplibera.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTplibera(Long value) {
        this.tplibera = value;
    }

    /**
     * Obtiene el valor de la propiedad tpretblo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpretblo() {
        return tpretblo;
    }

    /**
     * Define el valor de la propiedad tpretblo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpretblo(Long value) {
        this.tpretblo = value;
    }

    /**
     * Obtiene el valor de la propiedad tpretesp.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpretesp() {
        return tpretesp;
    }

    /**
     * Define el valor de la propiedad tpretesp.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpretesp(Long value) {
        this.tpretesp = value;
    }

    /**
     * Obtiene el valor de la propiedad tpretman.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpretman() {
        return tpretman;
    }

    /**
     * Define el valor de la propiedad tpretman.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpretman(Long value) {
        this.tpretman = value;
    }

}
