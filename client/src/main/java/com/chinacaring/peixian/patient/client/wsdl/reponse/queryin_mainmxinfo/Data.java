
package com.chinacaring.peixian.patient.client.wsdl.reponse.queryin_mainmxinfo;

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
 *         &lt;element name="QueryInMainMxInfo" type="{}QueryInMainMxInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "queryInMainMxInfo"
})
public class Data {

    @XmlElement(name = "QueryInMainMxInfo")
    protected List<QueryInMainMxInfo> queryInMainMxInfo;

    /**
     * Gets the value of the queryInMainMxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryInMainMxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryInMainMxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryInMainMxInfo }
     * 
     * 
     */
    public List<QueryInMainMxInfo> getQueryInMainMxInfo() {
        if (queryInMainMxInfo == null) {
            queryInMainMxInfo = new ArrayList<QueryInMainMxInfo>();
        }
        return this.queryInMainMxInfo;
    }

}
