
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_priceboardinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryPriceBoardInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryPriceBoardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOARD_STYLE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_NAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="杞菊地黄丸"/>
 *               &lt;enumeration value="双腔支气管导管"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y00000001912"/>
 *               &lt;enumeration value="F00000021705"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_PRICE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="9.83"/>
 *               &lt;enumeration value="1534"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_CATEGORY">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="中成药"/>
 *               &lt;enumeration value="材料费"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_MEASURE_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANUFACTORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FORMATS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="3g/8丸*200粒/瓶"/>
 *               &lt;enumeration value="33#"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREATE_TIME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2017-09-15T08:56:28+08:00"/>
 *               &lt;enumeration value="2013-10-01T09:52:06+08:00"/>
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
@XmlType(name = "QueryPriceBoardInfo", propOrder = {
    "boardstyle",
    "itemname",
    "itemcode",
    "itemprice",
    "itemcategory",
    "itemmeasureunit",
    "manufactory",
    "formats",
    "createtime"
})
public class QueryPriceBoardInfo {

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
    @XmlElement(name = "ITEM_MEASURE_UNIT")
    protected String itemmeasureunit;
    @XmlElement(name = "MANUFACTORY")
    protected String manufactory;
    @XmlElement(name = "FORMATS", required = true)
    protected String formats;
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
