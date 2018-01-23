
package com.chinacaring.peixian.patient.client.wsdl.reponse.queryin_mainmxinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryInMainMxInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryInMainMxInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PATIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VISIT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INP_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOTAL_COSTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SHOULD_PAY_FEE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REAL_PAY_FEE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BILLING_DATE_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_SPEC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInMainMxInfo", propOrder = {
    "patientid",
    "visitid",
    "inpno",
    "itemcode",
    "itemname",
    "itemclass",
    "totalcosts",
    "shouldpayfee",
    "realpayfee",
    "billingdatetime",
    "itemspec",
    "amount",
    "units"
})
public class QueryInMainMxInfo {

    @XmlElement(name = "PATIENT_ID", required = true)
    protected String patientid;
    @XmlElement(name = "VISIT_ID", required = true)
    protected String visitid;
    @XmlElement(name = "INP_NO", required = true)
    protected String inpno;
    @XmlElement(name = "ITEM_CODE", required = true)
    protected String itemcode;
    @XmlElement(name = "ITEM_NAME", required = true)
    protected String itemname;
    @XmlElement(name = "ITEM_CLASS", required = true)
    protected String itemclass;
    @XmlElement(name = "TOTAL_COSTS", required = true)
    protected String totalcosts;
    @XmlElement(name = "SHOULD_PAY_FEE", required = true)
    protected String shouldpayfee;
    @XmlElement(name = "REAL_PAY_FEE", required = true)
    protected String realpayfee;
    @XmlElement(name = "BILLING_DATE_TIME", required = true)
    protected String billingdatetime;
    @XmlElement(name = "ITEM_SPEC", required = true)
    protected String itemspec;
    @XmlElement(name = "AMOUNT", required = true)
    protected String amount;
    @XmlElement(name = "UNITS", required = true)
    protected String units;

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
     * 获取totalcosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALCOSTS() {
        return totalcosts;
    }

    /**
     * 设置totalcosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALCOSTS(String value) {
        this.totalcosts = value;
    }

    /**
     * 获取shouldpayfee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHOULDPAYFEE() {
        return shouldpayfee;
    }

    /**
     * 设置shouldpayfee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHOULDPAYFEE(String value) {
        this.shouldpayfee = value;
    }

    /**
     * 获取realpayfee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREALPAYFEE() {
        return realpayfee;
    }

    /**
     * 设置realpayfee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREALPAYFEE(String value) {
        this.realpayfee = value;
    }

    /**
     * 获取billingdatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLINGDATETIME() {
        return billingdatetime;
    }

    /**
     * 设置billingdatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLINGDATETIME(String value) {
        this.billingdatetime = value;
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
     * 获取units属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITS() {
        return units;
    }

    /**
     * 设置units属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITS(String value) {
        this.units = value;
    }

}
