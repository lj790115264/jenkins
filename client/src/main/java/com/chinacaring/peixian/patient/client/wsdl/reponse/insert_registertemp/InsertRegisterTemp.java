
package com.chinacaring.peixian.patient.client.wsdl.reponse.insert_registertemp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InsertRegisterTemp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InsertRegisterTemp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLINICNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEENO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertRegisterTemp", propOrder = {
    "clinicno",
    "seeno",
    "patientname"
})
public class InsertRegisterTemp {

    @XmlElement(name = "CLINICNO", required = true)
    protected String clinicno;
    @XmlElement(name = "SEENO", required = true)
    protected String seeno;
    @XmlElement(name = "PATIENTNAME", required = true)
    protected String patientname;

    /**
     * 获取clinicno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLINICNO() {
        return clinicno;
    }

    /**
     * 设置clinicno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLINICNO(String value) {
        this.clinicno = value;
    }

    /**
     * 获取seeno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEENO() {
        return seeno;
    }

    /**
     * 设置seeno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEENO(String value) {
        this.seeno = value;
    }

    /**
     * 获取patientname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTNAME() {
        return patientname;
    }

    /**
     * 设置patientname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTNAME(String value) {
        this.patientname = value;
    }

}
