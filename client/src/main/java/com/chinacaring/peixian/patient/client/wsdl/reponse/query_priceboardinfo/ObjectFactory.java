
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_priceboardinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.query_priceboardinfo package. 
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

    private final static QName _QueryPriceBoardInfoSoap_QNAME = new QName("", "QueryPriceBoardInfoSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.query_priceboardinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryPriceBoardInfoSoap }
     * 
     */
    public QueryPriceBoardInfoSoap createQueryPriceBoardInfoSoap() {
        return new QueryPriceBoardInfoSoap();
    }

    /**
     * Create an instance of {@link QueryPriceBoardInfo }
     * 
     */
    public QueryPriceBoardInfo createQueryPriceBoardInfo() {
        return new QueryPriceBoardInfo();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPriceBoardInfoSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QueryPriceBoardInfoSoap")
    public JAXBElement<QueryPriceBoardInfoSoap> createQueryPriceBoardInfoSoap(QueryPriceBoardInfoSoap value) {
        return new JAXBElement<QueryPriceBoardInfoSoap>(_QueryPriceBoardInfoSoap_QNAME, QueryPriceBoardInfoSoap.class, null, value);
    }

}
