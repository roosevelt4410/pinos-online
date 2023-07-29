
package com.tecnocom.mediosdepago.sfc.webservice.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ease.soapwebservices.sfcnewage.xsd.RespuestaNewAge;


/**
 * <p>Clase Java para Respuesta_P7549200WS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Respuesta_P7549200WS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://sfcNewAge.soapwebservices.ease/xsd}RespuestaNewAge"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registros_P7549200" type="{http://webservice.sfc.mediosdepago.tecnocom.com/xsd}Registro_P7549200WS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta_P7549200WS", propOrder = {
    "registrosP7549200"
})
public class RespuestaP7549200WS
    extends RespuestaNewAge
{

    @XmlElement(name = "registros_P7549200")
    protected List<RegistroP7549200WS> registrosP7549200;

    /**
     * Gets the value of the registrosP7549200 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrosP7549200 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrosP7549200().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroP7549200WS }
     * 
     * 
     */
    public List<RegistroP7549200WS> getRegistrosP7549200() {
        if (registrosP7549200 == null) {
            registrosP7549200 = new ArrayList<RegistroP7549200WS>();
        }
        return this.registrosP7549200;
    }

}
