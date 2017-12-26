
package com.chinacaring.hmsrmyy.dto.his.response.prescription;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.hmsrmyy.dto.his.response.prescription package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.hmsrmyy.dto.his.response.prescription
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrescriptionResponseHis }
     * 
     */
    public PrescriptionResponseHis createResponseType() {
        return new PrescriptionResponseHis();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PrescriptionResponseHis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Response")
    public JAXBElement<PrescriptionResponseHis> createResponse(PrescriptionResponseHis value) {
        return new JAXBElement<PrescriptionResponseHis>(_Response_QNAME, PrescriptionResponseHis.class, null, value);
    }

}
