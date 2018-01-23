
package com.chinacaring.peixian.patient.client.wsdl.reponse.feelist_by_cliniccode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FeeTable complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FeeTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECIPE_KEY">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1750376811"/>
 *               &lt;enumeration value="1750376911"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RECIPE_NO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="17503768"/>
 *               &lt;enumeration value="17503769"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRANS_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FEE_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="019"/>
 *               &lt;enumeration value="001"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DRUG_FLAG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="F00000008887"/>
 *               &lt;enumeration value="Y00000002416"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITEM_NAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ct头部大血管成像"/>
 *               &lt;enumeration value="0.9%氯化钠注射液(非PVC)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UNIT_PRICE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="990"/>
 *               &lt;enumeration value="1.70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TOT_COST">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="990"/>
 *               &lt;enumeration value="1.70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOC_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCDEPT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXEC_DEPTCODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="6001"/>
 *               &lt;enumeration value="4001"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXEC_DEPTNAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="CT室"/>
 *               &lt;enumeration value="西药房"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MO_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAY_FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVOICENO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPECS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEEDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COST_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OPER_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONFIRM_FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ITEM_CLASS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ct检查费"/>
 *               &lt;enumeration value="西药"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ORDER_NO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="57969004"/>
 *               &lt;enumeration value="57969005"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUB_ORDER_NO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="34925210"/>
 *               &lt;enumeration value="34925209"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRICE_UNIT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="次"/>
 *               &lt;enumeration value="袋"/>
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
@XmlType(name = "FeeTable", propOrder = {
    "recipekey",
    "recipeno",
    "seqno",
    "transtype",
    "feecode",
    "drugflag",
    "itemcode",
    "itemname",
    "qty",
    "unitprice",
    "totcost",
    "docname",
    "docdeptname",
    "execdeptcode",
    "execdeptname",
    "modate",
    "payflag",
    "invoiceno",
    "specs",
    "feedate",
    "costsource",
    "opercode",
    "confirmflag",
    "itemclass",
    "orderno",
    "suborderno",
    "name",
    "patientid",
    "priceunit"
})
public class FeeTable {

