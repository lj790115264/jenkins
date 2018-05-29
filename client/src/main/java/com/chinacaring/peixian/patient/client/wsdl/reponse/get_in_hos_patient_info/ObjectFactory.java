
package com.chinacaring.peixian.patient.client.wsdl.reponse.get_in_hos_patient_info;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.get_in_hos_patient_info package.
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

    private final static QName _Queryinhospatient_QNAME = new QName("", "queryinhospatient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.get_in_hos_patient_info
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Queryinhospatient }
     * 
     */
    public Queryinhospatient createQueryinhospatient() {
        return new Queryinhospatient();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Queryinhospatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "queryinhospatient")
    public JAXBElement<Queryinhospatient> createQueryinhospatient(Queryinhospatient value) {
        return new JAXBElement<Queryinhospatient>(_Queryinhospatient_QNAME, Queryinhospatient.class, null, value);
    }

}
