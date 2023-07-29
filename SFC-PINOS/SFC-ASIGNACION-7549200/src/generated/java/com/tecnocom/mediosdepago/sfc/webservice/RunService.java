
package com.tecnocom.mediosdepago.sfc.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.PeticionP7549200WS;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msgEnvio" type="{http://webservice.sfc.mediosdepago.tecnocom.com/xsd}Peticion_P7549200WS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msgEnvio"
})
@XmlRootElement(name = "runService")
public class RunService {

    @XmlElementRef(name = "msgEnvio", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com", type = JAXBElement.class, required = false)
    protected JAXBElement<PeticionP7549200WS> msgEnvio;

    /**
     * Obtiene el valor de la propiedad msgEnvio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PeticionP7549200WS }{@code >}
     *     
     */
    public JAXBElement<PeticionP7549200WS> getMsgEnvio() {
        return msgEnvio;
    }

    /**
     * Define el valor de la propiedad msgEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PeticionP7549200WS }{@code >}
     *     
     */
    public void setMsgEnvio(JAXBElement<PeticionP7549200WS> value) {
        this.msgEnvio = value;
    }

}
