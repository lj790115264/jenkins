
package com.chinacaring.peixian.patient.client.dto.his.request.appointment;

import javax.xml.bind.annotation.*;


/**
 * <p>Request complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentRequestHis", propOrder = {
    "bookingNO",
    "patientNO",
    "bookingTime",
    "bookingType",
    "operCode"
})
@XmlRootElement(name = "Request")
public class AppointmentRequestHis {

    @XmlElement(required = true)
    protected String bookingNO;
    @XmlElement(required = true)
    protected String patientNO;
    @XmlElement(required = true)
    protected String bookingTime;
    @XmlElement(required = true)
    protected String bookingType;
    @XmlElement(required = true)
    protected String operCode;

    /**
     * ��ȡbookingNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingNO() {
        return bookingNO;
    }

    /**
     * ����bookingNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingNO(String value) {
        this.bookingNO = value;
    }

    /**
     * ��ȡpatientNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientNO() {
        return patientNO;
    }

    /**
     * ����patientNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientNO(String value) {
        this.patientNO = value;
    }

    /**
     * ��ȡbookingTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTime() {
        return bookingTime;
    }

    /**
     * ����bookingTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTime(String value) {
        this.bookingTime = value;
    }

    /**
     * ��ȡbookingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingType() {
        return bookingType;
    }

    /**
     * ����bookingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingType(String value) {
        this.bookingType = value;
    }

    /**
     * ��ȡoperCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * ����operCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperCode(String value) {
        this.operCode = value;
    }

}
