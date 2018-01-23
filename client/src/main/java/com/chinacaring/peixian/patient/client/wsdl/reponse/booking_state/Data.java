
package com.chinacaring.peixian.patient.client.wsdl.reponse.booking_state;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Data complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingState" type="{}BookingState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
    "bookingState"
})
public class Data {

    @XmlElement(name = "BookingState", required = true)
    protected BookingState bookingState;

    /**
     * 获取bookingState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingState }
     *     
     */
    public BookingState getBookingState() {
        return bookingState;
    }

    /**
     * 设置bookingState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingState }
     *     
     */
    public void setBookingState(BookingState value) {
        this.bookingState = value;
    }

}
