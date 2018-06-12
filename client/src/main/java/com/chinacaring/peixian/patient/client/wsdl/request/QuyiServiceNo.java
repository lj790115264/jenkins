
package com.chinacaring.peixian.patient.client.wsdl.request;

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
@WebServiceClient(name = "quyiServiceNo", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://172.17.10.236/quyiServiceTest/quyiServiceNo.asmx?wsdl")
public class QuyiServiceNo
    extends Service
{

    private final static URL QUYISERVICENO_WSDL_LOCATION;
    private final static WebServiceException QUYISERVICENO_EXCEPTION;
    private final static QName QUYISERVICENO_QNAME = new QName("http://tempuri.org/", "quyiServiceNo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.17.10.236/quyiServiceTest/quyiServiceNo.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        QUYISERVICENO_WSDL_LOCATION = url;
        QUYISERVICENO_EXCEPTION = e;
    }

    public QuyiServiceNo() {
        super(__getWsdlLocation(), QUYISERVICENO_QNAME);
    }

    public QuyiServiceNo(WebServiceFeature... features) {
        super(__getWsdlLocation(), QUYISERVICENO_QNAME, features);
    }

    public QuyiServiceNo(URL wsdlLocation) {
        super(wsdlLocation, QUYISERVICENO_QNAME);
    }

    public QuyiServiceNo(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, QUYISERVICENO_QNAME, features);
    }

    public QuyiServiceNo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QuyiServiceNo(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QuyiServiceNoSoap
     */
    @WebEndpoint(name = "quyiServiceNoSoap")
    public QuyiServiceNoSoap getQuyiServiceNoSoap() {
        return super.getPort(new QName("http://tempuri.org/", "quyiServiceNoSoap"), QuyiServiceNoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QuyiServiceNoSoap
     */
    @WebEndpoint(name = "quyiServiceNoSoap")
    public QuyiServiceNoSoap getQuyiServiceNoSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "quyiServiceNoSoap"), QuyiServiceNoSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns QuyiServiceNoSoap
     */
    @WebEndpoint(name = "quyiServiceNoSoap12")
    public QuyiServiceNoSoap getQuyiServiceNoSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "quyiServiceNoSoap12"), QuyiServiceNoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QuyiServiceNoSoap
     */
    @WebEndpoint(name = "quyiServiceNoSoap12")
    public QuyiServiceNoSoap getQuyiServiceNoSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "quyiServiceNoSoap12"), QuyiServiceNoSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (QUYISERVICENO_EXCEPTION!= null) {
            throw QUYISERVICENO_EXCEPTION;
        }
        return QUYISERVICENO_WSDL_LOCATION;
    }

}
