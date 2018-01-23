
package com.chinacaring.peixian.patient.client.wsdl.reponse.schea_info;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.schea_info package.
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

    private final static QName _ShemaInfoSoap_QNAME = new QName("", "ShemaInfoSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.schea_info
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShemaInfoSoap }
     * 
     */
    public ShemaInfoSoap createShemaInfoSoap() {
        return new ShemaInfoSoap();
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
     * Create an instance of {@link ShemaInfo }
     * 
     */
    public ShemaInfo createShemaInfo() {
        return new ShemaInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShemaInfoSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ShemaInfoSoap")
    public JAXBElement<ShemaInfoSoap> createShemaInfoSoap(ShemaInfoSoap value) {
        return new JAXBElement<ShemaInfoSoap>(_ShemaInfoSoap_QNAME, ShemaInfoSoap.class, null, value);
    }

}
