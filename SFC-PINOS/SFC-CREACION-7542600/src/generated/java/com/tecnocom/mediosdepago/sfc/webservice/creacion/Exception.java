
package com.tecnocom.mediosdepago.sfc.webservice.creacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Exception" type="{http://webservice.sfc.mediosdepago.tecnocom.com}Exception_Exception" minOccurs="0"/&gt;
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
    "exception"
})
@XmlRootElement(name = "Exception")
public class Exception {

    @XmlElementRef(name = "Exception", namespace = "http://webservice.sfc.mediosdepago.tecnocom.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ExceptionException> exception;

    /**
     * Obtiene el valor de la propiedad exception.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExceptionException }{@code >}
     *     
     */
    public JAXBElement<ExceptionException> getException() {
        return exception;
    }

    /**
     * Define el valor de la propiedad exception.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExceptionException }{@code >}
     *     
     */
    public void setException(JAXBElement<ExceptionException> value) {
        this.exception = value;
    }

}
