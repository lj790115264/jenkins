
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_prescriptioninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryPrescriptionInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryPrescriptionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRESCRIPTION_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCTOR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCTOR_STAFF_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCTOR_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRESCRIPTION_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REGISTER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRESCRIPTION_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VERIFY_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOTAL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAYMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CREATE_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HIS_ORDER_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPrescriptionInfo", propOrder = {
    "prescriptionno",
    "doctorid",
    "doctorstaffid",
    "doctorname",
    "prescriptiondate",
    "deptname",
    "patientid",
    "patientname",
    "cardno",
    "registerid",
    "gender",
    "age",
    "address",
    "prescriptionsource",
    "verify1",
    "totalprice",
    "payments",
    "createtime",
    "hisorderno"
})
public class QueryPrescriptionInfo {

    @XmlElement(name = "PRESCRIPTION_NO", required = true)
    protected String prescriptionno;
    @XmlElement(name = "DOCTOR_ID", required = true)
    protected String doctorid;
    @XmlElement(name = "DOCTOR_STAFF_ID", required = true)
    protected String doctorstaffid;
    @XmlElement(name = "DOCTOR_NAME", required = true)
    protected String doctorname;
    @XmlElement(name = "PRESCRIPTION_DATE", required = true)
    protected String prescriptiondate;
    @XmlElement(name = "DEPT_NAME", required = true)
    protected String deptname;
    @XmlElement(name = "PATIENT_ID", required = true)
    protected String patientid;
    @XmlElement(name = "PATIENT_NAME", required = true)
    protected String patientname;
    @XmlElement(name = "CARD_NO", required = true)
    protected String cardno;
    @XmlElement(name = "REGISTER_ID", required = true)
    protected String registerid;
    @XmlElement(name = "GENDER", required = true)
    protected String gender;
    @XmlElement(name = "AGE", required = true)
    protected String age;
    @XmlElement(name = "ADDRESS", required = true)
    protected String address;
    @XmlElement(name = "PRESCRIPTION_SOURCE", required = true)
    protected String prescriptionsource;
    @XmlElement(name = "VERIFY_1", required = true)
    protected String verify1;
    @XmlElement(name = "TOTAL_PRICE", required = true)
    protected String totalprice;
    @XmlElement(name = "PAYMENTS", required = true)
    protected String payments;
    @XmlElement(name = "CREATE_TIME", required = true)
    protected String createtime;
    @XmlElement(name = "HIS_ORDER_NO", required = true)
    protected String hisorderno;

    /**
     * 获取prescriptionno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESCRIPTIONNO() {
        return prescriptionno;
    }

    /**
     * 设置prescriptionno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESCRIPTIONNO(String value) {
        this.prescriptionno = value;
    }

    /**
     * 获取doctorid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCTORID() {
        return doctorid;
    }

    /**
     * 设置doctorid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCTORID(String value) {
        this.doctorid = value;
    }

    /**
     * 获取doctorstaffid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCTORSTAFFID() {
        return doctorstaffid;
    }

    /**
     * 设置doctorstaffid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCTORSTAFFID(String value) {
        this.doctorstaffid = value;
    }

    /**
     * 获取doctorname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCTORNAME() {
        return doctorname;
    }

    /**
     * 设置doctorname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCTORNAME(String value) {
        this.doctorname = value;
    }

    /**
     * 获取prescriptiondate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESCRIPTIONDATE() {
        return prescriptiondate;
    }

    /**
     * 设置prescriptiondate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESCRIPTIONDATE(String value) {
        this.prescriptiondate = value;
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
     * 获取cardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNO() {
        return cardno;
    }

    /**
     * 设置cardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNO(String value) {
        this.cardno = value;
    }

    /**
     * 获取registerid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGISTERID() {
        return registerid;
    }

    /**
     * 设置registerid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGISTERID(String value) {
        this.registerid = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENDER() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENDER(String value) {
        this.gender = value;
    }

    /**
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGE() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGE(String value) {
        this.age = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS(String value) {
        this.address = value;
    }

    /**
     * 获取prescriptionsource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESCRIPTIONSOURCE() {
        return prescriptionsource;
    }

    /**
     * 设置prescriptionsource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESCRIPTIONSOURCE(String value) {
        this.prescriptionsource = value;
    }

    /**
     * 获取verify1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERIFY1() {
        return verify1;
    }

    /**
     * 设置verify1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERIFY1(String value) {
        this.verify1 = value;
    }

    /**
     * 获取totalprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALPRICE() {
        return totalprice;
    }

    /**
     * 设置totalprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALPRICE(String value) {
        this.totalprice = value;
    }

    /**
     * 获取payments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTS() {
        return payments;
    }

    /**
     * 设置payments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTS(String value) {
        this.payments = value;
    }

    /**
     * 获取createtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATETIME() {
        return createtime;
    }

    /**
     * 设置createtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATETIME(String value) {
        this.createtime = value;
    }

    /**
     * 获取hisorderno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHISORDERNO() {
        return hisorderno;
    }

    /**
     * 设置hisorderno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHISORDERNO(String value) {
        this.hisorderno = value;
    }

}
