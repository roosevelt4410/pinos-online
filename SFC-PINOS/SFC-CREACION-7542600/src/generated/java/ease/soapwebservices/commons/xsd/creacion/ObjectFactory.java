
package ease.soapwebservices.commons.xsd.creacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ease.soapwebservices.commons.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EaseDateFormat_QNAME = new QName("http://commons.soapwebservices.ease/xsd", "format");
    private final static QName _EaseDateNombreDia_QNAME = new QName("http://commons.soapwebservices.ease/xsd", "nombreDia");
    private final static QName _EaseDateNombreMes_QNAME = new QName("http://commons.soapwebservices.ease/xsd", "nombreMes");
    private final static QName _EaseDateValueDate_QNAME = new QName("http://commons.soapwebservices.ease/xsd", "valueDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ease.soapwebservices.commons.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EaseDate }
     * 
     */
    public EaseDate createEaseDate() {
        return new EaseDate();
    }

    /**
     * Create an instance of {@link RegistroNewAge }
     * 
     */
    public RegistroNewAge createRegistroNewAge() {
        return new RegistroNewAge();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://commons.soapwebservices.ease/xsd", name = "format", scope = EaseDate.class)
    public JAXBElement<String> createEaseDateFormat(String value) {
        return new JAXBElement<String>(_EaseDateFormat_QNAME, String.class, EaseDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://commons.soapwebservices.ease/xsd", name = "nombreDia", scope = EaseDate.class)
    public JAXBElement<String> createEaseDateNombreDia(String value) {
        return new JAXBElement<String>(_EaseDateNombreDia_QNAME, String.class, EaseDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://commons.soapwebservices.ease/xsd", name = "nombreMes", scope = EaseDate.class)
    public JAXBElement<String> createEaseDateNombreMes(String value) {
        return new JAXBElement<String>(_EaseDateNombreMes_QNAME, String.class, EaseDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://commons.soapwebservices.ease/xsd", name = "valueDate", scope = EaseDate.class)
    public JAXBElement<String> createEaseDateValueDate(String value) {
        return new JAXBElement<String>(_EaseDateValueDate_QNAME, String.class, EaseDate.class, value);
    }

}
