
package com.chinacaring.peixian.patient.client.wsdl.orders.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clinicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeSiReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readSiReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ybInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clinicCode",
    "recipeNo",
    "operCode",
    "payMode",
    "totCost",
    "chargeSiReturn",
    "readSiReturn",
    "ybInvoice"
})
@XmlRootElement(name = "SaveSIFee")
public class SaveSIFee {

    protected String clinicCode;
    protected String recipeNo;
    protected String operCode;
    protected String payMode;
    protected String totCost;
    protected String chargeSiReturn;
    protected String readSiReturn;
    protected String ybInvoice;

    /**
     * 获取clinicCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicCode() {
        return clinicCode;
    }

    /**
     * 设置clinicCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicCode(String value) {
        this.clinicCode = value;
    }

    /**
     * 获取recipeNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeNo() {
        return recipeNo;
    }

    /**
     * 设置recipeNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeNo(String value) {
        this.recipeNo = value;
    }

    /**
     * 获取operCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * 设置operCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperCode(String value) {
        this.operCode = value;
    }

    /**
     * 获取payMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * 设置payMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * 获取totCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotCost() {
        return totCost;
    }

    /**
     * 设置totCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotCost(String value) {
        this.totCost = value;
    }

    /**
     * 获取chargeSiReturn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeSiReturn() {
        return chargeSiReturn;
    }

    /**
     * 设置chargeSiReturn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeSiReturn(String value) {
        this.chargeSiReturn = value;
    }

    /**
     * 获取readSiReturn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadSiReturn() {
        return readSiReturn;
    }

    /**
     * 设置readSiReturn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadSiReturn(String value) {
        this.readSiReturn = value;
    }

    /**
     * 获取ybInvoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYbInvoice() {
        return ybInvoice;
    }

    /**
     * 设置ybInvoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYbInvoice(String value) {
        this.ybInvoice = value;
    }

}
