
package com.chinacaring.peixian.patient.client.wsdl.request;

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
 *         &lt;element name="GetFeeListByClinicCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getFeeListByClinicCodeResult"
})
@XmlRootElement(name = "GetFeeListByClinicCodeResponse")
public class GetFeeListByClinicCodeResponse {

    @XmlElement(name = "GetFeeListByClinicCodeResult")
    protected String getFeeListByClinicCodeResult;

    /**
     * 获取getFeeListByClinicCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetFeeListByClinicCodeResult() {
        return getFeeListByClinicCodeResult;
    }

    /**
     * 设置getFeeListByClinicCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetFeeListByClinicCodeResult(String value) {
        this.getFeeListByClinicCodeResult = value;
    }

}
