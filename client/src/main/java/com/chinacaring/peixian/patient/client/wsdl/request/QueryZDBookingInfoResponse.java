
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
 *         &lt;element name="QueryZDBookingInfoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "queryZDBookingInfoResult"
})
@XmlRootElement(name = "QueryZDBookingInfoResponse")
public class QueryZDBookingInfoResponse {

    @XmlElement(name = "QueryZDBookingInfoResult")
    protected String queryZDBookingInfoResult;

    /**
     * ��ȡqueryZDBookingInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryZDBookingInfoResult() {
        return queryZDBookingInfoResult;
    }

    /**
     * ����queryZDBookingInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryZDBookingInfoResult(String value) {
        this.queryZDBookingInfoResult = value;
    }

}
