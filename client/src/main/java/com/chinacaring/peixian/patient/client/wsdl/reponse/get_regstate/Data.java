
package com.chinacaring.peixian.patient.client.wsdl.reponse.get_regstate;

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
 *         &lt;element name="GetRegState" type="{}GetRegState"/>
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
    "getRegState"
})
public class Data {

    @XmlElement(name = "GetRegState", required = true)
    protected GetRegState getRegState;

    /**
     * 获取getRegState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetRegState }
     *     
     */
    public GetRegState getGetRegState() {
        return getRegState;
    }

    /**
     * 设置getRegState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegState }
     *     
     */
    public void setGetRegState(GetRegState value) {
        this.getRegState = value;
    }

}
