
package com.chinacaring.peixian.patient.client.wsdl.orders.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryInvoiceInfoOperResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryInvoiceInfoOperResult"
})
@XmlRootElement(name = "QueryInvoiceInfoOperResponse")
public class QueryInvoiceInfoOperResponse {

    @XmlElement(name = "QueryInvoiceInfoOperResult")
    protected String queryInvoiceInfoOperResult;

    /**
     * 获取queryInvoiceInfoOperResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryInvoiceInfoOperResult() {
        return queryInvoiceInfoOperResult;
    }

    /**
     * 设置queryInvoiceInfoOperResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryInvoiceInfoOperResult(String value) {
        this.queryInvoiceInfoOperResult = value;
    }

}
