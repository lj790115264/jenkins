
package com.chinacaring.hmsrmyy.dto.his.request.inbalanceList;

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
 *         &lt;element name="inpatientNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ICNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="daily" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InbalanceListRequestHis", propOrder = {
    "inpatientNo",
    "icno",
    "daily"
})
@XmlRootElement(name = "Request")
public class InbalanceListRequestHis {

    @XmlElement(required = true)
    protected String inpatientNo;
    @XmlElement(name = "ICNO", required = true)
    protected String icno;
    @XmlElement(required = true)
    protected String daily;


    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    /**
     * ��ȡinpatientNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInpatientNo() {
        return inpatientNo;
    }

    /**
     * ����inpatientNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInpatientNo(String value) {
        this.inpatientNo = value;
    }

    /**
     * ��ȡicno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICNO() {
        return icno;
    }

    /**
     * ����icno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICNO(String value) {
        this.icno = value;
    }

    /**
     * ��ȡdaily���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaily() {
        return daily;
    }

    /**
     * ����daily���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaily(String value) {
        this.daily = value;
    }

}
