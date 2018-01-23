
package com.chinacaring.peixian.patient.client.wsdl.reponse.save_fee;

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
 *         &lt;element name="SaveFeeSoap" type="{}SaveFeeSoap"/>
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
    "saveFeeSoap"
})
public class Data {

    @XmlElement(name = "SaveFeeSoap", required = true)
    protected SaveFeeSoap saveFeeSoap;

    /**
     * 获取saveFeeSoap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaveFeeSoap }
     *     
     */
    public SaveFeeSoap getSaveFeeSoap() {
        return saveFeeSoap;
    }

    /**
     * 设置saveFeeSoap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaveFeeSoap }
     *     
     */
    public void setSaveFeeSoap(SaveFeeSoap value) {
        this.saveFeeSoap = value;
    }

}
