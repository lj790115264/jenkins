
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
 *         &lt;element name="QueryPrefeeMasterResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "queryPrefeeMasterResult"
})
@XmlRootElement(name = "QueryPrefeeMasterResponse")
public class QueryPrefeeMasterResponse {

    @XmlElement(name = "QueryPrefeeMasterResult")
    protected String queryPrefeeMasterResult;

    /**
     * ��ȡqueryPrefeeMasterResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryPrefeeMasterResult() {
        return queryPrefeeMasterResult;
    }

    /**
     * ����queryPrefeeMasterResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryPrefeeMasterResult(String value) {
        this.queryPrefeeMasterResult = value;
    }

}
