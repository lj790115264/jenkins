
package com.chinacaring.hmsrmyy.dto.his.response.deptInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Data complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptDes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
    "deptCode",
    "deptName",
    "deptDes",
    "deptType",
    "branch",
    "regFlag"
})
public class Data {

    @XmlElement(required = true)
    protected String deptCode;
    @XmlElement(required = true)
    protected String deptName;
    @XmlElement(required = true)
    protected String deptDes;
    @XmlElement(required = true)
    protected String deptType;
    @XmlElement(required = true)
    protected String branch;
    @XmlElement(required = true)
    protected String regFlag;

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
     * 获取deptDes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptDes() {
        return deptDes;
    }

    /**
     * 设置deptDes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptDes(String value) {
        this.deptDes = value;
    }

    /**
     * 获取deptType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptType() {
        return deptType;
    }

    /**
     * 设置deptType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptType(String value) {
        this.deptType = value;
    }

    /**
     * 获取branch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 设置branch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * 获取regFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegFlag() {
        return regFlag;
    }

    /**
     * 设置regFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegFlag(String value) {
        this.regFlag = value;
    }

}
