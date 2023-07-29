
package ease.soapwebservices.commons.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.RegistroP7549200WS;


/**
 * <p>Clase Java para RegistroNewAge complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroNewAge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registro_Numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroNewAge",  propOrder = {
    "registroNumero"
})
@XmlSeeAlso({
    RegistroP7549200WS.class
})
public class RegistroNewAge {

    @XmlElement(name = "registro_Numero")
    protected Integer registroNumero;

    /**
     * Obtiene el valor de la propiedad registroNumero.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistroNumero() {
        return registroNumero;
    }

    /**
     * Define el valor de la propiedad registroNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistroNumero(Integer value) {
        this.registroNumero = value;
    }

}
