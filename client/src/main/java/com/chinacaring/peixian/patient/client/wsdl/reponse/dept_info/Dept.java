
package com.chinacaring.peixian.patient.client.wsdl.reponse.dept_info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Dept complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Dept">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPTTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VALIDSTATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REGFLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dept", propOrder = {
    "deptcode",
    "deptname",
    "depttype",
    "branch",
    "validstate",
    "regflag"
})
public class Dept {

    @XmlElement(name = "DEPTCODE", required = true)
    protected String deptcode;
    @XmlElement(name = "DEPTNAME", required = true)
    protected String deptname;
    @XmlElement(name = "DEPTTYPE", required = true)
    protected String depttype;
    @XmlElement(name = "BRANCH", required = true)
    protected String branch;
    @XmlElement(name = "VALIDSTATE", required = true)
    protected String validstate;
    @XmlElement(name = "REGFLAG", required = true)
    protected String regflag;

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

    public String getDepttype() {
        return depttype;
    }

    public void setDepttype(String depttype) {
        this.depttype = depttype;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getValidstate() {
        return validstate;
    }

    public void setValidstate(String validstate) {
        this.validstate = validstate;
    }

    public String getRegflag() {
        return regflag;
    }

    public void setRegflag(String regflag) {
        this.regflag = regflag;
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
     * 获取depttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTTYPE() {
        return depttype;
    }

    /**
     * 设置depttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTTYPE(String value) {
        this.depttype = value;
    }

    /**
     * 获取branch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
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
    public void setBRANCH(String value) {
        this.branch = value;
    }

    /**
     * 获取validstate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDSTATE() {
        return validstate;
    }

    /**
     * 设置validstate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDSTATE(String value) {
        this.validstate = value;
    }

    /**
     * 获取regflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGFLAG() {
        return regflag;
    }

    /**
     * 设置regflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGFLAG(String value) {
        this.regflag = value;
    }

}
