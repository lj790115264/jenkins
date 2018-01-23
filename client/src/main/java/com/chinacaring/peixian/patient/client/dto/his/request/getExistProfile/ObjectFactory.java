
package com.chinacaring.peixian.patient.client.dto.his.request.getExistProfile;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.dto.his.request package.
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

    private final static QName _Request_QNAME = new QName("", "Request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.dto.his.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExistProfileRequestHis }
     *
     */
    public GetExistProfileRequestHis createRequest() {
        return new GetExistProfileRequestHis();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExistProfileRequestHis }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "Request")
    public JAXBElement<GetExistProfileRequestHis> createRequest(GetExistProfileRequestHis value) {
        return new JAXBElement<GetExistProfileRequestHis>(_Request_QNAME, GetExistProfileRequestHis.class, null, value);
    }

}
