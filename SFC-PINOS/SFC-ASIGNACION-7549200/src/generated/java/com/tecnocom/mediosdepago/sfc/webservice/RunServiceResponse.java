
package com.tecnocom.mediosdepago.sfc.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.RespuestaP7549200WS;


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
 *         &lt;element name="return" type="{http://webservice.sfc.mediosdepago.tecnocom.com/xsd}Respuesta_P7549200WS" minOccurs="0"/&gt;
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
    "_return"
})
@XmlRootElement(name = "runServiceResponse")
public class RunServiceResponse {

    @XmlElementRef(name = "return", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com", type = JAXBElement.class, required = false)
    protected JAXBElement<RespuestaP7549200WS> _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RespuestaP7549200WS }{@code >}
     *     
     */
    public JAXBElement<RespuestaP7549200WS> getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RespuestaP7549200WS }{@code >}
     *     
     */
    public void setReturn(JAXBElement<RespuestaP7549200WS> value) {
        this._return = value;
    }

}
