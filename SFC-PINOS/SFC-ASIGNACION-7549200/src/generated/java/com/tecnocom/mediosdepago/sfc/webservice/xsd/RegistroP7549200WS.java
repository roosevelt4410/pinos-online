
package com.tecnocom.mediosdepago.sfc.webservice.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ease.soapwebservices.commons.xsd.RegistroNewAge;


/**
 * <p>Clase Java para Registro_P7549200WS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Registro_P7549200WS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://commons.soapwebservices.ease/xsd}RegistroNewAge"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cashpr10" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre1" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre2" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre3" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre4" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre5" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre6" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre7" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre8" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cashpre9" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="codaplic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcue10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcuen9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codevent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codhisto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codidmsj" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codrespu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codretor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codtermi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codusuar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datoseve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deserror" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="despro10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desprog9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclie10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idclien9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idrepeti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idsentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idtransa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idtraori" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longmens" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numpgeva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsol10" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numsoli9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ptosor10" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori7" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosori9" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosre10" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred7" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ptosred9" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="texto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="texto9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timetran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopu10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopun9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopunt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tiptrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totcashp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="totptoor" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="totptore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registro_P7549200WS", propOrder = {
    "cashpr10",
    "cashpre1",
    "cashpre2",
    "cashpre3",
    "cashpre4",
    "cashpre5",
    "cashpre6",
    "cashpre7",
    "cashpre8",
    "cashpre9",
    "codaplic",
    "codcue10",
    "codcuen1",
    "codcuen2",
    "codcuen3",
    "codcuen4",
    "codcuen5",
    "codcuen6",
    "codcuen7",
    "codcuen8",
    "codcuen9",
    "codentid",
    "codevent",
    "codhisto",
    "codidmsj",
    "codrespu",
    "codretor",
    "codtermi",
    "codusuar",
    "datoseve",
    "deserror",
    "despro10",
    "desprog1",
    "desprog2",
    "desprog3",
    "desprog4",
    "desprog5",
    "desprog6",
    "desprog7",
    "desprog8",
    "desprog9",
    "idclie10",
    "idclien1",
    "idclien2",
    "idclien3",
    "idclien4",
    "idclien5",
    "idclien6",
    "idclien7",
    "idclien8",
    "idclien9",
    "idrepeti",
    "idsentid",
    "idtransa",
    "idtraori",
    "longmens",
    "numpgeva",
    "numsol10",
    "numsoli1",
    "numsoli2",
    "numsoli3",
    "numsoli4",
    "numsoli5",
    "numsoli6",
    "numsoli7",
    "numsoli8",
    "numsoli9",
    "ptosor10",
    "ptosori1",
    "ptosori2",
    "ptosori3",
    "ptosori4",
    "ptosori5",
    "ptosori6",
    "ptosori7",
    "ptosori8",
    "ptosori9",
    "ptosre10",
    "ptosred1",
    "ptosred2",
    "ptosred3",
    "ptosred4",
    "ptosred5",
    "ptosred6",
    "ptosred7",
    "ptosred8",
    "ptosred9",
    "texto1",
    "texto10",
    "texto2",
    "texto3",
    "texto4",
    "texto5",
    "texto6",
    "texto7",
    "texto8",
    "texto9",
    "timetran",
    "tipopu10",
    "tipopun1",
    "tipopun2",
    "tipopun3",
    "tipopun4",
    "tipopun5",
    "tipopun6",
    "tipopun7",
    "tipopun8",
    "tipopun9",
    "tipopunt",
    "tiptrans",
    "totcashp",
    "totptoor",
    "totptore"
})
public class RegistroP7549200WS
    extends RegistroNewAge
{

    protected Float cashpr10;
    protected Float cashpre1;
    protected Float cashpre2;
    protected Float cashpre3;
    protected Float cashpre4;
    protected Float cashpre5;
    protected Float cashpre6;
    protected Float cashpre7;
    protected Float cashpre8;
    protected Float cashpre9;
    @XmlElementRef(name = "codaplic", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codaplic;
    @XmlElementRef(name = "codcue10", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcue10;
    @XmlElementRef(name = "codcuen1", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen1;
    @XmlElementRef(name = "codcuen2", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen2;
    @XmlElementRef(name = "codcuen3", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen3;
    @XmlElementRef(name = "codcuen4", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen4;
    @XmlElementRef(name = "codcuen5", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen5;
    @XmlElementRef(name = "codcuen6", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen6;
    @XmlElementRef(name = "codcuen7", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen7;
    @XmlElementRef(name = "codcuen8", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen8;
    @XmlElementRef(name = "codcuen9", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codcuen9;
    @XmlElementRef(name = "codentid", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codentid;
    @XmlElementRef(name = "codevent", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codevent;
    protected Long codhisto;
    protected Integer codidmsj;
    @XmlElementRef(name = "codrespu", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codrespu;
    @XmlElementRef(name = "codretor", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codretor;
    @XmlElementRef(name = "codtermi", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codtermi;
    @XmlElementRef(name = "codusuar", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codusuar;
    @XmlElementRef(name = "datoseve", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datoseve;
    @XmlElementRef(name = "deserror", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deserror;
    @XmlElementRef(name = "despro10", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> despro10;
    @XmlElementRef(name = "desprog1", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog1;
    @XmlElementRef(name = "desprog2", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog2;
    @XmlElementRef(name = "desprog3", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog3;
    @XmlElementRef(name = "desprog4", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog4;
    @XmlElementRef(name = "desprog5", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog5;
    @XmlElementRef(name = "desprog6", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog6;
    @XmlElementRef(name = "desprog7", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog7;
    @XmlElementRef(name = "desprog8", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog8;
    @XmlElementRef(name = "desprog9", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desprog9;
    @XmlElementRef(name = "idclie10", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclie10;
    @XmlElementRef(name = "idclien1", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien1;
    @XmlElementRef(name = "idclien2", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien2;
    @XmlElementRef(name = "idclien3", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien3;
    @XmlElementRef(name = "idclien4", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien4;
    @XmlElementRef(name = "idclien5", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien5;
    @XmlElementRef(name = "idclien6", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien6;
    @XmlElementRef(name = "idclien7", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien7;
    @XmlElementRef(name = "idclien8", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien8;
    @XmlElementRef(name = "idclien9", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idclien9;
    protected Integer idrepeti;
    @XmlElementRef(name = "idsentid", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idsentid;
    @XmlElementRef(name = "idtransa", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idtransa;
    @XmlElementRef(name = "idtraori", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idtraori;
    protected Integer longmens;
    protected Integer numpgeva;
    protected Integer numsol10;
    protected Integer numsoli1;
    protected Integer numsoli2;
    protected Integer numsoli3;
    protected Integer numsoli4;
    protected Integer numsoli5;
    protected Integer numsoli6;
    protected Integer numsoli7;
    protected Integer numsoli8;
    protected Integer numsoli9;
    protected Long ptosor10;
    protected Long ptosori1;
    protected Long ptosori2;
    protected Long ptosori3;
    protected Long ptosori4;
    protected Long ptosori5;
    protected Long ptosori6;
    protected Long ptosori7;
    protected Long ptosori8;
    protected Long ptosori9;
    protected Long ptosre10;
    protected Long ptosred1;
    protected Long ptosred2;
    protected Long ptosred3;
    protected Long ptosred4;
    protected Long ptosred5;
    protected Long ptosred6;
    protected Long ptosred7;
    protected Long ptosred8;
    protected Long ptosred9;
    @XmlElementRef(name = "texto1", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto1;
    @XmlElementRef(name = "texto10", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto10;
    @XmlElementRef(name = "texto2", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto2;
    @XmlElementRef(name = "texto3", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto3;
    @XmlElementRef(name = "texto4", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto4;
    @XmlElementRef(name = "texto5", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto5;
    @XmlElementRef(name = "texto6", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto6;
    @XmlElementRef(name = "texto7", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto7;
    @XmlElementRef(name = "texto8", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto8;
    @XmlElementRef(name = "texto9", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto9;
    @XmlElementRef(name = "timetran", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timetran;
    @XmlElementRef(name = "tipopu10", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopu10;
    @XmlElementRef(name = "tipopun1", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun1;
    @XmlElementRef(name = "tipopun2", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun2;
    @XmlElementRef(name = "tipopun3", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun3;
    @XmlElementRef(name = "tipopun4", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun4;
    @XmlElementRef(name = "tipopun5", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun5;
    @XmlElementRef(name = "tipopun6", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun6;
    @XmlElementRef(name = "tipopun7", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun7;
    @XmlElementRef(name = "tipopun8", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun8;
    @XmlElementRef(name = "tipopun9", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopun9;
    @XmlElementRef(name = "tipopunt", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipopunt;
    @XmlElementRef(name = "tiptrans", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tiptrans;
    protected Float totcashp;
    protected Long totptoor;
    protected Long totptore;

    /**
     * Obtiene el valor de la propiedad cashpr10.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpr10() {
        return cashpr10;
    }

    /**
     * Define el valor de la propiedad cashpr10.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpr10(Float value) {
        this.cashpr10 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre1.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre1() {
        return cashpre1;
    }

    /**
     * Define el valor de la propiedad cashpre1.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre1(Float value) {
        this.cashpre1 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre2.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre2() {
        return cashpre2;
    }

    /**
     * Define el valor de la propiedad cashpre2.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre2(Float value) {
        this.cashpre2 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre3.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre3() {
        return cashpre3;
    }

    /**
     * Define el valor de la propiedad cashpre3.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre3(Float value) {
        this.cashpre3 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre4.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre4() {
        return cashpre4;
    }

    /**
     * Define el valor de la propiedad cashpre4.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre4(Float value) {
        this.cashpre4 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre5.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre5() {
        return cashpre5;
    }

    /**
     * Define el valor de la propiedad cashpre5.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre5(Float value) {
        this.cashpre5 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre6.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre6() {
        return cashpre6;
    }

    /**
     * Define el valor de la propiedad cashpre6.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre6(Float value) {
        this.cashpre6 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre7.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre7() {
        return cashpre7;
    }

    /**
     * Define el valor de la propiedad cashpre7.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre7(Float value) {
        this.cashpre7 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre8.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre8() {
        return cashpre8;
    }

    /**
     * Define el valor de la propiedad cashpre8.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre8(Float value) {
        this.cashpre8 = value;
    }

    /**
     * Obtiene el valor de la propiedad cashpre9.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashpre9() {
        return cashpre9;
    }

    /**
     * Define el valor de la propiedad cashpre9.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashpre9(Float value) {
        this.cashpre9 = value;
    }

    /**
     * Obtiene el valor de la propiedad codaplic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodaplic() {
        return codaplic;
    }

    /**
     * Define el valor de la propiedad codaplic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodaplic(JAXBElement<String> value) {
        this.codaplic = value;
    }

    /**
     * Obtiene el valor de la propiedad codcue10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcue10() {
        return codcue10;
    }

    /**
     * Define el valor de la propiedad codcue10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcue10(JAXBElement<String> value) {
        this.codcue10 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen1() {
        return codcuen1;
    }

    /**
     * Define el valor de la propiedad codcuen1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen1(JAXBElement<String> value) {
        this.codcuen1 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen2() {
        return codcuen2;
    }

    /**
     * Define el valor de la propiedad codcuen2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen2(JAXBElement<String> value) {
        this.codcuen2 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen3() {
        return codcuen3;
    }

    /**
     * Define el valor de la propiedad codcuen3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen3(JAXBElement<String> value) {
        this.codcuen3 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen4() {
        return codcuen4;
    }

    /**
     * Define el valor de la propiedad codcuen4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen4(JAXBElement<String> value) {
        this.codcuen4 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen5() {
        return codcuen5;
    }

    /**
     * Define el valor de la propiedad codcuen5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen5(JAXBElement<String> value) {
        this.codcuen5 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen6() {
        return codcuen6;
    }

    /**
     * Define el valor de la propiedad codcuen6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen6(JAXBElement<String> value) {
        this.codcuen6 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen7() {
        return codcuen7;
    }

    /**
     * Define el valor de la propiedad codcuen7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen7(JAXBElement<String> value) {
        this.codcuen7 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen8() {
        return codcuen8;
    }

    /**
     * Define el valor de la propiedad codcuen8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen8(JAXBElement<String> value) {
        this.codcuen8 = value;
    }

    /**
     * Obtiene el valor de la propiedad codcuen9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodcuen9() {
        return codcuen9;
    }

    /**
     * Define el valor de la propiedad codcuen9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodcuen9(JAXBElement<String> value) {
        this.codcuen9 = value;
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
     * Obtiene el valor de la propiedad codevent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodevent() {
        return codevent;
    }

    /**
     * Define el valor de la propiedad codevent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodevent(JAXBElement<String> value) {
        this.codevent = value;
    }

    /**
     * Obtiene el valor de la propiedad codhisto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodhisto() {
        return codhisto;
    }

    /**
     * Define el valor de la propiedad codhisto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodhisto(Long value) {
        this.codhisto = value;
    }

    /**
     * Obtiene el valor de la propiedad codidmsj.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodidmsj() {
        return codidmsj;
    }

    /**
     * Define el valor de la propiedad codidmsj.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodidmsj(Integer value) {
        this.codidmsj = value;
    }

    /**
     * Obtiene el valor de la propiedad codrespu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodrespu() {
        return codrespu;
    }

    /**
     * Define el valor de la propiedad codrespu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodrespu(JAXBElement<String> value) {
        this.codrespu = value;
    }

    /**
     * Obtiene el valor de la propiedad codretor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodretor() {
        return codretor;
    }

    /**
     * Define el valor de la propiedad codretor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodretor(JAXBElement<String> value) {
        this.codretor = value;
    }

    /**
     * Obtiene el valor de la propiedad codtermi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodtermi() {
        return codtermi;
    }

    /**
     * Define el valor de la propiedad codtermi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodtermi(JAXBElement<String> value) {
        this.codtermi = value;
    }

    /**
     * Obtiene el valor de la propiedad codusuar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodusuar() {
        return codusuar;
    }

    /**
     * Define el valor de la propiedad codusuar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodusuar(JAXBElement<String> value) {
        this.codusuar = value;
    }

    /**
     * Obtiene el valor de la propiedad datoseve.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatoseve() {
        return datoseve;
    }

    /**
     * Define el valor de la propiedad datoseve.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatoseve(JAXBElement<String> value) {
        this.datoseve = value;
    }

    /**
     * Obtiene el valor de la propiedad deserror.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeserror() {
        return deserror;
    }

    /**
     * Define el valor de la propiedad deserror.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeserror(JAXBElement<String> value) {
        this.deserror = value;
    }

    /**
     * Obtiene el valor de la propiedad despro10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDespro10() {
        return despro10;
    }

    /**
     * Define el valor de la propiedad despro10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDespro10(JAXBElement<String> value) {
        this.despro10 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog1() {
        return desprog1;
    }

    /**
     * Define el valor de la propiedad desprog1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog1(JAXBElement<String> value) {
        this.desprog1 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog2() {
        return desprog2;
    }

    /**
     * Define el valor de la propiedad desprog2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog2(JAXBElement<String> value) {
        this.desprog2 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog3() {
        return desprog3;
    }

    /**
     * Define el valor de la propiedad desprog3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog3(JAXBElement<String> value) {
        this.desprog3 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog4() {
        return desprog4;
    }

    /**
     * Define el valor de la propiedad desprog4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog4(JAXBElement<String> value) {
        this.desprog4 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog5() {
        return desprog5;
    }

    /**
     * Define el valor de la propiedad desprog5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog5(JAXBElement<String> value) {
        this.desprog5 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog6() {
        return desprog6;
    }

    /**
     * Define el valor de la propiedad desprog6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog6(JAXBElement<String> value) {
        this.desprog6 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog7() {
        return desprog7;
    }

    /**
     * Define el valor de la propiedad desprog7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog7(JAXBElement<String> value) {
        this.desprog7 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog8() {
        return desprog8;
    }

    /**
     * Define el valor de la propiedad desprog8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog8(JAXBElement<String> value) {
        this.desprog8 = value;
    }

    /**
     * Obtiene el valor de la propiedad desprog9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesprog9() {
        return desprog9;
    }

    /**
     * Define el valor de la propiedad desprog9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesprog9(JAXBElement<String> value) {
        this.desprog9 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclie10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclie10() {
        return idclie10;
    }

    /**
     * Define el valor de la propiedad idclie10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclie10(JAXBElement<String> value) {
        this.idclie10 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien1() {
        return idclien1;
    }

    /**
     * Define el valor de la propiedad idclien1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien1(JAXBElement<String> value) {
        this.idclien1 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien2() {
        return idclien2;
    }

    /**
     * Define el valor de la propiedad idclien2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien2(JAXBElement<String> value) {
        this.idclien2 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien3() {
        return idclien3;
    }

    /**
     * Define el valor de la propiedad idclien3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien3(JAXBElement<String> value) {
        this.idclien3 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien4() {
        return idclien4;
    }

    /**
     * Define el valor de la propiedad idclien4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien4(JAXBElement<String> value) {
        this.idclien4 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien5() {
        return idclien5;
    }

    /**
     * Define el valor de la propiedad idclien5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien5(JAXBElement<String> value) {
        this.idclien5 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien6() {
        return idclien6;
    }

    /**
     * Define el valor de la propiedad idclien6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien6(JAXBElement<String> value) {
        this.idclien6 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien7() {
        return idclien7;
    }

    /**
     * Define el valor de la propiedad idclien7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien7(JAXBElement<String> value) {
        this.idclien7 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien8() {
        return idclien8;
    }

    /**
     * Define el valor de la propiedad idclien8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien8(JAXBElement<String> value) {
        this.idclien8 = value;
    }

    /**
     * Obtiene el valor de la propiedad idclien9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdclien9() {
        return idclien9;
    }

    /**
     * Define el valor de la propiedad idclien9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdclien9(JAXBElement<String> value) {
        this.idclien9 = value;
    }

    /**
     * Obtiene el valor de la propiedad idrepeti.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdrepeti() {
        return idrepeti;
    }

    /**
     * Define el valor de la propiedad idrepeti.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdrepeti(Integer value) {
        this.idrepeti = value;
    }

    /**
     * Obtiene el valor de la propiedad idsentid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdsentid() {
        return idsentid;
    }

    /**
     * Define el valor de la propiedad idsentid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdsentid(JAXBElement<String> value) {
        this.idsentid = value;
    }

    /**
     * Obtiene el valor de la propiedad idtransa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdtransa() {
        return idtransa;
    }

    /**
     * Define el valor de la propiedad idtransa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdtransa(JAXBElement<String> value) {
        this.idtransa = value;
    }

    /**
     * Obtiene el valor de la propiedad idtraori.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdtraori() {
        return idtraori;
    }

    /**
     * Define el valor de la propiedad idtraori.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdtraori(JAXBElement<String> value) {
        this.idtraori = value;
    }

    /**
     * Obtiene el valor de la propiedad longmens.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongmens() {
        return longmens;
    }

    /**
     * Define el valor de la propiedad longmens.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongmens(Integer value) {
        this.longmens = value;
    }

    /**
     * Obtiene el valor de la propiedad numpgeva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumpgeva() {
        return numpgeva;
    }

    /**
     * Define el valor de la propiedad numpgeva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumpgeva(Integer value) {
        this.numpgeva = value;
    }

    /**
     * Obtiene el valor de la propiedad numsol10.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsol10() {
        return numsol10;
    }

    /**
     * Define el valor de la propiedad numsol10.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsol10(Integer value) {
        this.numsol10 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli1() {
        return numsoli1;
    }

    /**
     * Define el valor de la propiedad numsoli1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli1(Integer value) {
        this.numsoli1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli2() {
        return numsoli2;
    }

    /**
     * Define el valor de la propiedad numsoli2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli2(Integer value) {
        this.numsoli2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli3() {
        return numsoli3;
    }

    /**
     * Define el valor de la propiedad numsoli3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli3(Integer value) {
        this.numsoli3 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli4.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli4() {
        return numsoli4;
    }

    /**
     * Define el valor de la propiedad numsoli4.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli4(Integer value) {
        this.numsoli4 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli5.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli5() {
        return numsoli5;
    }

    /**
     * Define el valor de la propiedad numsoli5.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli5(Integer value) {
        this.numsoli5 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli6.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli6() {
        return numsoli6;
    }

    /**
     * Define el valor de la propiedad numsoli6.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli6(Integer value) {
        this.numsoli6 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli7.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli7() {
        return numsoli7;
    }

    /**
     * Define el valor de la propiedad numsoli7.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli7(Integer value) {
        this.numsoli7 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli8.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli8() {
        return numsoli8;
    }

    /**
     * Define el valor de la propiedad numsoli8.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli8(Integer value) {
        this.numsoli8 = value;
    }

    /**
     * Obtiene el valor de la propiedad numsoli9.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumsoli9() {
        return numsoli9;
    }

    /**
     * Define el valor de la propiedad numsoli9.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumsoli9(Integer value) {
        this.numsoli9 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosor10.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosor10() {
        return ptosor10;
    }

    /**
     * Define el valor de la propiedad ptosor10.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosor10(Long value) {
        this.ptosor10 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori1() {
        return ptosori1;
    }

    /**
     * Define el valor de la propiedad ptosori1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori1(Long value) {
        this.ptosori1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori2.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori2() {
        return ptosori2;
    }

    /**
     * Define el valor de la propiedad ptosori2.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori2(Long value) {
        this.ptosori2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori3.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori3() {
        return ptosori3;
    }

    /**
     * Define el valor de la propiedad ptosori3.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori3(Long value) {
        this.ptosori3 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori4.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori4() {
        return ptosori4;
    }

    /**
     * Define el valor de la propiedad ptosori4.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori4(Long value) {
        this.ptosori4 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori5.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori5() {
        return ptosori5;
    }

    /**
     * Define el valor de la propiedad ptosori5.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori5(Long value) {
        this.ptosori5 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori6.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori6() {
        return ptosori6;
    }

    /**
     * Define el valor de la propiedad ptosori6.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori6(Long value) {
        this.ptosori6 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori7.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori7() {
        return ptosori7;
    }

    /**
     * Define el valor de la propiedad ptosori7.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori7(Long value) {
        this.ptosori7 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori8.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori8() {
        return ptosori8;
    }

    /**
     * Define el valor de la propiedad ptosori8.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori8(Long value) {
        this.ptosori8 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosori9.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosori9() {
        return ptosori9;
    }

    /**
     * Define el valor de la propiedad ptosori9.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosori9(Long value) {
        this.ptosori9 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosre10.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosre10() {
        return ptosre10;
    }

    /**
     * Define el valor de la propiedad ptosre10.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosre10(Long value) {
        this.ptosre10 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred1() {
        return ptosred1;
    }

    /**
     * Define el valor de la propiedad ptosred1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred1(Long value) {
        this.ptosred1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred2.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred2() {
        return ptosred2;
    }

    /**
     * Define el valor de la propiedad ptosred2.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred2(Long value) {
        this.ptosred2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred3.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred3() {
        return ptosred3;
    }

    /**
     * Define el valor de la propiedad ptosred3.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred3(Long value) {
        this.ptosred3 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred4.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred4() {
        return ptosred4;
    }

    /**
     * Define el valor de la propiedad ptosred4.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred4(Long value) {
        this.ptosred4 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred5.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred5() {
        return ptosred5;
    }

    /**
     * Define el valor de la propiedad ptosred5.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred5(Long value) {
        this.ptosred5 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred6.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred6() {
        return ptosred6;
    }

    /**
     * Define el valor de la propiedad ptosred6.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred6(Long value) {
        this.ptosred6 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred7.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred7() {
        return ptosred7;
    }

    /**
     * Define el valor de la propiedad ptosred7.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred7(Long value) {
        this.ptosred7 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred8.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred8() {
        return ptosred8;
    }

    /**
     * Define el valor de la propiedad ptosred8.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred8(Long value) {
        this.ptosred8 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptosred9.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtosred9() {
        return ptosred9;
    }

    /**
     * Define el valor de la propiedad ptosred9.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtosred9(Long value) {
        this.ptosred9 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto1() {
        return texto1;
    }

    /**
     * Define el valor de la propiedad texto1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto1(JAXBElement<String> value) {
        this.texto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto10() {
        return texto10;
    }

    /**
     * Define el valor de la propiedad texto10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto10(JAXBElement<String> value) {
        this.texto10 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto2() {
        return texto2;
    }

    /**
     * Define el valor de la propiedad texto2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto2(JAXBElement<String> value) {
        this.texto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto3() {
        return texto3;
    }

    /**
     * Define el valor de la propiedad texto3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto3(JAXBElement<String> value) {
        this.texto3 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto4() {
        return texto4;
    }

    /**
     * Define el valor de la propiedad texto4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto4(JAXBElement<String> value) {
        this.texto4 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto5() {
        return texto5;
    }

    /**
     * Define el valor de la propiedad texto5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto5(JAXBElement<String> value) {
        this.texto5 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto6() {
        return texto6;
    }

    /**
     * Define el valor de la propiedad texto6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto6(JAXBElement<String> value) {
        this.texto6 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto7() {
        return texto7;
    }

    /**
     * Define el valor de la propiedad texto7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto7(JAXBElement<String> value) {
        this.texto7 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto8() {
        return texto8;
    }

    /**
     * Define el valor de la propiedad texto8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto8(JAXBElement<String> value) {
        this.texto8 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto9() {
        return texto9;
    }

    /**
     * Define el valor de la propiedad texto9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto9(JAXBElement<String> value) {
        this.texto9 = value;
    }

    /**
     * Obtiene el valor de la propiedad timetran.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimetran() {
        return timetran;
    }

    /**
     * Define el valor de la propiedad timetran.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimetran(JAXBElement<String> value) {
        this.timetran = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopu10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopu10() {
        return tipopu10;
    }

    /**
     * Define el valor de la propiedad tipopu10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopu10(JAXBElement<String> value) {
        this.tipopu10 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun1() {
        return tipopun1;
    }

    /**
     * Define el valor de la propiedad tipopun1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun1(JAXBElement<String> value) {
        this.tipopun1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun2() {
        return tipopun2;
    }

    /**
     * Define el valor de la propiedad tipopun2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun2(JAXBElement<String> value) {
        this.tipopun2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun3() {
        return tipopun3;
    }

    /**
     * Define el valor de la propiedad tipopun3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun3(JAXBElement<String> value) {
        this.tipopun3 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun4() {
        return tipopun4;
    }

    /**
     * Define el valor de la propiedad tipopun4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun4(JAXBElement<String> value) {
        this.tipopun4 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun5() {
        return tipopun5;
    }

    /**
     * Define el valor de la propiedad tipopun5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun5(JAXBElement<String> value) {
        this.tipopun5 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun6() {
        return tipopun6;
    }

    /**
     * Define el valor de la propiedad tipopun6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun6(JAXBElement<String> value) {
        this.tipopun6 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun7() {
        return tipopun7;
    }

    /**
     * Define el valor de la propiedad tipopun7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun7(JAXBElement<String> value) {
        this.tipopun7 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun8() {
        return tipopun8;
    }

    /**
     * Define el valor de la propiedad tipopun8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun8(JAXBElement<String> value) {
        this.tipopun8 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopun9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopun9() {
        return tipopun9;
    }

    /**
     * Define el valor de la propiedad tipopun9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopun9(JAXBElement<String> value) {
        this.tipopun9 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopunt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipopunt() {
        return tipopunt;
    }

    /**
     * Define el valor de la propiedad tipopunt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipopunt(JAXBElement<String> value) {
        this.tipopunt = value;
    }

    /**
     * Obtiene el valor de la propiedad tiptrans.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTiptrans() {
        return tiptrans;
    }

    /**
     * Define el valor de la propiedad tiptrans.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTiptrans(JAXBElement<String> value) {
        this.tiptrans = value;
    }

    /**
     * Obtiene el valor de la propiedad totcashp.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotcashp() {
        return totcashp;
    }

    /**
     * Define el valor de la propiedad totcashp.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotcashp(Float value) {
        this.totcashp = value;
    }

    /**
     * Obtiene el valor de la propiedad totptoor.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotptoor() {
        return totptoor;
    }

    /**
     * Define el valor de la propiedad totptoor.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotptoor(Long value) {
        this.totptoor = value;
    }

    /**
     * Obtiene el valor de la propiedad totptore.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotptore() {
        return totptore;
    }

    /**
     * Define el valor de la propiedad totptore.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotptore(Long value) {
        this.totptore = value;
    }

}
