
package com.chinacaring.hmsrmyy.dto.his.response.examineDetail;

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
 *         &lt;element name="reportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="25020101"/>
 *               &lt;enumeration value="25020102"/>
 *               &lt;enumeration value="25020103"/>
 *               &lt;enumeration value="25020104"/>
 *               &lt;enumeration value="25020105"/>
 *               &lt;enumeration value="25020106"/>
 *               &lt;enumeration value="25020107"/>
 *               &lt;enumeration value="250104006"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="itemName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ATⅢ"/>
 *               &lt;enumeration value="PT凝血酶原时间"/>
 *               &lt;enumeration value="INR国际化标准比率"/>
 *               &lt;enumeration value="APTT活化部分凝血"/>
 *               &lt;enumeration value="TT凝血酶时间"/>
 *               &lt;enumeration value="FIB纤维蛋白原"/>
 *               &lt;enumeration value="D-D二聚体"/>
 *               &lt;enumeration value="FDP"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="result">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="67.30"/>
 *               &lt;enumeration value="15.30"/>
 *               &lt;enumeration value="1.35"/>
 *               &lt;enumeration value="36.30"/>
 *               &lt;enumeration value="15.70"/>
 *               &lt;enumeration value="3.92"/>
 *               &lt;enumeration value="480.00"/>
 *               &lt;enumeration value="1.94"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="resultRef">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="75.00～125.00"/>
 *               &lt;enumeration value="11.00～15.00"/>
 *               &lt;enumeration value="0.80～1.50"/>
 *               &lt;enumeration value="20.00～40.00"/>
 *               &lt;enumeration value="14.00～21.00"/>
 *               &lt;enumeration value="2.00～4.00"/>
 *               &lt;enumeration value="1.00～1000.00"/>
 *               &lt;enumeration value="0.00～5.00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isDanger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="%"/>
 *               &lt;enumeration value="s"/>
 *               &lt;enumeration value="g/L"/>
 *               &lt;enumeration value="ug/L"/>
 *               &lt;enumeration value="ug/ml"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="resultFlag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="↓"/>
 *               &lt;enumeration value="↑"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="itemIndex">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
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
@XmlType(name = "ItemType", propOrder = {
    "reportNo",
    "itemId",
    "itemName",
    "result",
    "resultRef",
    "isDanger",
    "unit",
    "resultFlag",
    "itemIndex"
})
public class ItemType {

    @XmlElement(required = true)
    protected String reportNo;
    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true)
    protected String resultRef;
    @XmlElement(required = true)
    protected String isDanger;
    @XmlElement(required = true)
    protected String unit;
    @XmlElement(required = true)
    protected String resultFlag;
    @XmlElement(required = true)
    protected String itemIndex;

    /**
     * 获取reportNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportNo() {
        return reportNo;
    }

    /**
     * 设置reportNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportNo(String value) {
        this.reportNo = value;
    }

    /**
     * 获取itemId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置itemId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
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
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * 获取resultRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultRef() {
        return resultRef;
    }

    /**
     * 设置resultRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultRef(String value) {
        this.resultRef = value;
    }

    /**
     * 获取isDanger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDanger() {
        return isDanger;
    }

    /**
     * 设置isDanger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDanger(String value) {
        this.isDanger = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * 获取resultFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultFlag() {
        return resultFlag;
    }

    /**
     * 设置resultFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultFlag(String value) {
        this.resultFlag = value;
    }

    /**
     * 获取itemIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIndex() {
        return itemIndex;
    }

    /**
     * 设置itemIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIndex(String value) {
        this.itemIndex = value;
    }

}
