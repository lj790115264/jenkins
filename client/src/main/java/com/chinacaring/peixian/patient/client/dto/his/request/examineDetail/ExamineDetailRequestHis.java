
package com.chinacaring.peixian.patient.client.dto.his.request.examineDetail;

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
 *         &lt;element name="reportNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExamineDetailRequestHis", propOrder = {
    "reportNO"
})
@XmlRootElement(name = "Request")
public class ExamineDetailRequestHis {

    @XmlElement(required = true)
    protected String reportNO;

    /**
     * ��ȡreportNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportNO() {
        return reportNO;
    }

    /**
     * ����reportNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportNO(String value) {
        this.reportNO = value;
    }

}
