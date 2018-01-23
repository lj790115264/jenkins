
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_prefeemaster;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryPrefeeMaster complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryPrefeeMaster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INPATIENT_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADMISS_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADMISS_TIMES" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SF_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BALANCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CHARGE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPO_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WARD_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BED_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPrefeeMaster", propOrder = {
    "inpatientno",
    "patientid",
    "patientname",
    "idno",
    "sex",
    "admissdate",
    "admisstimes",
    "sfname",
    "balance",
    "chargeamount",
    "depoamount",
    "wardname",
    "bedno"
})
public class QueryPrefeeMaster {

    @XmlElement(name = "INPATIENT_NO", required = true)
    protected String inpatientno;
    @XmlElement(name = "PATIENT_ID", required = true)
    protected String patientid;
    @XmlElement(name = "PATIENT_NAME", required = true)
    protected String patientname;
    @XmlElement(name = "ID_NO", required = true)
    protected String idno;
    @XmlElement(name = "SEX", required = true)
    protected String sex;
    @XmlElement(name = "ADMISS_DATE", required = true)
    protected String admissdate;
    @XmlElement(name = "ADMISS_TIMES", required = true)
    protected String admisstimes;
    @XmlElement(name = "SF_NAME", required = true)
    protected String sfname;
    @XmlElement(name = "BALANCE", required = true)
    protected String balance;
    @XmlElement(name = "CHARGE_AMOUNT", required = true)
    protected String chargeamount;
    @XmlElement(name = "DEPO_AMOUNT", required = true)
    protected String depoamount;
    @XmlElement(name = "WARD_NAME", required = true)
    protected String wardname;
    @XmlElement(name = "BED_NO", required = true)
    protected String bedno;

    /**
     * 获取inpatientno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPATIENTNO() {
        return inpatientno;
    }

    /**
     * 设置inpatientno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPATIENTNO(String value) {
        this.inpatientno = value;
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
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEX() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEX(String value) {
        this.sex = value;
    }

    /**
     * 获取admissdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADMISSDATE() {
        return admissdate;
    }

    /**
     * 设置admissdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADMISSDATE(String value) {
        this.admissdate = value;
    }

    /**
     * 获取admisstimes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADMISSTIMES() {
        return admisstimes;
    }

    /**
     * 设置admisstimes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADMISSTIMES(String value) {
        this.admisstimes = value;
    }

    /**
     * 获取sfname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFNAME() {
        return sfname;
    }

    /**
     * 设置sfname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFNAME(String value) {
        this.sfname = value;
    }

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALANCE() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALANCE(String value) {
        this.balance = value;
    }

    /**
     * 获取chargeamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGEAMOUNT() {
        return chargeamount;
    }

    /**
     * 设置chargeamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGEAMOUNT(String value) {
        this.chargeamount = value;
    }

    /**
     * 获取depoamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPOAMOUNT() {
        return depoamount;
    }

    /**
     * 设置depoamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPOAMOUNT(String value) {
        this.depoamount = value;
    }

    /**
     * 获取wardname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWARDNAME() {
        return wardname;
    }

    /**
     * 设置wardname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWARDNAME(String value) {
        this.wardname = value;
    }

    /**
     * 获取bedno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEDNO() {
        return bedno;
    }

    /**
     * 设置bedno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEDNO(String value) {
        this.bedno = value;
    }

}
