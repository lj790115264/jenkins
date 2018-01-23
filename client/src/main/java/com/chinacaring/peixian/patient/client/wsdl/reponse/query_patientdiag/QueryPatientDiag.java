
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_patientdiag;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryPatientDiag complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryPatientDiag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PATIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VISIT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INP_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIAGNOSIS_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIAGNOSIS_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIAGNOSIS_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIAGNOSIS_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPatientDiag", propOrder = {
    "patientid",
    "visitid",
    "inpno",
    "diagnosistype",
    "diagnosisno",
    "diagnosiscode",
    "diagnosisname"
})
public class QueryPatientDiag {

    @XmlElement(name = "PATIENT_ID", required = true)
    protected String patientid;
    @XmlElement(name = "VISIT_ID", required = true)
    protected String visitid;
    @XmlElement(name = "INP_NO", required = true)
    protected String inpno;
    @XmlElement(name = "DIAGNOSIS_TYPE", required = true)
    protected String diagnosistype;
    @XmlElement(name = "DIAGNOSIS_NO", required = true)
    protected String diagnosisno;
    @XmlElement(name = "DIAGNOSIS_CODE", required = true)
    protected String diagnosiscode;
    @XmlElement(name = "DIAGNOSIS_NAME", required = true)
    protected String diagnosisname;

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
     * 获取visitid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVISITID() {
        return visitid;
    }

    /**
     * 设置visitid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVISITID(String value) {
        this.visitid = value;
    }

    /**
     * 获取inpno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPNO() {
        return inpno;
    }

    /**
     * 设置inpno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPNO(String value) {
        this.inpno = value;
    }

    /**
     * 获取diagnosistype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIAGNOSISTYPE() {
        return diagnosistype;
    }

    /**
     * 设置diagnosistype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIAGNOSISTYPE(String value) {
        this.diagnosistype = value;
    }

    /**
     * 获取diagnosisno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIAGNOSISNO() {
        return diagnosisno;
    }

    /**
     * 设置diagnosisno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIAGNOSISNO(String value) {
        this.diagnosisno = value;
    }

    /**
     * 获取diagnosiscode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIAGNOSISCODE() {
        return diagnosiscode;
    }

    /**
     * 设置diagnosiscode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIAGNOSISCODE(String value) {
        this.diagnosiscode = value;
    }

    /**
     * 获取diagnosisname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIAGNOSISNAME() {
        return diagnosisname;
    }

    /**
     * 设置diagnosisname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIAGNOSISNAME(String value) {
        this.diagnosisname = value;
    }

}
