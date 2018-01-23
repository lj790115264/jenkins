
package com.chinacaring.peixian.patient.client.wsdl.reponse.schea_info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShemaInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShemaInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WEEK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOONCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BEGIN_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="END_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TEL_LMT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TEL_REGED" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REGLEVL_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="03"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REGLEVL_NAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="主任专家号"/>
 *               &lt;enumeration value="副主任专家诊察"/>
 *               &lt;enumeration value="主任专家诊察"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CANREG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="110"/>
 *               &lt;enumeration value="120"/>
 *               &lt;enumeration value="119"/>
 *               &lt;enumeration value="109"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TOTCOST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SCHEMA_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShemaInfo", propOrder = {
    "id",
    "seedate",
    "week",
    "nooncode",
    "begintime",
    "endtime",
    "deptcode",
    "deptname",
    "doctcode",
    "doctname",
    "tellmt",
    "telreged",
    "reglevlcode",
    "reglevlname",
    "canreg",
    "totcost",
    "schematype"
})

public class ShemaInfo {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "SEE_DATE", required = true)
    protected String seedate;
    @XmlElement(name = "WEEK", required = true)
    protected String week;
    @XmlElement(name = "NOONCODE", required = true)
    protected String nooncode;
    @XmlElement(name = "BEGIN_TIME", required = true)
    protected String begintime;
    @XmlElement(name = "END_TIME", required = true)
    protected String endtime;
    @XmlElement(name = "DEPT_CODE", required = true)
    protected String deptcode;
    @XmlElement(name = "DEPT_NAME", required = true)
    protected String deptname;
    @XmlElement(name = "DOCT_CODE", required = true)
    protected String doctcode;
    @XmlElement(name = "DOCT_NAME", required = true)
    protected String doctname;
    @XmlElement(name = "TEL_LMT", required = true)
    protected String tellmt;
    @XmlElement(name = "TEL_REGED", required = true)
    protected String telreged;
    @XmlElement(name = "REGLEVL_CODE", required = true)
    protected String reglevlcode;
    @XmlElement(name = "REGLEVL_NAME", required = true)
    protected String reglevlname;
    @XmlElement(name = "CANREG", required = true)
    protected String canreg;
    @XmlElement(name = "TOTCOST", required = true)
    protected String totcost;
    @XmlElement(name = "SCHEMA_TYPE", required = true)
    protected String schematype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeedate() {
        return seedate;
    }

    public void setSeedate(String seedate) {
        this.seedate = seedate;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNooncode() {
        return nooncode;
    }

    public void setNooncode(String nooncode) {
        this.nooncode = nooncode;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
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

    public String getTellmt() {
        return tellmt;
    }

    public void setTellmt(String tellmt) {
        this.tellmt = tellmt;
    }

    public String getTelreged() {
        return telreged;
    }

    public void setTelreged(String telreged) {
        this.telreged = telreged;
    }

    public String getReglevlcode() {
        return reglevlcode;
    }

    public void setReglevlcode(String reglevlcode) {
        this.reglevlcode = reglevlcode;
    }

    public String getReglevlname() {
        return reglevlname;
    }

    public void setReglevlname(String reglevlname) {
        this.reglevlname = reglevlname;
    }

    public String getCanreg() {
        return canreg;
    }

    public void setCanreg(String canreg) {
        this.canreg = canreg;
    }

    public String getTotcost() {
        return totcost;
    }

    public void setTotcost(String totcost) {
        this.totcost = totcost;
    }

    public String getSchematype() {
        return schematype;
    }

    public void setSchematype(String schematype) {
        this.schematype = schematype;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取seedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEEDATE() {
        return seedate;
    }

    /**
     * 设置seedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEEDATE(String value) {
        this.seedate = value;
    }

    /**
     * 获取week属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEEK() {
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
    public void setWEEK(String value) {
        this.week = value;
    }

    /**
     * 获取nooncode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOONCODE() {
        return nooncode;
    }

    /**
     * 设置nooncode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOONCODE(String value) {
        this.nooncode = value;
    }

    /**
     * 获取begintime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGINTIME() {
        return begintime;
    }

    /**
     * 设置begintime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGINTIME(String value) {
        this.begintime = value;
    }

    /**
     * 获取endtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDTIME() {
        return endtime;
    }

    /**
     * 设置endtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDTIME(String value) {
        this.endtime = value;
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

    /**
     * 获取tellmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELLMT() {
        return tellmt;
    }

    /**
     * 设置tellmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELLMT(String value) {
        this.tellmt = value;
    }

    /**
     * 获取telreged属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELREGED() {
        return telreged;
    }

    /**
     * 设置telreged属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELREGED(String value) {
        this.telreged = value;
    }

    /**
     * 获取reglevlcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGLEVLCODE() {
        return reglevlcode;
    }

    /**
     * 设置reglevlcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGLEVLCODE(String value) {
        this.reglevlcode = value;
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
     * 获取canreg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANREG() {
        return canreg;
    }

    /**
     * 设置canreg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANREG(String value) {
        this.canreg = value;
    }

    /**
     * 获取totcost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTCOST() {
        return totcost;
    }

    /**
     * 设置totcost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTCOST(String value) {
        this.totcost = value;
    }

    /**
     * 获取schematype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHEMATYPE() {
        return schematype;
    }

    /**
     * 设置schematype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHEMATYPE(String value) {
        this.schematype = value;
    }

}
