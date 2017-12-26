
package com.chinacaring.hmsrmyy.dto.his.request.prescription;

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
 *         &lt;element name="isFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrescriptionRequestHis", propOrder = {
    "regNO",
    "isFee"
})
@XmlRootElement(name = "Request")
public class PrescriptionRequestHis {

    @XmlElement(required = true)
    protected String regNO;
    @XmlElement(required = true)
    protected String isFee;

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
     * ��ȡisFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFee() {
        return isFee;
    }

    /**
     * ����isFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFee(String value) {
        this.isFee = value;
    }

}
