
package com.chinacaring.hmsrmyy.dto.his.response.price;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>dataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="dataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOARD_STYLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_NAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="计算机图文报告-Y"/>
 *               &lt;enumeration value="脏器声学造影"/>
 *               &lt;enumeration value="常规经食管超声心动图"/>
 *               &lt;enumeration value="术中经食管超声心动图"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="220800008-Y"/>
 *               &lt;enumeration value="220302010"/>
 *               &lt;enumeration value="220600005"/>
 *               &lt;enumeration value="220600006"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_PRICE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="65"/>
 *               &lt;enumeration value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_MEASURE_UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MANUFACTORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSTRUCTIONS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FORMATS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="包括肿瘤声学造影"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REMARK">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="新增眼部B超"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREATE_TIME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2015/5/30 10:16:05"/>
 *               &lt;enumeration value="2011/7/1 11:09:21"/>
 *               &lt;enumeration value="2011/6/9 14:32:47"/>
 *               &lt;enumeration value="2011/6/9 14:33:17"/>
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
@XmlType(name = "dataType", propOrder = {
    "boardstyle",
    "itemname",
    "itemcode",
    "itemprice",
    "itemcategory",
    "itemmeasureunit",
    "manufactory",
    "instructions",
    "formats",
    "remark",
    "createtime"
})
public class DataType {

    @XmlElement(name = "BOARD_STYLE", required = true)
    protected String boardstyle;
    @XmlElement(name = "ITEM_NAME", required = true)
    protected String itemname;
    @XmlElement(name = "ITEM_CODE", required = true)
    protected String itemcode;
    @XmlElement(name = "ITEM_PRICE", required = true)
    protected String itemprice;
    @XmlElement(name = "ITEM_CATEGORY", required = true)
    protected String itemcategory;
    @XmlElement(name = "ITEM_MEASURE_UNIT", required = true)
    protected String itemmeasureunit;
    @XmlElement(name = "MANUFACTORY", required = true)
    protected String manufactory;
    @XmlElement(name = "INSTRUCTIONS", required = true)
    protected String instructions;
    @XmlElement(name = "FORMATS", required = true)
    protected String formats;
    @XmlElement(name = "REMARK", required = true)
    protected String remark;
    @XmlElement(name = "CREATE_TIME", required = true)
    protected String createtime;

    /**
     * 获取boardstyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOARDSTYLE() {
        return boardstyle;
    }

    /**
     * 设置boardstyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOARDSTYLE(String value) {
        this.boardstyle = value;
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
     * 获取itemcategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCATEGORY() {
        return itemcategory;
    }

    /**
     * 设置itemcategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCATEGORY(String value) {
        this.itemcategory = value;
    }

    /**
     * 获取itemmeasureunit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMMEASUREUNIT() {
        return itemmeasureunit;
    }

    /**
     * 设置itemmeasureunit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMMEASUREUNIT(String value) {
        this.itemmeasureunit = value;
    }

    /**
     * 获取manufactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTORY() {
        return manufactory;
    }

    /**
     * 设置manufactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTORY(String value) {
        this.manufactory = value;
    }

    /**
     * 获取instructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRUCTIONS() {
        return instructions;
    }

    /**
     * 设置instructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRUCTIONS(String value) {
        this.instructions = value;
    }

    /**
     * 获取formats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATS() {
        return formats;
    }

    /**
     * 设置formats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATS(String value) {
        this.formats = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK(String value) {
        this.remark = value;
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

}
