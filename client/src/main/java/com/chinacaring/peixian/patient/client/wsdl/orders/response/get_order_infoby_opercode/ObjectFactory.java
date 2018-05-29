
package com.chinacaring.peixian.patient.client.wsdl.orders.response.get_order_infoby_opercode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chinacaring.peixian.patient.client.wsdl.orders.response.get_order_infoby_opercode package. 
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

    private final static QName _GetOrderInfoByOperCode_QNAME = new QName("", "GetOrderInfoByOperCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chinacaring.peixian.patient.client.wsdl.orders.response.get_order_infoby_opercode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderInfoByOperCode }
     * 
     */
    public GetOrderInfoByOperCode createGetOrderInfoByOperCode() {
        return new GetOrderInfoByOperCode();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderInfoByOperCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GetOrderInfoByOperCode")
    public JAXBElement<GetOrderInfoByOperCode> createGetOrderInfoByOperCode(GetOrderInfoByOperCode value) {
        return new JAXBElement<GetOrderInfoByOperCode>(_GetOrderInfoByOperCode_QNAME, GetOrderInfoByOperCode.class, null, value);
    }

}
