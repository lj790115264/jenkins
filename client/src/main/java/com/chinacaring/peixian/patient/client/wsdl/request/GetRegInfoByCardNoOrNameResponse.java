
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
 *         &lt;element name="GetRegInfoByCardNoOrNameResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getRegInfoByCardNoOrNameResult"
})
@XmlRootElement(name = "GetRegInfoByCardNoOrNameResponse")
public class GetRegInfoByCardNoOrNameResponse {

    @XmlElement(name = "GetRegInfoByCardNoOrNameResult")
    protected String getRegInfoByCardNoOrNameResult;

    /**
     * ��ȡgetRegInfoByCardNoOrNameResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetRegInfoByCardNoOrNameResult() {
        return getRegInfoByCardNoOrNameResult;
    }

    /**
     * ����getRegInfoByCardNoOrNameResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetRegInfoByCardNoOrNameResult(String value) {
        this.getRegInfoByCardNoOrNameResult = value;
    }

}