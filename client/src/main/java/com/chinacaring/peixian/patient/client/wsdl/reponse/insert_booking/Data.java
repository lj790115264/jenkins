
package com.chinacaring.peixian.patient.client.wsdl.reponse.insert_booking;

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
 *         &lt;element name="InsertBooking" type="{}InsertBooking"/>
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
    "insertBooking"
})
public class Data {

    @XmlElement(name = "InsertBooking", required = true)
    protected InsertBooking insertBooking;

    /**
     * 获取insertBooking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsertBooking }
     *     
     */
    public InsertBooking getInsertBooking() {
        return insertBooking;
    }

    /**
     * 设置insertBooking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsertBooking }
     *     
     */
    public void setInsertBooking(InsertBooking value) {
        this.insertBooking = value;
    }

}
