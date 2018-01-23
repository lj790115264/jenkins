
package com.chinacaring.peixian.patient.client.wsdl.reponse.insert_patientinfo;

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
 *         &lt;element name="InsertPatientInfo" type="{}InsertPatientInfo"/>
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
    "insertPatientInfo"
})
public class Data {

    @XmlElement(name = "InsertPatientInfo", required = true)
    protected InsertPatientInfo insertPatientInfo;

    /**
     * 获取insertPatientInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsertPatientInfo }
     *     
     */
    public InsertPatientInfo getInsertPatientInfo() {
        return insertPatientInfo;
    }

    /**
     * 设置insertPatientInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsertPatientInfo }
     *     
     */
    public void setInsertPatientInfo(InsertPatientInfo value) {
        this.insertPatientInfo = value;
    }

}
