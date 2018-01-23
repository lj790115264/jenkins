
package com.chinacaring.peixian.patient.client.wsdl.reponse.insert_registertemp;

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
 *         &lt;element name="InsertRegisterTemp" type="{}InsertRegisterTemp"/>
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
    "insertRegisterTemp"
})
public class Data {

    @XmlElement(name = "InsertRegisterTemp", required = true)
    protected InsertRegisterTemp insertRegisterTemp;

    /**
     * 获取insertRegisterTemp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsertRegisterTemp }
     *     
     */
    public InsertRegisterTemp getInsertRegisterTemp() {
        return insertRegisterTemp;
    }

    /**
     * 设置insertRegisterTemp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsertRegisterTemp }
     *     
     */
    public void setInsertRegisterTemp(InsertRegisterTemp value) {
        this.insertRegisterTemp = value;
    }

}
