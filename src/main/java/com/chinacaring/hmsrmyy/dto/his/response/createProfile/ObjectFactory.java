
package com.chinacaring.hmsrmyy.dto.his.response.createProfile;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.hmsrmyy.dto.his.response.createProfile package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.hmsrmyy.dto.his.response.createProfile
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateProfileResponseHis }
     * 
     */
    public CreateProfileResponseHis createResponse() {
        return new CreateProfileResponseHis();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProfileResponseHis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Response")
    public JAXBElement<CreateProfileResponseHis> createResponse(CreateProfileResponseHis value) {
        return new JAXBElement<CreateProfileResponseHis>(_Response_QNAME, CreateProfileResponseHis.class, null, value);
    }

}
