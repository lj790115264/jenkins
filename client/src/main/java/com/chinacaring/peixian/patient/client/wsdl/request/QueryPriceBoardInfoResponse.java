
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
 *         &lt;element name="QueryPriceBoardInfoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "queryPriceBoardInfoResult"
})
@XmlRootElement(name = "QueryPriceBoardInfoResponse")
public class QueryPriceBoardInfoResponse {

    @XmlElement(name = "QueryPriceBoardInfoResult")
    protected String queryPriceBoardInfoResult;

    /**
     * ��ȡqueryPriceBoardInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryPriceBoardInfoResult() {
        return queryPriceBoardInfoResult;
    }

    /**
     * ����queryPriceBoardInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryPriceBoardInfoResult(String value) {
        this.queryPriceBoardInfoResult = value;
    }

}
