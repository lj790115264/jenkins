
package com.chinacaring.hmsrmyy.dto.his.request.outpatientConfirm;

import javax.xml.bind.annotation.*;


/**
 * <p>RequestType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reciptNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amountOfMoney" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutpatientConfirmRequestHis", propOrder = {
    "regNO",
    "reciptNO",
    "operCode",
    "payMode",
    "amountOfMoney",
    "transNo"
})
@XmlRootElement(name = "Request")
public class OutpatientConfirmRequestHis {

    @XmlElement(required = true)
    protected String regNO;
    @XmlElement(required = true)
    protected String reciptNO;
    @XmlElement(required = true)
    protected String operCode;
    @XmlElement(required = true)
    protected String payMode;
    @XmlElement(required = true)
    protected String amountOfMoney;
    @XmlElement(required = true)
    protected String transNo;

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
     * ��ȡreciptNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReciptNO() {
        return reciptNO;
    }

    /**
     * ����reciptNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReciptNO(String value) {
        this.reciptNO = value;
    }

    /**
     * ��ȡoperCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * ����operCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperCode(String value) {
        this.operCode = value;
    }

    /**
     * ��ȡpayMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * ����payMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * ��ȡamountOfMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * ����amountOfMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountOfMoney(String value) {
        this.amountOfMoney = value;
    }

    /**
     * ��ȡtransNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * ����transNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransNo(String value) {
        this.transNo = value;
    }

}
