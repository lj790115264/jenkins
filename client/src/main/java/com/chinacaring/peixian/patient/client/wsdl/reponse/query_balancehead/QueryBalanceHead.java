
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_balancehead;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryBalanceHead complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryBalanceHead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECEIPT_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VISIT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INP_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSUR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSUR_CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVOICE_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVOICE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOTAL_COST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSUR_PAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SELF_PAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSUR_SELF_PAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADMISSION_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DISCHARGE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SETTLE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCTOR_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalanceHead", propOrder = {
    "receiptno",
    "patientid",
    "visitid",
    "inpno",
    "patientname",
    "idno",
    "insurtype",
    "insurcardno",
    "invoiceno",
    "invoicetype",
    "totalcost",
    "insurpay",
    "selfpay",
    "insurselfpay",
    "admissiondate",
    "dischargedate",
    "deptname",
    "settledate",
    "doctorname"
})
public class QueryBalanceHead {

    @XmlElement(name = "RECEIPT_NO", required = true)
    protected String receiptno;
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
    @XmlElement(name = "INSUR_TYPE", required = true)
    protected String insurtype;
    @XmlElement(name = "INSUR_CARD_NO", required = true)
    protected String insurcardno;
    @XmlElement(name = "INVOICE_NO", required = true)
    protected String invoiceno;
    @XmlElement(name = "INVOICE_TYPE", required = true)
    protected String invoicetype;
    @XmlElement(name = "TOTAL_COST", required = true)
    protected String totalcost;
    @XmlElement(name = "INSUR_PAY", required = true)
    protected String insurpay;
    @XmlElement(name = "SELF_PAY", required = true)
    protected String selfpay;
    @XmlElement(name = "INSUR_SELF_PAY", required = true)
    protected String insurselfpay;
    @XmlElement(name = "ADMISSION_DATE", required = true)
    protected String admissiondate;
    @XmlElement(name = "DISCHARGE_DATE", required = true)
    protected String dischargedate;
    @XmlElement(name = "DEPT_NAME", required = true)
    protected String deptname;
    @XmlElement(name = "SETTLE_DATE", required = true)
    protected String settledate;
    @XmlElement(name = "DOCTOR_NAME", required = true)
    protected String doctorname;

    /**
     * 获取receiptno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIPTNO() {
        return receiptno;
    }

    /**
     * 设置receiptno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIPTNO(String value) {
        this.receiptno = value;
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
     * 获取insurtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURTYPE() {
        return insurtype;
    }

    /**
     * 设置insurtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURTYPE(String value) {
        this.insurtype = value;
    }

    /**
     * 获取insurcardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURCARDNO() {
        return insurcardno;
    }

    /**
     * 设置insurcardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURCARDNO(String value) {
        this.insurcardno = value;
    }

    /**
     * 获取invoiceno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICENO() {
        return invoiceno;
    }

    /**
     * 设置invoiceno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICENO(String value) {
        this.invoiceno = value;
    }

    /**
     * 获取invoicetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICETYPE() {
        return invoicetype;
    }

    /**
     * 设置invoicetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICETYPE(String value) {
        this.invoicetype = value;
    }

    /**
     * 获取totalcost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALCOST() {
        return totalcost;
    }

    /**
     * 设置totalcost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALCOST(String value) {
        this.totalcost = value;
    }

    /**
     * 获取insurpay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURPAY() {
        return insurpay;
    }

    /**
     * 设置insurpay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURPAY(String value) {
        this.insurpay = value;
    }

    /**
     * 获取selfpay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELFPAY() {
        return selfpay;
    }

    /**
     * 设置selfpay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELFPAY(String value) {
        this.selfpay = value;
    }

    /**
     * 获取insurselfpay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURSELFPAY() {
        return insurselfpay;
    }

    /**
     * 设置insurselfpay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURSELFPAY(String value) {
        this.insurselfpay = value;
    }

    /**
     * 获取admissiondate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADMISSIONDATE() {
        return admissiondate;
    }

    /**
     * 设置admissiondate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADMISSIONDATE(String value) {
        this.admissiondate = value;
    }

    /**
     * 获取dischargedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCHARGEDATE() {
        return dischargedate;
    }

    /**
     * 设置dischargedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCHARGEDATE(String value) {
        this.dischargedate = value;
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
     * 获取settledate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETTLEDATE() {
        return settledate;
    }

    /**
     * 设置settledate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETTLEDATE(String value) {
        this.settledate = value;
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

}
