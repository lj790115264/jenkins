
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_prescriptionmedicione;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryPrescriptionMedicione complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryPrescriptionMedicione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRESCRIPTION_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRUG_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRUG_SPEC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRUG_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACKAGE_SPEC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACKAGE_UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOSAGE_UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DURATION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DURATION_UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOTAL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAYMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRESCRIPTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPrescriptionMedicione", propOrder = {
    "prescriptionno",
    "itemno",
    "drugcode",
    "drugspec",
    "drugname",
    "packagespec",
    "quantity",
    "packageunits",
    "dosage",
    "dosageunits",
    "frequency",
    "duration",
    "durationunits",
    "price",
    "totalprice",
    "payments",
    "prescriptiontype"
})
public class QueryPrescriptionMedicione {

    @XmlElement(name = "PRESCRIPTION_NO", required = true)
    protected String prescriptionno;
    @XmlElement(name = "ITEM_NO", required = true)
    protected String itemno;
    @XmlElement(name = "DRUG_CODE", required = true)
    protected String drugcode;
    @XmlElement(name = "DRUG_SPEC", required = true)
    protected String drugspec;
    @XmlElement(name = "DRUG_NAME", required = true)
    protected String drugname;
    @XmlElement(name = "PACKAGE_SPEC", required = true)
    protected String packagespec;
    @XmlElement(name = "QUANTITY", required = true)
    protected String quantity;
    @XmlElement(name = "PACKAGE_UNITS", required = true)
    protected String packageunits;
    @XmlElement(name = "DOSAGE", required = true)
    protected String dosage;
    @XmlElement(name = "DOSAGE_UNITS", required = true)
    protected String dosageunits;
    @XmlElement(name = "FREQUENCY", required = true)
    protected String frequency;
    @XmlElement(name = "DURATION", required = true)
    protected String duration;
    @XmlElement(name = "DURATION_UNITS", required = true)
    protected String durationunits;
    @XmlElement(name = "PRICE", required = true)
    protected String price;
    @XmlElement(name = "TOTAL_PRICE", required = true)
    protected String totalprice;
    @XmlElement(name = "PAYMENTS", required = true)
    protected String payments;
    @XmlElement(name = "PRESCRIPTION_TYPE", required = true)
    protected String prescriptiontype;

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
     * 获取drugcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUGCODE() {
        return drugcode;
    }

    /**
     * 设置drugcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUGCODE(String value) {
        this.drugcode = value;
    }

    /**
     * 获取drugspec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUGSPEC() {
        return drugspec;
    }

    /**
     * 设置drugspec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUGSPEC(String value) {
        this.drugspec = value;
    }

    /**
     * 获取drugname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUGNAME() {
        return drugname;
    }

    /**
     * 设置drugname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUGNAME(String value) {
        this.drugname = value;
    }

    /**
     * 获取packagespec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGESPEC() {
        return packagespec;
    }

    /**
     * 设置packagespec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGESPEC(String value) {
        this.packagespec = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUANTITY() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUANTITY(String value) {
        this.quantity = value;
    }

    /**
     * 获取packageunits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGEUNITS() {
        return packageunits;
    }

    /**
     * 设置packageunits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGEUNITS(String value) {
        this.packageunits = value;
    }

    /**
     * 获取dosage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOSAGE() {
        return dosage;
    }

    /**
     * 设置dosage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOSAGE(String value) {
        this.dosage = value;
    }

    /**
     * 获取dosageunits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOSAGEUNITS() {
        return dosageunits;
    }

    /**
     * 设置dosageunits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOSAGEUNITS(String value) {
        this.dosageunits = value;
    }

    /**
     * 获取frequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREQUENCY() {
        return frequency;
    }

    /**
     * 设置frequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREQUENCY(String value) {
        this.frequency = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURATION() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURATION(String value) {
        this.duration = value;
    }

    /**
     * 获取durationunits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURATIONUNITS() {
        return durationunits;
    }

    /**
     * 设置durationunits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURATIONUNITS(String value) {
        this.durationunits = value;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE(String value) {
        this.price = value;
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
     * 获取prescriptiontype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESCRIPTIONTYPE() {
        return prescriptiontype;
    }

    /**
     * 设置prescriptiontype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESCRIPTIONTYPE(String value) {
        this.prescriptiontype = value;
    }

}
