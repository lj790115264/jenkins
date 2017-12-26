
package com.chinacaring.hmsrmyy.dto.his.response.prescription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipeKey">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="109440966"/>
 *               &lt;enumeration value="109440967"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="recipeNO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="R2595163"/>
 *               &lt;enumeration value="R2595165"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="seqNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="drugFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="506050401"/>
 *               &lt;enumeration value="501040602"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="itemName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="葡萄糖酸钙锌口服溶液"/>
 *               &lt;enumeration value="注射用阿莫西林钠克拉维酸钾"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="number">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="unitPrice">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1.7917"/>
 *               &lt;enumeration value="32.0000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="totCost">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="21.50"/>
 *               &lt;enumeration value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emplCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="execDeptCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="20406"/>
 *               &lt;enumeration value="20405"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="execDeptName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="门诊西药房"/>
 *               &lt;enumeration value="急诊药房"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="moTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "recipeKey",
    "recipeNO",
    "seqNO",
    "feeCode",
    "drugFlag",
    "itemCode",
    "itemName",
    "number",
    "unitPrice",
    "totCost",
    "docName",
    "emplCode",
    "deptCode",
    "deptName",
    "execDeptCode",
    "execDeptName",
    "moTime",
    "itemClass",
    "payFlag"
})
public class ItemType {

    @XmlElement(required = true)
    protected String recipeKey;
    @XmlElement(required = true)
    protected String recipeNO;
    @XmlElement(required = true)
    protected String seqNO;
    @XmlElement(required = true)
    protected String feeCode;
    @XmlElement(required = true)
    protected String drugFlag;
    @XmlElement(required = true)
    protected String itemCode;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected String unitPrice;
    @XmlElement(required = true)
    protected String totCost;
    @XmlElement(required = true)
    protected String docName;
    @XmlElement(required = true)
    protected String emplCode;
    @XmlElement(required = true)
    protected String deptCode;
    @XmlElement(required = true)
    protected String deptName;
    @XmlElement(required = true)
    protected String execDeptCode;
    @XmlElement(required = true)
    protected String execDeptName;
    @XmlElement(required = true)
    protected String moTime;
    @XmlElement(required = true)
    protected String itemClass;
    @XmlElement(required = true)
    protected String payFlag;

    /**
     * 获取recipeKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeKey() {
        return recipeKey;
    }

    /**
     * 设置recipeKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeKey(String value) {
        this.recipeKey = value;
    }

    /**
     * 获取recipeNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeNO() {
        return recipeNO;
    }

    /**
     * 设置recipeNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeNO(String value) {
        this.recipeNO = value;
    }

    /**
     * 获取seqNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNO() {
        return seqNO;
    }

    /**
     * 设置seqNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNO(String value) {
        this.seqNO = value;
    }

    /**
     * 获取feeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * 设置feeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * 获取drugFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugFlag() {
        return drugFlag;
    }

    /**
     * 设置drugFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugFlag(String value) {
        this.drugFlag = value;
    }

    /**
     * 获取itemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置itemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * 获取itemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置itemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * 获取number属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * 获取unitPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * 设置unitPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
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
     * 获取docName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * 设置docName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * 获取emplCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplCode() {
        return emplCode;
    }

    /**
     * 设置emplCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplCode(String value) {
        this.emplCode = value;
    }

    /**
     * 获取deptCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置deptCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptCode(String value) {
        this.deptCode = value;
    }

    /**
     * 获取deptName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置deptName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptName(String value) {
        this.deptName = value;
    }

    /**
     * 获取execDeptCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecDeptCode() {
        return execDeptCode;
    }

    /**
     * 设置execDeptCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecDeptCode(String value) {
        this.execDeptCode = value;
    }

    /**
     * 获取execDeptName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecDeptName() {
        return execDeptName;
    }

    /**
     * 设置execDeptName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecDeptName(String value) {
        this.execDeptName = value;
    }

    /**
     * 获取moTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoTime() {
        return moTime;
    }

    /**
     * 设置moTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoTime(String value) {
        this.moTime = value;
    }

    /**
     * 获取itemClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemClass() {
        return itemClass;
    }

    /**
     * 设置itemClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemClass(String value) {
        this.itemClass = value;
    }

    /**
     * 获取payFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayFlag() {
        return payFlag;
    }

    /**
     * 设置payFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayFlag(String value) {
        this.payFlag = value;
    }

}
