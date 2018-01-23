
package com.chinacaring.peixian.patient.client.wsdl.reponse.query_patientdiag;

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
 *         &lt;element name="QueryPatientDiag" type="{}QueryPatientDiag" maxOccurs="unbounded" minOccurs="0"/>
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
    "queryPatientDiag"
})
public class Data {

    @XmlElement(name = "QueryPatientDiag")
    protected List<QueryPatientDiag> queryPatientDiag;

    /**
     * Gets the value of the queryPatientDiag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryPatientDiag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryPatientDiag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPatientDiag }
     * 
     * 
     */
    public List<QueryPatientDiag> getQueryPatientDiag() {
        if (queryPatientDiag == null) {
            queryPatientDiag = new ArrayList<QueryPatientDiag>();
        }
        return this.queryPatientDiag;
    }

}
