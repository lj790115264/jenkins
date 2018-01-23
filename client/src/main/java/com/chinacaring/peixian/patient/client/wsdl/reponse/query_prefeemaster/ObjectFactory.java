
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_prefeemaster;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.query_prefeemaster package. 
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

    private final static QName _QueryPrefeeMasterSoap_QNAME = new QName("", "QueryPrefeeMasterSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.query_prefeemaster
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryPrefeeMasterSoap }
     * 
     */
    public QueryPrefeeMasterSoap createQueryPrefeeMasterSoap() {
        return new QueryPrefeeMasterSoap();
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
     * Create an instance of {@link QueryPrefeeMaster }
     * 
     */
    public QueryPrefeeMaster createQueryPrefeeMaster() {
        return new QueryPrefeeMaster();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPrefeeMasterSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QueryPrefeeMasterSoap")
    public JAXBElement<QueryPrefeeMasterSoap> createQueryPrefeeMasterSoap(QueryPrefeeMasterSoap value) {
        return new JAXBElement<QueryPrefeeMasterSoap>(_QueryPrefeeMasterSoap_QNAME, QueryPrefeeMasterSoap.class, null, value);
    }

}
