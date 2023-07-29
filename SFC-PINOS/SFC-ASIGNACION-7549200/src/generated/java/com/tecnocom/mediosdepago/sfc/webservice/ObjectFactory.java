
package com.tecnocom.mediosdepago.sfc.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.PeticionP7549200WS;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.RespuestaP7549200WS;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tecnocom.mediosdepago.sfc.webservice package. 
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

    private final static QName _ExceptionException_QNAME = new QName("http://webservice.sfc.mediosdepago.tecnocom.com", "Exception");
    private final static QName _RunServiceMsgEnvio_QNAME = new QName("http://webservice.sfc.mediosdepago.tecnocom.com", "msgEnvio");
    private final static QName _RunServiceResponseReturn_QNAME = new QName("http://webservice.sfc.mediosdepago.tecnocom.com", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tecnocom.mediosdepago.sfc.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link RunService }
     * 
     */
    public RunService createRunService() {
        return new RunService();
    }

    /**
     * Create an instance of {@link RunServiceResponse }
     * 
     */
    public RunServiceResponse createRunServiceResponse() {
        return new RunServiceResponse();
    }

    /**
     * Create an instance of {@link TestNametransaccionResponse }
     * 
     */
    public TestNametransaccionResponse createTestNametransaccionResponse() {
        return new TestNametransaccionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.sfc.mediosdepago.tecnocom.com", name = "Exception", scope = Exception.class)
    public JAXBElement<Object> createExceptionException(Object value) {
        return new JAXBElement<Object>(_ExceptionException_QNAME, Object.class, Exception.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionP7549200WS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PeticionP7549200WS }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.sfc.mediosdepago.tecnocom.com", name = "msgEnvio", scope = RunService.class)
    public JAXBElement<PeticionP7549200WS> createRunServiceMsgEnvio(PeticionP7549200WS value) {
        return new JAXBElement<PeticionP7549200WS>(_RunServiceMsgEnvio_QNAME, PeticionP7549200WS.class, RunService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaP7549200WS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaP7549200WS }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.sfc.mediosdepago.tecnocom.com", name = "return", scope = RunServiceResponse.class)
    public JAXBElement<RespuestaP7549200WS> createRunServiceResponseReturn(RespuestaP7549200WS value) {
        return new JAXBElement<RespuestaP7549200WS>(_RunServiceResponseReturn_QNAME, RespuestaP7549200WS.class, RunServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.sfc.mediosdepago.tecnocom.com", name = "return", scope = TestNametransaccionResponse.class)
    public JAXBElement<String> createTestNametransaccionResponseReturn(String value) {
        return new JAXBElement<String>(_RunServiceResponseReturn_QNAME, String.class, TestNametransaccionResponse.class, value);
    }

}
