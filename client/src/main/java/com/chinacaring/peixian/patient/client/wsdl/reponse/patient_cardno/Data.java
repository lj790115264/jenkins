
package com.chinacaring.peixian.patient.client.wsdl.reponse.patient_cardno;

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
 *         &lt;element name="PatientCardNo1" type="{}PatientCardNo1"/>
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
    "patientCardNo1"
})
public class Data {

    @XmlElement(name = "PatientCardNo1", required = true)
    protected PatientCardNo1 patientCardNo1;

    /**
     * 获取patientCardNo1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PatientCardNo1 }
     *     
     */
    public PatientCardNo1 getPatientCardNo1() {
        return patientCardNo1;
    }

    /**
     * 设置patientCardNo1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PatientCardNo1 }
     *     
     */
    public void setPatientCardNo1(PatientCardNo1 value) {
        this.patientCardNo1 = value;
    }

}
