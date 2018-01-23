
package com.chinacaring.peixian.patient.client.wsdl.reponse.pacs_resultinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PacsResultInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PacsResultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HISPATIENTTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLINICPATIENTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INFEEPATIENTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STUDYID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CHECKSERIALNUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEVICETYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEVICENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STUDYSCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STUDYTIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STUDYSTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STUDYSTATUSNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPORTDESCRIBE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPORTDIAGNOSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacsResultInfo", propOrder = {
    "hispatienttype",
    "clinicpatientid",
    "infeepatientid",
    "studyid",
    "checkserialnum",
    "patientname",
    "sex",
    "age",
    "devicetype",
    "devicename",
    "studyscription",
    "studytime",
    "studystatus",
    "studystatusname",
    "reportdescribe",
    "reportdiagnose",
    "docname"
})
public class PacsResultInfo {

    @XmlElement(name = "HISPATIENTTYPE", required = true)
    protected String hispatienttype;
    @XmlElement(name = "CLINICPATIENTID", required = true)
    protected String clinicpatientid;
    @XmlElement(name = "INFEEPATIENTID", required = true)
    protected String infeepatientid;
    @XmlElement(name = "STUDYID", required = true)
    protected String studyid;
    @XmlElement(name = "CHECKSERIALNUM", required = true)
    protected String checkserialnum;
    @XmlElement(name = "PATIENTNAME", required = true)
    protected String patientname;
    @XmlElement(name = "SEX", required = true)
    protected String sex;
    @XmlElement(name = "AGE", required = true)
    protected String age;
    @XmlElement(name = "DEVICETYPE", required = true)
    protected String devicetype;
    @XmlElement(name = "DEVICENAME", required = true)
    protected String devicename;
    @XmlElement(name = "STUDYSCRIPTION", required = true)
    protected String studyscription;
    @XmlElement(name = "STUDYTIME", required = true)
    protected String studytime;
    @XmlElement(name = "STUDYSTATUS", required = true)
    protected String studystatus;
    @XmlElement(name = "STUDYSTATUSNAME", required = true)
    protected String studystatusname;
    @XmlElement(name = "REPORTDESCRIBE", required = true)
    protected String reportdescribe;
    @XmlElement(name = "REPORTDIAGNOSE", required = true)
    protected String reportdiagnose;
    @XmlElement(name = "DOCNAME", required = true)
    protected String docname;

    /**
     * 获取hispatienttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHISPATIENTTYPE() {
        return hispatienttype;
    }

    /**
     * 设置hispatienttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHISPATIENTTYPE(String value) {
        this.hispatienttype = value;
    }

    /**
     * 获取clinicpatientid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLINICPATIENTID() {
        return clinicpatientid;
    }

    /**
     * 设置clinicpatientid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLINICPATIENTID(String value) {
        this.clinicpatientid = value;
    }

    /**
     * 获取infeepatientid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFEEPATIENTID() {
        return infeepatientid;
    }

    /**
     * 设置infeepatientid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFEEPATIENTID(String value) {
        this.infeepatientid = value;
    }

    /**
     * 获取studyid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUDYID() {
        return studyid;
    }

    /**
     * 设置studyid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUDYID(String value) {
        this.studyid = value;
    }

    /**
     * 获取checkserialnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKSERIALNUM() {
        return checkserialnum;
    }

    /**
     * 设置checkserialnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKSERIALNUM(String value) {
        this.checkserialnum = value;
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
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEX() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEX(String value) {
        this.sex = value;
    }

    /**
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGE() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGE(String value) {
        this.age = value;
    }

    /**
     * 获取devicetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEVICETYPE() {
        return devicetype;
    }

    /**
     * 设置devicetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEVICETYPE(String value) {
        this.devicetype = value;
    }

    /**
     * 获取devicename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEVICENAME() {
        return devicename;
    }

    /**
     * 设置devicename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEVICENAME(String value) {
        this.devicename = value;
    }

    /**
     * 获取studyscription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUDYSCRIPTION() {
        return studyscription;
    }

    /**
     * 设置studyscription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUDYSCRIPTION(String value) {
        this.studyscription = value;
    }

    /**
     * 获取studytime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUDYTIME() {
        return studytime;
    }

    /**
     * 设置studytime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUDYTIME(String value) {
        this.studytime = value;
    }

    /**
     * 获取studystatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUDYSTATUS() {
        return studystatus;
    }

    /**
     * 设置studystatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUDYSTATUS(String value) {
        this.studystatus = value;
    }

    /**
     * 获取studystatusname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUDYSTATUSNAME() {
        return studystatusname;
    }

    /**
     * 设置studystatusname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUDYSTATUSNAME(String value) {
        this.studystatusname = value;
    }

    /**
     * 获取reportdescribe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTDESCRIBE() {
        return reportdescribe;
    }

    /**
     * 设置reportdescribe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTDESCRIBE(String value) {
        this.reportdescribe = value;
    }

    /**
     * 获取reportdiagnose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTDIAGNOSE() {
        return reportdiagnose;
    }

    /**
     * 设置reportdiagnose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTDIAGNOSE(String value) {
        this.reportdiagnose = value;
    }

    /**
     * 获取docname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNAME() {
        return docname;
    }

    /**
     * 设置docname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNAME(String value) {
        this.docname = value;
    }

}
