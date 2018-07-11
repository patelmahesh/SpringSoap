
package com.panthera.student_ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StudentsPortService", targetNamespace = "http://www.panthera.com/student-ws", wsdlLocation = "file:/C:/Users/Administrator/Desktop/students.wsdl")
public class StudentsPortService
    extends Service
{

    private final static URL STUDENTSPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTSPORTSERVICE_EXCEPTION;
    private final static QName STUDENTSPORTSERVICE_QNAME = new QName("http://www.panthera.com/student-ws", "StudentsPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Administrator/Desktop/students.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTSPORTSERVICE_WSDL_LOCATION = url;
        STUDENTSPORTSERVICE_EXCEPTION = e;
    }

    public StudentsPortService() {
        super(__getWsdlLocation(), STUDENTSPORTSERVICE_QNAME);
    }

    public StudentsPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTSPORTSERVICE_QNAME, features);
    }

    public StudentsPortService(URL wsdlLocation) {
        super(wsdlLocation, STUDENTSPORTSERVICE_QNAME);
    }

    public StudentsPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTSPORTSERVICE_QNAME, features);
    }

    public StudentsPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentsPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentsPort
     */
    @WebEndpoint(name = "StudentsPortSoap11")
    public StudentsPort getStudentsPortSoap11() {
        return super.getPort(new QName("http://www.panthera.com/student-ws", "StudentsPortSoap11"), StudentsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentsPort
     */
    @WebEndpoint(name = "StudentsPortSoap11")
    public StudentsPort getStudentsPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.panthera.com/student-ws", "StudentsPortSoap11"), StudentsPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTSPORTSERVICE_EXCEPTION!= null) {
            throw STUDENTSPORTSERVICE_EXCEPTION;
        }
        return STUDENTSPORTSERVICE_WSDL_LOCATION;
    }

}