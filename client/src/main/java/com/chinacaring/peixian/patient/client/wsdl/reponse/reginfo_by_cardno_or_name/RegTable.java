
package com.chinacaring.peixian.patient.client.wsdl.reponse.reginfo_by_cardno_or_name;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RegTable complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RegTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLINIC_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="14711587"/>
 *               &lt;enumeration value="14711589"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REG_DATE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2018-01-04 09:54:00"/>
 *               &lt;enumeration value="2018-01-04 17:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REGLEVL_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACTKIND_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACTKIND_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegTable", propOrder = {
    "cliniccode",
    "name",
    "regdate",
    "cardno",
    "reglevlname",
    "pactcode",
    "pactname",
    "pactkindcode",
    "pactkindname",
    "deptcode",
    "deptname",
    "doctcode",
    "doctname"
})
public class RegTable {

    @XmlElement(name = "CLINIC_CODE", required = true)
    protected String cliniccode;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "REG_DATE", required = true)
    protected String regdate;
    @XmlElement(name = "CARD_NO", required = true)
    protected String cardno;
    @XmlElement(name = "REGLEVL_NAME", required = true)
    protected String reglevlname;
    @XmlElement(name = "PACT_CODE", required = true)
    protected String pactcode;
    @XmlElement(name = "PACT_NAME", required = true)
    protected String pactname;
    @XmlElement(name = "PACTKIND_CODE", required = true)
    protected String pactkindcode;
    @XmlElement(name = "PACTKIND_NAME", required = true)
    protected String pactkindname;
    @XmlElement(name = "DEPT_CODE", required = true)
    protected String deptcode;
    @XmlElement(name = "DEPT_NAME", required = true)
    protected String deptname;
    @XmlElement(name = "DOCT_CODE", required = true)
    protected String doctcode;
    @XmlElement(name = "DOCT_NAME", required = true)
    protected String doctname;

    public String getCliniccode() {
        return cliniccode;
    }

    public void setCliniccode(String cliniccode) {
        this.cliniccode = cliniccode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getReglevlname() {
        return reglevlname;
    }

    public void setReglevlname(String reglevlname) {
        this.reglevlname = reglevlname;
    }

    public String getPactcode() {
        return pactcode;
    }

    public void setPactcode(String pactcode) {
        this.pactcode = pactcode;
    }

    public String getPactname() {
        return pactname;
    }

    public void setPactname(String pactname) {
        this.pactname = pactname;
    }

    public String getPactkindcode() {
        return pactkindcode;
    }

    public void setPactkindcode(String pactkindcode) {
        this.pactkindcode = pactkindcode;
    }

    public String getPactkindname() {
        return pactkindname;
    }

    public void setPactkindname(String pactkindname) {
        this.pactkindname = pactkindname;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDoctcode() {
        return doctcode;
    }

    public void setDoctcode(String doctcode) {
        this.doctcode = doctcode;
    }

    public String getDoctname() {
        return doctname;
    }

    public void setDoctname(String doctname) {
        this.doctname = doctname;
    }

    /**
     * 获取cliniccode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLINICCODE() {
        return cliniccode;
    }

    /**
     * 设置cliniccode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLINICCODE(String value) {
        this.cliniccode = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
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
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * 获取regdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGDATE() {
        return regdate;
    }

    /**
     * 设置regdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGDATE(String value) {
        this.regdate = value;
    }

    /**
     * 获取cardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNO() {
        return cardno;
    }

    /**
     * 设置cardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNO(String value) {
        this.cardno = value;
    }

    /**
     * 获取reglevlname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGLEVLNAME() {
        return reglevlname;
    }

    /**
     * 设置reglevlname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGLEVLNAME(String value) {
        this.reglevlname = value;
    }

    /**
     * 获取pactcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACTCODE() {
        return pactcode;
    }

    /**
     * 设置pactcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACTCODE(String value) {
        this.pactcode = value;
    }

    /**
     * 获取pactname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACTNAME() {
        return pactname;
    }

    /**
     * 设置pactname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACTNAME(String value) {
        this.pactname = value;
    }

    /**
     * 获取pactkindcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACTKINDCODE() {
        return pactkindcode;
    }

    /**
     * 设置pactkindcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACTKINDCODE(String value) {
        this.pactkindcode = value;
    }

    /**
     * 获取pactkindname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACTKINDNAME() {
        return pactkindname;
    }

    /**
     * 设置pactkindname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACTKINDNAME(String value) {
        this.pactkindname = value;
    }

    /**
     * 获取deptcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTCODE() {
        return deptcode;
    }

    /**
     * 设置deptcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTCODE(String value) {
        this.deptcode = value;
    }

    /**
     * 获取deptname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTNAME() {
        return deptname;
    }

    /**
     * 设置deptname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTNAME(String value) {
        this.deptname = value;
    }

    /**
     * 获取doctcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCTCODE() {
        return doctcode;
    }

    /**
     * 设置doctcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCTCODE(String value) {
        this.doctcode = value;
    }

    /**
     * 获取doctname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCTNAME() {
        return doctname;
    }

    /**
     * 设置doctname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCTNAME(String value) {
        this.doctname = value;
    }

}
