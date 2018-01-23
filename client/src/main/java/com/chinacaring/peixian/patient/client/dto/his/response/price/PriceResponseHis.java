
package com.chinacaring.peixian.patient.client.dto.his.response.price;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datas" type="{}datasType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceResponseHis", propOrder = {
    "returnCode",
    "datas"
})
@XmlRootElement(name = "Response")
public class PriceResponseHis {

    protected List<String> returnCode;
    @XmlElement(required = true)
    protected DatasType datas;

    /**
     * Gets the value of the returnCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getReturnCode() {
        if (returnCode == null) {
            returnCode = new ArrayList<String>();
        }
        return this.returnCode;
    }

    /**
     * ��ȡdatas���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link DatasType }
     *
     */
    public DatasType getDatas() {
        return datas;
    }

    /**
     * ����datas���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link DatasType }
     *     
     */
    public void setDatas(DatasType value) {
        this.datas = value;
    }

}
