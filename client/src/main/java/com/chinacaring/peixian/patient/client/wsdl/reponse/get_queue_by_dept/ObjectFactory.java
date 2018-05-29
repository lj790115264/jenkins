
package com.chinacaring.peixian.patient.client.wsdl.reponse.get_queue_by_dept;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.request.get_queue_by_dept package. 
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

    private final static QName _Response_QNAME = new QName("", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.request.get_queue_by_dept
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Response }
     *
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Item }
     *
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Data }
     *
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

}
