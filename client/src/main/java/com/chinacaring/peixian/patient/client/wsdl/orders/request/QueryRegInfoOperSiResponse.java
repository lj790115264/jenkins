
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
 *         &lt;element name="QueryRegInfoOperSiResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "queryRegInfoOperSiResult"
})
@XmlRootElement(name = "QueryRegInfoOperSiResponse")
public class QueryRegInfoOperSiResponse {

    @XmlElement(name = "QueryRegInfoOperSiResult")
    protected String queryRegInfoOperSiResult;

    /**
     * 获取queryRegInfoOperSiResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryRegInfoOperSiResult() {
        return queryRegInfoOperSiResult;
    }

    /**
     * 设置queryRegInfoOperSiResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryRegInfoOperSiResult(String value) {
        this.queryRegInfoOperSiResult = value;
    }

}
