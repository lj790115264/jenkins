
package com.chinacaring.peixian.patient.client.wsdl.reponse.feelist_by_cliniccode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.feelist_by_cliniccode package. 
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

    private final static QName _GetFeeListSoap_QNAME = new QName("", "GetFeeListSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.feelist_by_cliniccode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFeeListSoap }
     * 
     */
    public GetFeeListSoap createGetFeeListSoap() {
        return new GetFeeListSoap();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link FeeTable }
     * 
     */
    public FeeTable createFeeTable() {
        return new FeeTable();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeeListSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GetFeeListSoap")
    public JAXBElement<GetFeeListSoap> createGetFeeListSoap(GetFeeListSoap value) {
        return new JAXBElement<GetFeeListSoap>(_GetFeeListSoap_QNAME, GetFeeListSoap.class, null, value);
    }

}
