
package com.chinacaring.peixian.patient.client.wsdl.reponse.booking_state;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.booking_state package. 
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

    private final static QName _BookingStateSoap_QNAME = new QName("", "BookingStateSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.booking_state
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookingStateSoap }
     * 
     */
    public BookingStateSoap createBookingStateSoap() {
        return new BookingStateSoap();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link BookingState }
     * 
     */
    public BookingState createBookingState() {
        return new BookingState();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingStateSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookingStateSoap")
    public JAXBElement<BookingStateSoap> createBookingStateSoap(BookingStateSoap value) {
        return new JAXBElement<BookingStateSoap>(_BookingStateSoap_QNAME, BookingStateSoap.class, null, value);
    }

}
