
package com.chinacaring.hmsrmyy.dto.his.response.register;

import javax.xml.bind.annotation.*;


/**
 * <p>Response complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receiptNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seeNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterResponseHis", propOrder = {
    "returnCode",
    "returnDesc",
    "regNO",
    "invoiceNo",
    "receiptNo",
    "seeNO",
    "name"
})
@XmlRootElement(name = "Response")
public class RegisterResponseHis {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnDesc;
    @XmlElement(required = true)
    protected String regNO;
    @XmlElement(required = true)
    protected String invoiceNo;
    @XmlElement(required = true)
    protected String receiptNo;
    @XmlElement(required = true)
    protected String seeNO;
    @XmlElement(required = true)
    protected String name;

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
     * ��ȡregNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNO() {
        return regNO;
    }

    /**
     * ����regNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNO(String value) {
        this.regNO = value;
    }

    /**
     * ��ȡinvoiceNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * ����invoiceNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * ��ȡreceiptNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNo() {
        return receiptNo;
    }

    /**
     * ����receiptNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNo(String value) {
        this.receiptNo = value;
    }

    /**
     * ��ȡseeNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeeNO() {
        return seeNO;
    }

    /**
     * ����seeNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeeNO(String value) {
        this.seeNO = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
