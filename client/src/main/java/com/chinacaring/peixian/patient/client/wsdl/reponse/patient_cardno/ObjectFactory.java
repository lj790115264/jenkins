
package com.chinacaring.peixian.patient.client.wsdl.reponse.patient_cardno;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.patient_cardno package.
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

    private final static QName _GetPatientCardNo1Soap_QNAME = new QName("", "GetPatientCardNo1Soap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.patient_cardno
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPatientCardNo1Soap }
     * 
     */
    public GetPatientCardNo1Soap createGetPatientCardNo1Soap() {
        return new GetPatientCardNo1Soap();
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
     * Create an instance of {@link PatientCardNo1 }
     * 
     */
    public PatientCardNo1 createPatientCardNo1() {
        return new PatientCardNo1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientCardNo1Soap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GetPatientCardNo1Soap")
    public JAXBElement<GetPatientCardNo1Soap> createGetPatientCardNo1Soap(GetPatientCardNo1Soap value) {
        return new JAXBElement<GetPatientCardNo1Soap>(_GetPatientCardNo1Soap_QNAME, GetPatientCardNo1Soap.class, null, value);
    }

}
