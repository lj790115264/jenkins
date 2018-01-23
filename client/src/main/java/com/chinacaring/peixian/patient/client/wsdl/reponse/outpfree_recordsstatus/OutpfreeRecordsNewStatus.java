
package com.chinacaring.peixian.patient.client.wsdl.reponse.outpfree_recordsstatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OutpfreeRecordsNewStatus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OutpfreeRecordsNewStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRESC_ATTR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="17503772"/>
 *               &lt;enumeration value="17503773"/>
 *               &lt;enumeration value="17503768"/>
 *               &lt;enumeration value="17503769"/>
 *               &lt;enumeration value="8548929"/>
 *               &lt;enumeration value="17503775"/>
 *               &lt;enumeration value="17503774"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RECEIPT_NO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="000096940445"/>
 *               &lt;enumeration value="000096940444"/>
 *               &lt;enumeration value="000018344789"/>
 *               &lt;enumeration value="000096940446"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PATIENT_ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0090000001"/>
 *               &lt;enumeration value="0000193563"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PATIENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRUG_WINDOWS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="西药房"/>
 *               &lt;enumeration value="CT室"/>
 *               &lt;enumeration value="急诊科"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AMOUNT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1.70"/>
 *               &lt;enumeration value="310"/>
 *               &lt;enumeration value="990"/>
 *               &lt;enumeration value="63"/>
 *               &lt;enumeration value="1.85"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STATUS1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HIS_PAY_TIME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2018/01/05 10:30:45"/>
 *               &lt;enumeration value="2018/01/04 18:52:43"/>
 *               &lt;enumeration value="2013/01/20 10:06:21"/>
 *               &lt;enumeration value="2018/01/05 10:52:30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutpfreeRecordsNewStatus", propOrder = {
    "prescattr",
    "receiptno",
    "patientid",
    "patientname",
    "drugwindows",
    "amount",
    "status1",
    "hispaytime"
})
public class OutpfreeRecordsNewStatus {

    @XmlElement(name = "PRESC_ATTR", required = true)
    protected String prescattr;
    @XmlElement(name = "RECEIPT_NO", required = true)
    protected String receiptno;
    @XmlElement(name = "PATIENT_ID", required = true)
    protected String patientid;
    @XmlElement(name = "PATIENT_NAME", required = true)
    protected String patientname;
    @XmlElement(name = "DRUG_WINDOWS", required = true)
    protected String drugwindows;
    @XmlElement(name = "AMOUNT", required = true)
    protected String amount;
    @XmlElement(name = "STATUS1", required = true)
    protected String status1;
    @XmlElement(name = "HIS_PAY_TIME", required = true)
    protected String hispaytime;

    /**
     * 获取prescattr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESCATTR() {
        return prescattr;
    }

    /**
     * 设置prescattr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESCATTR(String value) {
        this.prescattr = value;
    }

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
     * 获取drugwindows属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUGWINDOWS() {
        return drugwindows;
    }

    /**
     * 设置drugwindows属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUGWINDOWS(String value) {
        this.drugwindows = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
    }

    /**
     * 获取status1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS1() {
        return status1;
    }

    /**
     * 设置status1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS1(String value) {
        this.status1 = value;
    }

    /**
     * 获取hispaytime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHISPAYTIME() {
        return hispaytime;
    }

    /**
     * 设置hispaytime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHISPAYTIME(String value) {
        this.hispaytime = value;
    }

}
