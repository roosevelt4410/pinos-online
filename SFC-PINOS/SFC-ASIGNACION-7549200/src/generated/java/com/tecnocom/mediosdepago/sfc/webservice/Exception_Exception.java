
package com.tecnocom.mediosdepago.sfc.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.1
 * 2023-07-16T14:51:17.509-05:00
 * Generated source version: 3.3.1
 */

@WebFault(name = "Exception", targetNamespace = "http://webservice.sfc.mediosdepago.tecnocom.com")
public class Exception_Exception extends java.lang.Exception {

    private com.tecnocom.mediosdepago.sfc.webservice.Exception exception;

    public Exception_Exception() {
        super();
    }

    public Exception_Exception(String message) {
        super(message);
    }

    public Exception_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, com.tecnocom.mediosdepago.sfc.webservice.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, com.tecnocom.mediosdepago.sfc.webservice.Exception exception, java.lang.Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public com.tecnocom.mediosdepago.sfc.webservice.Exception getFaultInfo() {
        return this.exception;
    }
}
