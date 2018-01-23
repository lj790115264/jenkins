
package com.chinacaring.peixian.patient.client.wsdl.request;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsertSIRegisterTempResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "insertSIRegisterTempResult"
})
@XmlRootElement(name = "InsertSIRegisterTempResponse")
public class InsertSIRegisterTempResponse {

    @XmlElement(name = "InsertSIRegisterTempResult")
    protected String insertSIRegisterTempResult;

    /**
     * ��ȡinsertSIRegisterTempResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertSIRegisterTempResult() {
        return insertSIRegisterTempResult;
    }

    /**
     * ����insertSIRegisterTempResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertSIRegisterTempResult(String value) {
        this.insertSIRegisterTempResult = value;
    }

}
