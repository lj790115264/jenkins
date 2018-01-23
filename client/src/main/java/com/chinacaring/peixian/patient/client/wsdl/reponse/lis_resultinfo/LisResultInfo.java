
package com.chinacaring.peixian.patient.client.wsdl.reponse.lis_resultinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LisResultInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LisResultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TESTDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENTSEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENTAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HISITEMNAMELIST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCEPTTIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEMNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPORTVALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RANGEINFO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RESULTFLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MACHINEID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SAMPLEID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BARCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LisResultInfo", propOrder = {
    "testdate",
    "patientid",
    "patientname",
    "patientsex",
    "patientage",
    "hisitemnamelist",
    "accepttime",
    "itemname",
    "reportvalue",
    "rangeinfo",
    "unit",
    "resultflag",
    "machineid",
    "sampleid",
    "barcode"
})
public class LisResultInfo {

    @XmlElement(name = "TESTDATE", required = true)
    protected String testdate;
    @XmlElement(name = "PATIENTID", required = true)
    protected String patientid;
    @XmlElement(name = "PATIENTNAME", required = true)
    protected String patientname;
    @XmlElement(name = "PATIENTSEX", required = true)
    protected String patientsex;
    @XmlElement(name = "PATIENTAGE", required = true)
    protected String patientage;
    @XmlElement(name = "HISITEMNAMELIST", required = true)
    protected String hisitemnamelist;
    @XmlElement(name = "ACCEPTTIME", required = true)
    protected String accepttime;
    @XmlElement(name = "ITEMNAME", required = true)
    protected String itemname;
    @XmlElement(name = "REPORTVALUE", required = true)
    protected String reportvalue;
    @XmlElement(name = "RANGEINFO", required = true)
    protected String rangeinfo;
    @XmlElement(name = "UNIT", required = true)
    protected String unit;
    @XmlElement(name = "RESULTFLAG", required = true)
    protected String resultflag;
    @XmlElement(name = "MACHINEID", required = true)
    protected String machineid;
    @XmlElement(name = "SAMPLEID", required = true)
    protected String sampleid;
    @XmlElement(name = "BARCODE", required = true)
    protected String barcode;

    /**
     * 获取testdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTDATE() {
        return testdate;
    }

    /**
     * 设置testdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTDATE(String value) {
        this.testdate = value;
    }

    /**
     * 获取patientid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTID() {
        return patientid;
    }

    /**
     * 设置patientid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTID(String value) {
        this.patientid = value;
    }

    /**
     * 获取patientname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTNAME() {
        return patientname;
    }

    /**
     * 设置patientname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTNAME(String value) {
        this.patientname = value;
    }

    /**
     * 获取patientsex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTSEX() {
        return patientsex;
    }

    /**
     * 设置patientsex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTSEX(String value) {
        this.patientsex = value;
    }

    /**
     * 获取patientage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTAGE() {
        return patientage;
    }

    /**
     * 设置patientage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTAGE(String value) {
        this.patientage = value;
    }

    /**
     * 获取hisitemnamelist属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHISITEMNAMELIST() {
        return hisitemnamelist;
    }

    /**
     * 设置hisitemnamelist属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHISITEMNAMELIST(String value) {
        this.hisitemnamelist = value;
    }

    /**
     * 获取accepttime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCEPTTIME() {
        return accepttime;
    }

    /**
     * 设置accepttime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCEPTTIME(String value) {
        this.accepttime = value;
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
     * 获取reportvalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTVALUE() {
        return reportvalue;
    }

    /**
     * 设置reportvalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTVALUE(String value) {
        this.reportvalue = value;
    }

    /**
     * 获取rangeinfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRANGEINFO() {
        return rangeinfo;
    }

    /**
     * 设置rangeinfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRANGEINFO(String value) {
        this.rangeinfo = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIT() {
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
    public void setUNIT(String value) {
        this.unit = value;
    }

    /**
     * 获取resultflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULTFLAG() {
        return resultflag;
    }

    /**
     * 设置resultflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULTFLAG(String value) {
        this.resultflag = value;
    }

    /**
     * 获取machineid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACHINEID() {
        return machineid;
    }

    /**
     * 设置machineid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACHINEID(String value) {
        this.machineid = value;
    }

    /**
     * 获取sampleid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAMPLEID() {
        return sampleid;
    }

    /**
     * 设置sampleid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAMPLEID(String value) {
        this.sampleid = value;
    }

    /**
     * 获取barcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARCODE() {
        return barcode;
    }

    /**
     * 设置barcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARCODE(String value) {
        this.barcode = value;
    }

}
