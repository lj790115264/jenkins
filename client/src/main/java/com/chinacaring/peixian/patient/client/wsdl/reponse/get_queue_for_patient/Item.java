
package com.chinacaring.peixian.patient.client.wsdl.reponse.get_queue_for_patient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>item complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="his_ord_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dept_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dept_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="see_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="show_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="next_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wait_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "hisOrdNum",
    "deptCode",
    "deptName",
    "seeNo",
    "showNo",
    "nextNo",
    "waitNum"
})
public class Item {

    @XmlElement(name = "his_ord_num", required = true)
    protected String hisOrdNum;
    @XmlElement(name = "dept_code", required = true)
    protected String deptCode;
    @XmlElement(name = "dept_name", required = true)
    protected String deptName;
    @XmlElement(name = "see_no", required = true)
    protected String seeNo;
    @XmlElement(name = "show_no", required = true)
    protected String showNo;
    @XmlElement(name = "next_no", required = true)
    protected String nextNo;
    @XmlElement(name = "wait_num", required = true)
    protected String waitNum;

    /**
     * 获取hisOrdNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHisOrdNum() {
        return hisOrdNum;
    }

    /**
     * 设置hisOrdNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHisOrdNum(String value) {
        this.hisOrdNum = value;
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
     * 获取seeNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeeNo() {
        return seeNo;
    }

    /**
     * 设置seeNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeeNo(String value) {
        this.seeNo = value;
    }

    /**
     * 获取showNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowNo() {
        return showNo;
    }

    /**
     * 设置showNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowNo(String value) {
        this.showNo = value;
    }

    /**
     * 获取nextNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextNo() {
        return nextNo;
    }

    /**
     * 设置nextNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextNo(String value) {
        this.nextNo = value;
    }

    /**
     * 获取waitNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitNum() {
        return waitNum;
    }

    /**
     * 设置waitNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitNum(String value) {
        this.waitNum = value;
    }

}
