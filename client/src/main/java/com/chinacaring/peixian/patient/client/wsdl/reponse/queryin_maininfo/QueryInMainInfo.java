
package com.chinacaring.peixian.patient.client.wsdl.reponse.queryin_maininfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryInMainInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryInMainInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PATIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VISIT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INP_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PREPAYMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INHOSPITAL_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TREAT_DOCTOR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OUTHOSPITAL_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInMainInfo", propOrder = {
    "patientid",
    "visitid",
    "inpno",
    "patientname",
    "idno",
    "prepayments",
    "inhospitaldate",
    "deptname",
    "treatdoctor",
    "outhospitaldate"
})
public class QueryInMainInfo {

    @XmlElement(name = "PATIENT_ID", required = true)
    protected String patientid;
    @XmlElement(name = "VISIT_ID", required = true)
    protected String visitid;
    @XmlElement(name = "INP_NO", required = true)
    protected String inpno;
    @XmlElement(name = "PATIENT_NAME", required = true)
    protected String patientname;
    @XmlElement(name = "ID_NO", required = true)
    protected String idno;
    @XmlElement(name = "PREPAYMENTS", required = true)
    protected String prepayments;
    @XmlElement(name = "INHOSPITAL_DATE", required = true)
    protected String inhospitaldate;
    @XmlElement(name = "DEPT_NAME", required = true)
    protected String deptname;
    @XmlElement(name = "TREAT_DOCTOR", required = true)
    protected String treatdoctor;
    @XmlElement(name = "OUTHOSPITAL_DATE", required = true)
    protected String outhospitaldate;

    /**
     * 获取patientid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTID() {
        return patientid;
    }

    /**
     * 设置patientid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTID(String value) {
        this.patientid = value;
    }

    /**
     * 获取visitid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVISITID() {
        return visitid;
    }

    /**
     * 设置visitid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVISITID(String value) {
        this.visitid = value;
    }

    /**
     * 获取inpno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPNO() {
        return inpno;
    }

    /**
     * 设置inpno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPNO(String value) {
        this.inpno = value;
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

    /**
     * 获取idno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNO() {
        return idno;
    }

    /**
     * 设置idno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNO(String value) {
        this.idno = value;
    }

    /**
     * 获取prepayments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREPAYMENTS() {
        return prepayments;
    }

    /**
     * 设置prepayments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREPAYMENTS(String value) {
        this.prepayments = value;
    }

    /**
     * 获取inhospitaldate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINHOSPITALDATE() {
        return inhospitaldate;
    }

    /**
     * 设置inhospitaldate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINHOSPITALDATE(String value) {
        this.inhospitaldate = value;
    }

    /**
     * 获取deptname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTNAME() {
        return deptname;
    }

    /**
     * 设置deptname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTNAME(String value) {
        this.deptname = value;
    }

    /**
     * 获取treatdoctor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTREATDOCTOR() {
        return treatdoctor;
    }

    /**
     * 设置treatdoctor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTREATDOCTOR(String value) {
        this.treatdoctor = value;
    }

    /**
     * 获取outhospitaldate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTHOSPITALDATE() {
        return outhospitaldate;
    }

    /**
     * 设置outhospitaldate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTHOSPITALDATE(String value) {
        this.outhospitaldate = value;
    }

}
