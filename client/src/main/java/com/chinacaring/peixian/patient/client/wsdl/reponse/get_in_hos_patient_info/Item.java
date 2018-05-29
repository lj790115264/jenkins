
package com.chinacaring.peixian.patient.client.wsdl.reponse.get_in_hos_patient_info;

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
 *         &lt;element name="inpatient_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inhos_patient_serial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="diagnose_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="diagnose_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dept_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dept_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ward_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ward_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bed_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inhos_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outhos_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="total_fee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "inpatientCode",
    "name",
    "inhosPatientSerial",
    "diagnoseCode",
    "diagnoseName",
    "state",
    "deptCode",
    "deptName",
    "wardCode",
    "wardName",
    "bedNo",
    "inhosTime",
    "outhosTime",
    "totalFee",
    "balance"
})
public class Item {

    @XmlElement(name = "inpatient_code", required = true)
    protected String inpatientCode;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "inhos_patient_serial", required = true)
    protected String inhosPatientSerial;
    @XmlElement(name = "diagnose_code", required = true)
    protected String diagnoseCode;
    @XmlElement(name = "diagnose_name", required = true)
    protected String diagnoseName;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(name = "dept_code", required = true)
    protected String deptCode;
    @XmlElement(name = "dept_name", required = true)
    protected String deptName;
    @XmlElement(name = "ward_code", required = true)
    protected String wardCode;
    @XmlElement(name = "ward_name", required = true)
    protected String wardName;
    @XmlElement(name = "bed_no", required = true)
    protected String bedNo;
    @XmlElement(name = "inhos_time", required = true)
    protected String inhosTime;
    @XmlElement(name = "outhos_time", required = true)
    protected String outhosTime;
    @XmlElement(name = "total_fee", required = true)
    protected String totalFee;
    @XmlElement(required = true)
    protected String balance;

    /**
     * 获取inpatientCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInpatientCode() {
        return inpatientCode;
    }

    /**
     * 设置inpatientCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInpatientCode(String value) {
        this.inpatientCode = value;
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
     * 获取inhosPatientSerial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhosPatientSerial() {
        return inhosPatientSerial;
    }

    /**
     * 设置inhosPatientSerial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhosPatientSerial(String value) {
        this.inhosPatientSerial = value;
    }

    /**
     * 获取diagnoseCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnoseCode() {
        return diagnoseCode;
    }

    /**
     * 设置diagnoseCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnoseCode(String value) {
        this.diagnoseCode = value;
    }

    /**
     * 获取diagnoseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnoseName() {
        return diagnoseName;
    }

    /**
     * 设置diagnoseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnoseName(String value) {
        this.diagnoseName = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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
     * 获取wardCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWardCode() {
        return wardCode;
    }

    /**
     * 设置wardCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWardCode(String value) {
        this.wardCode = value;
    }

    /**
     * 获取wardName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * 设置wardName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWardName(String value) {
        this.wardName = value;
    }

    /**
     * 获取bedNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置bedNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedNo(String value) {
        this.bedNo = value;
    }

    /**
     * 获取inhosTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhosTime() {
        return inhosTime;
    }

    /**
     * 设置inhosTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhosTime(String value) {
        this.inhosTime = value;
    }

    /**
     * 获取outhosTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuthosTime() {
        return outhosTime;
    }

    /**
     * 设置outhosTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuthosTime(String value) {
        this.outhosTime = value;
    }

    /**
     * 获取totalFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * 设置totalFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFee(String value) {
        this.totalFee = value;
    }

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

}
