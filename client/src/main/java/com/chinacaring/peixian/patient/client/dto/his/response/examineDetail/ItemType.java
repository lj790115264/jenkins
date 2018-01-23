
package com.chinacaring.peixian.patient.client.dto.his.response.examineDetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="25020101"/>
 *               &lt;enumeration value="25020102"/>
 *               &lt;enumeration value="25020103"/>
 *               &lt;enumeration value="25020104"/>
 *               &lt;enumeration value="25020105"/>
 *               &lt;enumeration value="25020106"/>
 *               &lt;enumeration value="25020107"/>
 *               &lt;enumeration value="250104006"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="itemName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AT��"/>
 *               &lt;enumeration value="PT��Ѫøԭʱ��"/>
 *               &lt;enumeration value="INR���ʻ���׼����"/>
 *               &lt;enumeration value="APTT�������Ѫ"/>
 *               &lt;enumeration value="TT��Ѫøʱ��"/>
 *               &lt;enumeration value="FIB��ά����ԭ"/>
 *               &lt;enumeration value="D-D������"/>
 *               &lt;enumeration value="FDP"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="result">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="67.30"/>
 *               &lt;enumeration value="15.30"/>
 *               &lt;enumeration value="1.35"/>
 *               &lt;enumeration value="36.30"/>
 *               &lt;enumeration value="15.70"/>
 *               &lt;enumeration value="3.92"/>
 *               &lt;enumeration value="480.00"/>
 *               &lt;enumeration value="1.94"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="resultRef">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="75.00��125.00"/>
 *               &lt;enumeration value="11.00��15.00"/>
 *               &lt;enumeration value="0.80��1.50"/>
 *               &lt;enumeration value="20.00��40.00"/>
 *               &lt;enumeration value="14.00��21.00"/>
 *               &lt;enumeration value="2.00��4.00"/>
 *               &lt;enumeration value="1.00��1000.00"/>
 *               &lt;enumeration value="0.00��5.00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isDanger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="%"/>
 *               &lt;enumeration value="s"/>
 *               &lt;enumeration value="g/L"/>
 *               &lt;enumeration value="ug/L"/>
 *               &lt;enumeration value="ug/ml"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="resultFlag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="��"/>
 *               &lt;enumeration value="��"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="itemIndex">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "reportNo",
    "itemId",
    "itemName",
    "result",
    "resultRef",
    "isDanger",
    "unit",
    "resultFlag",
    "itemIndex"
})
public class ItemType {

    @XmlElement(required = true)
    protected String reportNo;
    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true)
    protected String resultRef;
    @XmlElement(required = true)
    protected String isDanger;
    @XmlElement(required = true)
    protected String unit;
    @XmlElement(required = true)
    protected String resultFlag;
    @XmlElement(required = true)
    protected String itemIndex;

    /**
     * ��ȡreportNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportNo() {
        return reportNo;
    }

    /**
     * ����reportNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportNo(String value) {
        this.reportNo = value;
    }

    /**
     * ��ȡitemId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * ����itemId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * ��ȡitemName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * ����itemName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * ��ȡresult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * ����result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * ��ȡresultRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultRef() {
        return resultRef;
    }

    /**
     * ����resultRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultRef(String value) {
        this.resultRef = value;
    }

    /**
     * ��ȡisDanger���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDanger() {
        return isDanger;
    }

    /**
     * ����isDanger���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDanger(String value) {
        this.isDanger = value;
    }

    /**
     * ��ȡunit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * ����unit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * ��ȡresultFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultFlag() {
        return resultFlag;
    }

    /**
     * ����resultFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultFlag(String value) {
        this.resultFlag = value;
    }

    /**
     * ��ȡitemIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIndex() {
        return itemIndex;
    }

    /**
     * ����itemIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIndex(String value) {
        this.itemIndex = value;
    }

}
