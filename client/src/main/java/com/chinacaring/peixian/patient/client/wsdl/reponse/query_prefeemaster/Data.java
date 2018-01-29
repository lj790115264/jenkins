
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_prefeemaster;

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
 *         &lt;element name="QueryPrefeeMaster" type="{}QueryPrefeeMaster"/>
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
    "queryPrefeeMaster"
})
public class Data {

    @XmlElement(name = "QueryPrefeeMaster", required = true)
    protected QueryPrefeeMaster queryPrefeeMaster;

    /**
     * 获取queryPrefeeMaster属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryPrefeeMaster }
     *     
     */
    public QueryPrefeeMaster getQueryPrefeeMaster() {
        return queryPrefeeMaster;
    }

    /**
     * 设置queryPrefeeMaster属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPrefeeMaster }
     *     
     */
    public void setQueryPrefeeMaster(QueryPrefeeMaster value) {
        this.queryPrefeeMaster = value;
    }

}
