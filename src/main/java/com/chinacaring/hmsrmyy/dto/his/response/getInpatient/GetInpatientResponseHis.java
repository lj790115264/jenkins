
package com.chinacaring.hmsrmyy.dto.his.response.getInpatient;

import javax.xml.bind.annotation.*;


/**
 * <p>ResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inpatientNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inpatientSeq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inhosTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inbalance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInpatientResponseHis", propOrder = {
    "returnCode",
    "returnDesc",
    "inpatientNo",
    "inpatientSeq",
    "deptCode",
    "deptName",
    "inhosTime",
    "inbalance"
})
@XmlRootElement(name = "Response")
public class GetInpatientResponseHis {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnDesc;
    @XmlElement(required = true)
    protected String inpatientNo;
    @XmlElement(required = true)
    protected String inpatientSeq;
    @XmlElement(required = true)
    protected String deptCode;
    @XmlElement(required = true)
    protected String deptName;
    @XmlElement(required = true)
    protected String inhosTime;
    @XmlElement(required = true)
    protected String inbalance;

    /**
     * ��ȡreturnCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * ����returnCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * ��ȡreturnDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDesc() {
        return returnDesc;
    }

    /**
     * ����returnDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDesc(String value) {
        this.returnDesc = value;
    }

    /**
     * ��ȡinpatientNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInpatientNo() {
        return inpatientNo;
    }

    /**
     * ����inpatientNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInpatientNo(String value) {
        this.inpatientNo = value;
    }

    /**
     * ��ȡinpatientSeq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInpatientSeq() {
        return inpatientSeq;
    }

    /**
     * ����inpatientSeq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInpatientSeq(String value) {
        this.inpatientSeq = value;
    }

    /**
     * ��ȡdeptCode���Ե�ֵ��
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
     * ����deptCode���Ե�ֵ��
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
     * ��ȡdeptName���Ե�ֵ��
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
     * ����deptName���Ե�ֵ��
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
     * ��ȡinhosTime���Ե�ֵ��
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
     * ����inhosTime���Ե�ֵ��
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
     * ��ȡinbalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInbalance() {
        return inbalance;
    }

    /**
     * ����inbalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInbalance(String value) {
        this.inbalance = value;
    }

}
