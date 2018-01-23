
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_invoicemxinfo;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="QueryInvoiceMxInfo" type="{}QueryInvoiceMxInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "queryInvoiceMxInfo"
})
public class Data {

    @XmlElement(name = "QueryInvoiceMxInfo")
    protected List<QueryInvoiceMxInfo> queryInvoiceMxInfo;

    /**
     * Gets the value of the queryInvoiceMxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryInvoiceMxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryInvoiceMxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryInvoiceMxInfo }
     * 
     * 
     */
    public List<QueryInvoiceMxInfo> getQueryInvoiceMxInfo() {
        if (queryInvoiceMxInfo == null) {
            queryInvoiceMxInfo = new ArrayList<QueryInvoiceMxInfo>();
        }
        return this.queryInvoiceMxInfo;
    }

}
