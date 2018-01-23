
package com.chinacaring.peixian.patient.client.dto.his.response.inbalanceList;

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
 *         &lt;element name="datas" type="{}datasType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InbalanceListResponseHis", propOrder = {
    "returnCode",
    "returnDesc",
    "datas"
})
@XmlRootElement(name = "Response")
public class InbalanceListResponseHis {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnDesc;
    @XmlElement(required = true)
    protected DatasType datas;

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
     * ��ȡdatas���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DatasType }
     *     
     */
    public DatasType getDatas() {
        return datas;
    }

    /**
     * ����datas���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DatasType }
     *     
     */
    public void setDatas(DatasType value) {
        this.datas = value;
    }

}
