
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
 *         &lt;element name="get_queue_for_patientResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getQueueForPatientResult"
})
@XmlRootElement(name = "get_queue_for_patientResponse")
public class GetQueueForPatientResponse {

    @XmlElement(name = "get_queue_for_patientResult")
    protected String getQueueForPatientResult;

    /**
     * 获取getQueueForPatientResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetQueueForPatientResult() {
        return getQueueForPatientResult;
    }

    /**
     * 设置getQueueForPatientResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetQueueForPatientResult(String value) {
        this.getQueueForPatientResult = value;
    }

}
