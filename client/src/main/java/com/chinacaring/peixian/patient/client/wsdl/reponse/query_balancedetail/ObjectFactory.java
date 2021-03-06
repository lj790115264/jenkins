
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_balancedetail;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.reponse.query_balancedetail package. 
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

    private final static QName _QueryBalanceHeadSoap_QNAME = new QName("", "QueryBalanceHeadSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.reponse.query_balancedetail
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryBalanceHeadSoap }
     * 
     */
    public QueryBalanceHeadSoap createQueryBalanceHeadSoap() {
        return new QueryBalanceHeadSoap();
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
     * Create an instance of {@link QueryBalanceHead }
     * 
     */
    public QueryBalanceHead createQueryBalanceHead() {
        return new QueryBalanceHead();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBalanceHeadSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QueryBalanceHeadSoap")
    public JAXBElement<QueryBalanceHeadSoap> createQueryBalanceHeadSoap(QueryBalanceHeadSoap value) {
        return new JAXBElement<QueryBalanceHeadSoap>(_QueryBalanceHeadSoap_QNAME, QueryBalanceHeadSoap.class, null, value);
    }

}
