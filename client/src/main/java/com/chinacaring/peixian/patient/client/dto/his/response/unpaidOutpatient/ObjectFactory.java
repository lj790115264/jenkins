
package com.chinacaring.peixian.patient.client.dto.his.response.unpaidOutpatient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.dto.his.response.unpaidOutpatient package.
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

    private final static QName _Response_QNAME = new QName("", "Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.dto.his.response.unpaidOutpatient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnpaidOutpatientResponseHis }
     * 
     */
    public UnpaidOutpatientResponseHis createResponseType() {
        return new UnpaidOutpatientResponseHis();
    }

    /**
     * Create an instance of {@link ItemsType }
     * 
     */
    public ItemsType createItemsType() {
        return new ItemsType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnpaidOutpatientResponseHis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Response")
    public JAXBElement<UnpaidOutpatientResponseHis> createResponse(UnpaidOutpatientResponseHis value) {
        return new JAXBElement<UnpaidOutpatientResponseHis>(_Response_QNAME, UnpaidOutpatientResponseHis.class, null, value);
    }

}
