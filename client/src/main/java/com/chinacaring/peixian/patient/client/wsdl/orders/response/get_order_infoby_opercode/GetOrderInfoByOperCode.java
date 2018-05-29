
package com.chinacaring.peixian.patient.client.wsdl.orders.response.get_order_infoby_opercode;

import javax.xml.bind.annotation.*;


/**
 * <p>GetOrderInfoByOperCode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetOrderInfoByOperCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECEIPT_NUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="51.37"/>
 *               &lt;enumeration value="802"/>
 *               &lt;enumeration value="132"/>
 *               &lt;enumeration value="70.40"/>
 *               &lt;enumeration value="1070"/>
 *               &lt;enumeration value="130"/>
 *               &lt;enumeration value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RECIEPT_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANS_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAY_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFUND_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFUND_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFUND_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFUND_WAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{}result" minOccurs="0"/>
 *         &lt;element name="Data" type="{}Data" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderInfoByOperCode", propOrder = {
    "receiptnum",
    "fee",
    "reciepttype",
    "name",
    "transtime",
    "paymode",
    "refundstatus",
    "refundfee",
    "refundtime",
    "refundway",
    "result",
    "data"
})
@XmlRootElement(name = "GetOrderInfoByOperCode")
public class GetOrderInfoByOperCode {

    @XmlElement(name = "RECEIPT_NUM")
    protected String receiptnum;
    @XmlElement(name = "FEE")
    protected String fee;
    @XmlElement(name = "RECIEPT_TYPE")
    protected String reciepttype;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "TRANS_TIME")
    protected String transtime;
    @XmlElement(name = "PAY_MODE")
    protected String paymode;
    @XmlElement(name = "REFUND_STATUS")
    protected String refundstatus;
    @XmlElement(name = "REFUND_FEE")
    protected String refundfee;
    @XmlElement(name = "REFUND_TIME")
    protected String refundtime;
    @XmlElement(name = "REFUND_WAY")
    protected String refundway;
    protected Result result;
    @XmlElement(name = "Data")
    protected Data data;

    /**
     * 获取receiptnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIPTNUM() {
        return receiptnum;
    }

    /**
     * 设置receiptnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIPTNUM(String value) {
        this.receiptnum = value;
    }

    /**
     * 获取fee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEE() {
        return fee;
    }

    /**
     * 设置fee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEE(String value) {
        this.fee = value;
    }

    /**
     * 获取reciepttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIEPTTYPE() {
        return reciepttype;
    }

    /**
     * 设置reciepttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIEPTTYPE(String value) {
        this.reciepttype = value;
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
     * 获取transtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSTIME() {
        return transtime;
    }

    /**
     * 设置transtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSTIME(String value) {
        this.transtime = value;
    }

    /**
     * 获取paymode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMODE() {
        return paymode;
    }

    /**
     * 设置paymode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMODE(String value) {
        this.paymode = value;
    }

    /**
     * 获取refundstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFUNDSTATUS() {
        return refundstatus;
    }

    /**
     * 设置refundstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFUNDSTATUS(String value) {
        this.refundstatus = value;
    }

    /**
     * 获取refundfee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFUNDFEE() {
        return refundfee;
    }

    /**
     * 设置refundfee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFUNDFEE(String value) {
        this.refundfee = value;
    }

    /**
     * 获取refundtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFUNDTIME() {
        return refundtime;
    }

    /**
     * 设置refundtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFUNDTIME(String value) {
        this.refundtime = value;
    }

    /**
     * 获取refundway属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFUNDWAY() {
        return refundway;
    }

    /**
     * 设置refundway属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFUNDWAY(String value) {
        this.refundway = value;
    }

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

}