    @XmlElement(name = "RECIPE_KEY", required = true)
    protected String recipekey;
    @XmlElement(name = "RECIPE_NO", required = true)
    protected String recipeno;
    @XmlElement(name = "SEQNO", required = true)
    protected String seqno;
    @XmlElement(name = "TRANS_TYPE", required = true)
    protected String transtype;
    @XmlElement(name = "FEE_CODE", required = true)
    protected String feecode;
    @XmlElement(name = "DRUG_FLAG", required = true)
    protected String drugflag;
    @XmlElement(name = "ITEM_CODE", required = true)
    protected String itemcode;
    @XmlElement(name = "ITEM_NAME", required = true)
    protected String itemname;
    @XmlElement(name = "QTY", required = true)
    protected String qty;
    @XmlElement(name = "UNIT_PRICE", required = true)
    protected String unitprice;
    @XmlElement(name = "TOT_COST", required = true)
    protected String totcost;
    @XmlElement(name = "DOC_NAME", required = true)
    protected String docname;
    @XmlElement(name = "DOCDEPT_NAME", required = true)
    protected String docdeptname;
    @XmlElement(name = "EXEC_DEPTCODE", required = true)
    protected String execdeptcode;
    @XmlElement(name = "EXEC_DEPTNAME", required = true)
    protected String execdeptname;
    @XmlElement(name = "MO_DATE", required = true)
    protected String modate;
    @XmlElement(name = "PAY_FLAG", required = true)
    protected String payflag;
    @XmlElement(name = "INVOICENO", required = true)
    protected String invoiceno;
    @XmlElement(name = "SPECS")
    protected String specs;
    @XmlElement(name = "FEEDATE", required = true)
    protected String feedate;
    @XmlElement(name = "COST_SOURCE", required = true)
    protected String costsource;
    @XmlElement(name = "OPER_CODE", required = true)
    protected String opercode;
    @XmlElement(name = "CONFIRM_FLAG", required = true)
    protected String confirmflag;
    @XmlElement(name = "ITEM_CLASS", required = true)
    protected String itemclass;
    @XmlElement(name = "ORDER_NO", required = true)
    protected String orderno;
    @XmlElement(name = "SUB_ORDER_NO", required = true)
    protected String suborderno;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "PATIENTID", required = true)
    protected String patientid;
    @XmlElement(name = "PRICE_UNIT", required = true)
    protected String priceunit;

    /**
     * 获取recipekey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIPEKEY() {
        return recipekey;
    }

    /**
     * 设置recipekey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIPEKEY(String value) {
        this.recipekey = value;
    }

    /**
     * 获取recipeno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIPENO() {
        return recipeno;
    }

    /**
     * 设置recipeno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIPENO(String value) {
        this.recipeno = value;
    }

    /**
     * 获取seqno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQNO() {
        return seqno;
    }

    /**
     * 设置seqno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQNO(String value) {
        this.seqno = value;
    }

    /**
     * 获取transtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSTYPE() {
        return transtype;
    }

    /**
     * 设置transtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSTYPE(String value) {
        this.transtype = value;
    }

    /**
     * 获取feecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEECODE() {
        return feecode;
    }

    /**
     * 设置feecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEECODE(String value) {
        this.feecode = value;
    }

    /**
     * 获取drugflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUGFLAG() {
        return drugflag;
    }

    /**
     * 设置drugflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUGFLAG(String value) {
        this.drugflag = value;
    }

    /**
     * 获取itemcode属性的值。
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
     * 设置itemcode属性的值。
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
     * 获取qty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQTY() {
        return qty;
    }

    /**
     * 设置qty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQTY(String value) {
        this.qty = value;
    }

    /**
     * 获取unitprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITPRICE() {
        return unitprice;
    }

    /**
     * 设置unitprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITPRICE(String value) {
        this.unitprice = value;
    }

    /**
     * 获取totcost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTCOST() {
        return totcost;
    }

    /**
     * 设置totcost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTCOST(String value) {
        this.totcost = value;
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

    /**
     * 获取docdeptname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCDEPTNAME() {
        return docdeptname;
    }

    /**
     * 设置docdeptname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCDEPTNAME(String value) {
        this.docdeptname = value;
    }

    /**
     * 获取execdeptcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXECDEPTCODE() {
        return execdeptcode;
    }

    /**
     * 设置execdeptcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXECDEPTCODE(String value) {
        this.execdeptcode = value;
    }

    /**
     * 获取execdeptname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXECDEPTNAME() {
        return execdeptname;
    }

    /**
     * 设置execdeptname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXECDEPTNAME(String value) {
        this.execdeptname = value;
    }

    /**
     * 获取modate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODATE() {
        return modate;
    }

    /**
     * 设置modate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODATE(String value) {
        this.modate = value;
    }

    /**
     * 获取payflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYFLAG() {
        return payflag;
    }

    /**
     * 设置payflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYFLAG(String value) {
        this.payflag = value;
    }

    /**
     * 获取invoiceno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICENO() {
        return invoiceno;
    }

    /**
     * 设置invoiceno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICENO(String value) {
        this.invoiceno = value;
    }

    /**
     * 获取specs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPECS() {
        return specs;
    }

    /**
     * 设置specs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPECS(String value) {
        this.specs = value;
    }

    /**
     * 获取feedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEEDATE() {
        return feedate;
    }

    /**
     * 设置feedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEEDATE(String value) {
        this.feedate = value;
    }

    /**
     * 获取costsource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTSOURCE() {
        return costsource;
    }

    /**
     * 设置costsource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTSOURCE(String value) {
        this.costsource = value;
    }

    /**
     * 获取opercode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERCODE() {
        return opercode;
    }

    /**
     * 设置opercode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERCODE(String value) {
        this.opercode = value;
    }

    /**
     * 获取confirmflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMFLAG() {
        return confirmflag;
    }

    /**
     * 设置confirmflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMFLAG(String value) {
        this.confirmflag = value;
    }

    /**
     * 获取itemclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCLASS() {
        return itemclass;
    }

    /**
     * 设置itemclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCLASS(String value) {
        this.itemclass = value;
    }

    /**
     * 获取orderno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERNO() {
        return orderno;
    }

    /**
     * 设置orderno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERNO(String value) {
        this.orderno = value;
    }

    /**
     * 获取suborderno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBORDERNO() {
        return suborderno;
    }

    /**
     * 设置suborderno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBORDERNO(String value) {
        this.suborderno = value;
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
     * 获取priceunit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICEUNIT() {
        return priceunit;
    }

    /**
     * 设置priceunit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICEUNIT(String value) {
        this.priceunit = value;
    }

}
