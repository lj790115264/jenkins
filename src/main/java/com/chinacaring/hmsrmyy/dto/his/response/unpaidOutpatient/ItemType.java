
package com.chinacaring.hmsrmyy.dto.his.response.unpaidOutpatient;

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
 *         &lt;element name="regNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regLevelname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regCost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "regNO",
    "name",
    "regDate",
    "patientNO",
    "regLevelname",
    "regCost",
    "deptCode",
    "deptName",
    "docCode",
    "docName"
})
public class ItemType {

    @XmlElement(required = true)
    protected String regNO;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String regDate;
    @XmlElement(required = true)
    protected String patientNO;
    @XmlElement(required = true)
    protected String regLevelname;
    @XmlElement(required = true)
    protected String regCost;
    @XmlElement(required = true)
    protected String deptCode;
    @XmlElement(required = true)
    protected String deptName;
    @XmlElement(required = true)
    protected String docCode;
    @XmlElement(required = true)
    protected String docName;

    /**
     * 获取regNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNO() {
        return regNO;
    }

    /**
     * 设置regNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNO(String value) {
        this.regNO = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取regDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * 设置regDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * 获取patientNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientNO() {
        return patientNO;
    }

    /**
     * 设置patientNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientNO(String value) {
        this.patientNO = value;
    }

    /**
     * 获取regLevelname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegLevelname() {
        return regLevelname;
    }

    /**
     * 设置regLevelname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegLevelname(String value) {
        this.regLevelname = value;
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
     * 获取docCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCode() {
        return docCode;
    }

    /**
     * 设置docCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCode(String value) {
        this.docCode = value;
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

}
