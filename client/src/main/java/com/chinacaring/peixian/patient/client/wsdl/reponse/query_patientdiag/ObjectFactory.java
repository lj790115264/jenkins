
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_patientdiag;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.query_patientdiag package. 
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

    private final static QName _QueryPatientDiagSoap_QNAME = new QName("", "QueryPatientDiagSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.query_patientdiag
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryPatientDiagSoap }
     * 
     */
    public QueryPatientDiagSoap createQueryPatientDiagSoap() {
        return new QueryPatientDiagSoap();
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
     * Create an instance of {@link QueryPatientDiag }
     * 
     */
    public QueryPatientDiag createQueryPatientDiag() {
        return new QueryPatientDiag();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPatientDiagSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QueryPatientDiagSoap")
    public JAXBElement<QueryPatientDiagSoap> createQueryPatientDiagSoap(QueryPatientDiagSoap value) {
        return new JAXBElement<QueryPatientDiagSoap>(_QueryPatientDiagSoap_QNAME, QueryPatientDiagSoap.class, null, value);
    }

}
