
package com.chinacaring.peixian.patient.client.dto.his.response.price;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>dataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="dataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOARD_STYLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_NAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="�����ͼ�ı���-Y"/>
 *               &lt;enumeration value="������ѧ��Ӱ"/>
 *               &lt;enumeration value="���澭ʳ�ܳ����Ķ�ͼ"/>
 *               &lt;enumeration value="���о�ʳ�ܳ����Ķ�ͼ"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="220800008-Y"/>
 *               &lt;enumeration value="220302010"/>
 *               &lt;enumeration value="220600005"/>
 *               &lt;enumeration value="220600006"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_PRICE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="65"/>
 *               &lt;enumeration value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_MEASURE_UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MANUFACTORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSTRUCTIONS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FORMATS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="����������ѧ��Ӱ"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REMARK">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="�����۲�B��"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREATE_TIME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2015/5/30 10:16:05"/>
 *               &lt;enumeration value="2011/7/1 11:09:21"/>
 *               &lt;enumeration value="2011/6/9 14:32:47"/>
 *               &lt;enumeration value="2011/6/9 14:33:17"/>
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
@XmlType(name = "dataType", propOrder = {
    "boardstyle",
    "itemname",
    "itemcode",
    "itemprice",
    "itemcategory",
    "itemmeasureunit",
    "manufactory",
    "instructions",
    "formats",
    "remark",
    "createtime"
})
public class DataType {

    @XmlElement(name = "BOARD_STYLE", required = true)
    protected String boardstyle;
    @XmlElement(name = "ITEM_NAME", required = true)
    protected String itemname;
    @XmlElement(name = "ITEM_CODE", required = true)
    protected String itemcode;
    @XmlElement(name = "ITEM_PRICE", required = true)
    protected String itemprice;
    @XmlElement(name = "ITEM_CATEGORY", required = true)
    protected String itemcategory;
    @XmlElement(name = "ITEM_MEASURE_UNIT", required = true)
    protected String itemmeasureunit;
    @XmlElement(name = "MANUFACTORY", required = true)
    protected String manufactory;
    @XmlElement(name = "INSTRUCTIONS", required = true)
    protected String instructions;
    @XmlElement(name = "FORMATS", required = true)
    protected String formats;
    @XmlElement(name = "REMARK", required = true)
    protected String remark;
    @XmlElement(name = "CREATE_TIME", required = true)
    protected String createtime;

    /**
     * ��ȡboardstyle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOARDSTYLE() {
        return boardstyle;
    }

    /**
     * ����boardstyle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOARDSTYLE(String value) {
        this.boardstyle = value;
    }

    /**
     * ��ȡitemname���Ե�ֵ��
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
     * ����itemname���Ե�ֵ��
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
     * ��ȡitemcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCODE() {
        return itemcode;
    }

    /**
     * ����itemcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCODE(String value) {
        this.itemcode = value;
    }

    /**
     * ��ȡitemprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMPRICE() {
        return itemprice;
    }

    /**
     * ����itemprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMPRICE(String value) {
        this.itemprice = value;
    }

    /**
     * ��ȡitemcategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCATEGORY() {
        return itemcategory;
    }

    /**
     * ����itemcategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCATEGORY(String value) {
        this.itemcategory = value;
    }

    /**
     * ��ȡitemmeasureunit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMMEASUREUNIT() {
        return itemmeasureunit;
    }

    /**
     * ����itemmeasureunit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMMEASUREUNIT(String value) {
        this.itemmeasureunit = value;
    }

    /**
     * ��ȡmanufactory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTORY() {
        return manufactory;
    }

    /**
     * ����manufactory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTORY(String value) {
        this.manufactory = value;
    }

    /**
     * ��ȡinstructions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRUCTIONS() {
        return instructions;
    }

    /**
     * ����instructions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRUCTIONS(String value) {
        this.instructions = value;
    }

    /**
     * ��ȡformats���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATS() {
        return formats;
    }

    /**
     * ����formats���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATS(String value) {
        this.formats = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK(String value) {
        this.remark = value;
    }

    /**
     * ��ȡcreatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATETIME() {
        return createtime;
    }

    /**
     * ����createtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATETIME(String value) {
        this.createtime = value;
    }

}
