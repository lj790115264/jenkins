
package com.chinacaring.peixian.patient.client.wsdl.reponse.insert_booking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.insert_booking package. 
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

    private final static QName _InsertBookingSoap_QNAME = new QName("", "InsertBookingSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.insert_booking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertBookingSoap }
     * 
     */
    public InsertBookingSoap createInsertBookingSoap() {
        return new InsertBookingSoap();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link InsertBooking }
     * 
     */
    public InsertBooking createInsertBooking() {
        return new InsertBooking();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBookingSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InsertBookingSoap")
    public JAXBElement<InsertBookingSoap> createInsertBookingSoap(InsertBookingSoap value) {
        return new JAXBElement<InsertBookingSoap>(_InsertBookingSoap_QNAME, InsertBookingSoap.class, null, value);
    }

}
