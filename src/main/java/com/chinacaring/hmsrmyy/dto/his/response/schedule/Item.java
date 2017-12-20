
package com.chinacaring.hmsrmyy.dto.his.response.schedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Item complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schemaID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1417"/>
 *               &lt;enumeration value="1405"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="seeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="week" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noonCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="下午"/>
 *               &lt;enumeration value="全日"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="beginTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="12:00"/>
 *               &lt;enumeration value="07:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="endTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="17:59"/>
 *               &lt;enumeration value="06:59"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="supDeptCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supDeptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emplCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2372"/>
 *               &lt;enumeration value="2185"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="docName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="施凯兵"/>
 *               &lt;enumeration value="周荣"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="telLimit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="100"/>
 *               &lt;enumeration value="300"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="telReged" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regLevelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regLevelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regCost">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="15"/>
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
@XmlType(name = "Item", propOrder = {
    "schemaID",
    "seeDate",
    "week",
    "noonCode",
    "beginTime",
    "endTime",
    "supDeptCode",
    "supDeptName",
    "deptCode",
    "deptName",
    "emplCode",
    "docName",
    "telLimit",
    "telReged",
    "regLevelCode",
    "regLevelName",
    "regCost"
})
public class Item {

    @XmlElement(required = true)
    protected String schemaID;
    @XmlElement(required = true)
    protected String seeDate;
    @XmlElement(required = true)
    protected String week;
    @XmlElement(required = true)
    protected String noonCode;
    @XmlElement(required = true)
    protected String beginTime;
    @XmlElement(required = true)
    protected String endTime;
    @XmlElement(required = true)
    protected String supDeptCode;
    @XmlElement(required = true)
    protected String supDeptName;
    @XmlElement(required = true)
    protected String deptCode;
    @XmlElement(required = true)
    protected String deptName;
    @XmlElement(required = true)
    protected String emplCode;
    @XmlElement(required = true)
    protected String docName;
    @XmlElement(required = true)
    protected String telLimit;
    @XmlElement(required = true)
    protected String telReged;
    @XmlElement(required = true)
    protected String regLevelCode;
    @XmlElement(required = true)
    protected String regLevelName;
    @XmlElement(required = true)
    protected String regCost;

    /**
     * 获取schemaID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaID() {
        return schemaID;
    }

    /**
     * 设置schemaID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaID(String value) {
        this.schemaID = value;
    }

    /**
     * 获取seeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeeDate() {
        return seeDate;
    }

    /**
     * 设置seeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeeDate(String value) {
        this.seeDate = value;
    }

    /**
     * 获取week属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeek() {
        return week;
    }

    /**
     * 设置week属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeek(String value) {
        this.week = value;
    }

    /**
     * 获取noonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoonCode() {
        return noonCode;
    }

    /**
     * 设置noonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoonCode(String value) {
        this.noonCode = value;
    }

    /**
     * 获取beginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * 设置beginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginTime(String value) {
        this.beginTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * 获取supDeptCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupDeptCode() {
        return supDeptCode;
    }

    /**
     * 设置supDeptCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupDeptCode(String value) {
        this.supDeptCode = value;
    }

    /**
     * 获取supDeptName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupDeptName() {
        return supDeptName;
    }

    /**
     * 设置supDeptName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupDeptName(String value) {
        this.supDeptName = value;
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
     * 获取telLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelLimit() {
        return telLimit;
    }

    /**
     * 设置telLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelLimit(String value) {
        this.telLimit = value;
    }

    /**
     * 获取telReged属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelReged() {
        return telReged;
    }

    /**
     * 设置telReged属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelReged(String value) {
        this.telReged = value;
    }

    /**
     * 获取regLevelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegLevelCode() {
        return regLevelCode;
    }

    /**
     * 设置regLevelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegLevelCode(String value) {
        this.regLevelCode = value;
    }

    /**
     * 获取regLevelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegLevelName() {
        return regLevelName;
    }

    /**
     * 设置regLevelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegLevelName(String value) {
        this.regLevelName = value;
    }

    /**
     * 获取regCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegCost() {
        return regCost;
    }

    /**
     * 设置regCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegCost(String value) {
        this.regCost = value;
    }

}
