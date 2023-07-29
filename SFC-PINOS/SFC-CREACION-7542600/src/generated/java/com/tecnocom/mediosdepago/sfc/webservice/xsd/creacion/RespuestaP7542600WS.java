
package com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ease.soapwebservices.sfcnewage.xsd.creacion.RespuestaNewAge;


/**
 * <p>Clase Java para Respuesta_P7542600WS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Respuesta_P7542600WS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://sfcNewAge.soapwebservices.ease/xsd}RespuestaNewAge"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registros_P7542600" type="{http://webservice.sfc.mediosdepago.tecnocom.com/xsd}Registro_P7542600WS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta_P7542600WS", propOrder = {
    "registrosP7542600"
})
public class RespuestaP7542600WS
    extends RespuestaNewAge
{

    @XmlElement(name = "registros_P7542600")
    protected List<RegistroP7542600WS> registrosP7542600;

    /**
     * Gets the value of the registrosP7542600 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrosP7542600 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrosP7542600().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroP7542600WS }
     * 
     * 
     */
    public List<RegistroP7542600WS> getRegistrosP7542600() {
        if (registrosP7542600 == null) {
            registrosP7542600 = new ArrayList<RegistroP7542600WS>();
        }
        return this.registrosP7542600;
    }

}
