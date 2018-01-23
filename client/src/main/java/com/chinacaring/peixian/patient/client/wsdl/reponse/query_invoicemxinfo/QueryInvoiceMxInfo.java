
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_invoicemxinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryInvoiceMxInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryInvoiceMxInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PATIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RECEIPT_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="M_FEIYONGID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VISIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VISIT_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSUR_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MYSELF_SCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_SPEC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_PRICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_COSTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCTOR_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PERFORM_DEPT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInvoiceMxInfo", propOrder = {
    "patientid",
    "patientname",
    "receiptno",
    "paydate",
    "mfeiyongid",
    "visitdate",
    "visitno",
    "itemno",
    "itemclass",
    "insurclass",
    "myselfscale",
    "itemcode",
    "itemname",
    "itemspec",
    "itemunits",
    "itemamount",
    "itemprice",
    "itemcosts",
    "doctorname",
    "performdept"
})
public class QueryInvoiceMxInfo {

    @XmlElement(name = "PATIENT_ID", required = true)
    protected String patientid;
    @XmlElement(name = "PATIENT_NAME", required = true)
    protected String patientname;
    @XmlElement(name = "RECEIPT_NO", required = true)
    protected String receiptno;
    @XmlElement(name = "PAY_DATE", required = true)
    protected String paydate;
    @XmlElement(name = "M_FEIYONGID", required = true)
    protected String mfeiyongid;
    @XmlElement(name = "VISIT_DATE", required = true)
    protected String visitdate;
    @XmlElement(name = "VISIT_NO", required = true)
    protected String visitno;
    @XmlElement(name = "ITEM_NO", required = true)
    protected String itemno;
    @XmlElement(name = "ITEM_CLASS", required = true)
    protected String itemclass;
    @XmlElement(name = "INSUR_CLASS", required = true)
    protected String insurclass;
    @XmlElement(name = "MYSELF_SCALE", required = true)
    protected String myselfscale;
    @XmlElement(name = "ITEM_CODE", required = true)
    protected String itemcode;
    @XmlElement(name = "ITEM_NAME", required = true)
    protected String itemname;
    @XmlElement(name = "ITEM_SPEC", required = true)
    protected String itemspec;
    @XmlElement(name = "ITEM_UNITS", required = true)
    protected String itemunits;
    @XmlElement(name = "ITEM_AMOUNT", required = true)
    protected String itemamount;
    @XmlElement(name = "ITEM_PRICE", required = true)
    protected String itemprice;
    @XmlElement(name = "ITEM_COSTS", required = true)
    protected String itemcosts;
    @XmlElement(name = "DOCTOR_NAME", required = true)
    protected String doctorname;
    @XmlElement(name = "PERFORM_DEPT", required = true)
    protected String performdept;

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
     * 获取paydate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYDATE() {
        return paydate;
    }

    /**
     * 设置paydate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYDATE(String value) {
        this.paydate = value;
    }

    /**
     * 获取mfeiyongid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFEIYONGID() {
        return mfeiyongid;
    }

    /**
     * 设置mfeiyongid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFEIYONGID(String value) {
        this.mfeiyongid = value;
    }

    /**
     * 获取visitdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVISITDATE() {
        return visitdate;
    }

    /**
     * 设置visitdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVISITDATE(String value) {
        this.visitdate = value;
    }

    /**
     * 获取visitno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVISITNO() {
        return visitno;
    }

    /**
     * 设置visitno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVISITNO(String value) {
        this.visitno = value;
    }

    /**
     * 获取itemno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMNO() {
        return itemno;
    }

    /**
     * 设置itemno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMNO(String value) {
        this.itemno = value;
    }

    /**
     * 获取itemclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCLASS() {
        return itemclass;
    }

    /**
     * 设置itemclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCLASS(String value) {
        this.itemclass = value;
    }

    /**
     * 获取insurclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURCLASS() {
        return insurclass;
    }

    /**
     * 设置insurclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURCLASS(String value) {
        this.insurclass = value;
    }

    /**
     * 获取myselfscale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMYSELFSCALE() {
        return myselfscale;
    }

    /**
     * 设置myselfscale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMYSELFSCALE(String value) {
        this.myselfscale = value;
    }

    /**
     * 获取itemcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCODE() {
        return itemcode;
    }

    /**
     * 设置itemcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCODE(String value) {
        this.itemcode = value;
    }

    /**
     * 获取itemname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMNAME() {
        return itemname;
    }

    /**
     * 设置itemname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMNAME(String value) {
        this.itemname = value;
    }

    /**
     * 获取itemspec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMSPEC() {
        return itemspec;
    }

    /**
     * 设置itemspec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMSPEC(String value) {
        this.itemspec = value;
    }

    /**
     * 获取itemunits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMUNITS() {
        return itemunits;
    }

    /**
     * 设置itemunits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMUNITS(String value) {
        this.itemunits = value;
    }

    /**
     * 获取itemamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMAMOUNT() {
        return itemamount;
    }

    /**
     * 设置itemamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMAMOUNT(String value) {
        this.itemamount = value;
    }

    /**
     * 获取itemprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMPRICE() {
        return itemprice;
    }

    /**
     * 设置itemprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMPRICE(String value) {
        this.itemprice = value;
    }

    /**
     * 获取itemcosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCOSTS() {
        return itemcosts;
    }

    /**
     * 设置itemcosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCOSTS(String value) {
        this.itemcosts = value;
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
     * 获取performdept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERFORMDEPT() {
        return performdept;
    }

    /**
     * 设置performdept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERFORMDEPT(String value) {
        this.performdept = value;
    }

}
