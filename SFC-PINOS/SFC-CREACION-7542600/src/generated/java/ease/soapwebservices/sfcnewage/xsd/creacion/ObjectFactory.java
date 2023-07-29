
package ease.soapwebservices.sfcnewage.xsd.creacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ease.soapwebservices.sfcnewage.xsd package. 
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

    private final static QName _RespuestaNewAgeClaveFin_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "claveFin");
    private final static QName _RespuestaNewAgeClaveInicio_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "claveInicio");
    private final static QName _RespuestaNewAgeDescRetorno_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "descRetorno");
    private final static QName _RespuestaNewAgeIndMasDatos_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "indMasDatos");
    private final static QName _RespuestaNewAgePantPagina_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "pantPagina");
    private final static QName _RespuestaNewAgeRetorno_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "retorno");
    private final static QName _RespuestaNewAgeTiempoEjecucion_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "tiempoEjecucion");
    private final static QName _PeticionNewAgeClave_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "clave");
    private final static QName _PeticionNewAgeEntidad_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "entidad");
    private final static QName _PeticionNewAgeIdioma_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "idioma");
    private final static QName _PeticionNewAgeOficina_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "oficina");
    private final static QName _PeticionNewAgePassword_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "password");
    private final static QName _PeticionNewAgeTipoOperacion_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "tipoOperacion");
    private final static QName _PeticionNewAgeUsuario_QNAME = new QName("http://sfcNewAge.soapwebservices.ease/xsd", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ease.soapwebservices.sfcnewage.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionNewAge }
     * 
     */
    public PeticionNewAge createPeticionNewAge() {
        return new PeticionNewAge();
    }

    /**
     * Create an instance of {@link RespuestaNewAge }
     * 
     */
    public RespuestaNewAge createRespuestaNewAge() {
        return new RespuestaNewAge();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "claveFin", scope = RespuestaNewAge.class)
    public JAXBElement<String> createRespuestaNewAgeClaveFin(String value) {
        return new JAXBElement<String>(_RespuestaNewAgeClaveFin_QNAME, String.class, RespuestaNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "claveInicio", scope = RespuestaNewAge.class)
    public JAXBElement<String> createRespuestaNewAgeClaveInicio(String value) {
        return new JAXBElement<String>(_RespuestaNewAgeClaveInicio_QNAME, String.class, RespuestaNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "descRetorno", scope = RespuestaNewAge.class)
    public JAXBElement<String> createRespuestaNewAgeDescRetorno(String value) {
        return new JAXBElement<String>(_RespuestaNewAgeDescRetorno_QNAME, String.class, RespuestaNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "indMasDatos", scope = RespuestaNewAge.class)
    public JAXBElement<String> createRespuestaNewAgeIndMasDatos(String value) {
        return new JAXBElement<String>(_RespuestaNewAgeIndMasDatos_QNAME, String.class, RespuestaNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "pantPagina", scope = RespuestaNewAge.class)
    public JAXBElement<String> createRespuestaNewAgePantPagina(String value) {
        return new JAXBElement<String>(_RespuestaNewAgePantPagina_QNAME, String.class, RespuestaNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "retorno", scope = RespuestaNewAge.class)
    public JAXBElement<String> createRespuestaNewAgeRetorno(String value) {
        return new JAXBElement<String>(_RespuestaNewAgeRetorno_QNAME, String.class, RespuestaNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "tiempoEjecucion", scope = RespuestaNewAge.class)
    public JAXBElement<String> createRespuestaNewAgeTiempoEjecucion(String value) {
        return new JAXBElement<String>(_RespuestaNewAgeTiempoEjecucion_QNAME, String.class, RespuestaNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "clave", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgeClave(String value) {
        return new JAXBElement<String>(_PeticionNewAgeClave_QNAME, String.class, PeticionNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "entidad", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgeEntidad(String value) {
        return new JAXBElement<String>(_PeticionNewAgeEntidad_QNAME, String.class, PeticionNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "idioma", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgeIdioma(String value) {
        return new JAXBElement<String>(_PeticionNewAgeIdioma_QNAME, String.class, PeticionNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "indMasDatos", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgeIndMasDatos(String value) {
        return new JAXBElement<String>(_RespuestaNewAgeIndMasDatos_QNAME, String.class, PeticionNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "oficina", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgeOficina(String value) {
        return new JAXBElement<String>(_PeticionNewAgeOficina_QNAME, String.class, PeticionNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "pantPagina", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgePantPagina(String value) {
        return new JAXBElement<String>(_RespuestaNewAgePantPagina_QNAME, String.class, PeticionNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "password", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgePassword(String value) {
        return new JAXBElement<String>(_PeticionNewAgePassword_QNAME, String.class, PeticionNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "tipoOperacion", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgeTipoOperacion(String value) {
        return new JAXBElement<String>(_PeticionNewAgeTipoOperacion_QNAME, String.class, PeticionNewAge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sfcNewAge.soapwebservices.ease/xsd", name = "usuario", scope = PeticionNewAge.class)
    public JAXBElement<String> createPeticionNewAgeUsuario(String value) {
        return new JAXBElement<String>(_PeticionNewAgeUsuario_QNAME, String.class, PeticionNewAge.class, value);
    }

}
