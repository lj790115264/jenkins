
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_balancedetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Data complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryBalanceHead" type="{}QueryBalanceHead"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
    "queryBalanceHead"
})
public class Data {

    @XmlElement(name = "QueryBalanceHead", required = true)
    protected QueryBalanceHead queryBalanceHead;

    /**
     * 获取queryBalanceHead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryBalanceHead }
     *     
     */
    public QueryBalanceHead getQueryBalanceHead() {
        return queryBalanceHead;
    }

    /**
     * 设置queryBalanceHead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryBalanceHead }
     *     
     */
    public void setQueryBalanceHead(QueryBalanceHead value) {
        this.queryBalanceHead = value;
    }

}
