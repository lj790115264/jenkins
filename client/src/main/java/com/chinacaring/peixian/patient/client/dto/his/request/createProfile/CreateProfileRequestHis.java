
package com.chinacaring.peixian.patient.client.dto.his.request.createProfile;

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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="homeAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ICNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "name",
    "age",
    "dateBirth",
    "familyName",
    "homeAddress",
    "phoneNO",
    "icno"
})
@XmlRootElement(name = "Request")
public class CreateProfileRequestHis {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Age", required = true)
    protected String age;
    @XmlElement(required = true)
    protected String dateBirth;
    @XmlElement(required = true)
    protected String familyName;
    @XmlElement(required = true)
    protected String homeAddress;
    @XmlElement(required = true)
    protected String phoneNO;
    @XmlElement(name = "ICNO", required = true)
    protected String icno;


    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * ����age���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
    }

    /**
     * ��ȡdateBirth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateBirth() {
        return dateBirth;
    }

    /**
     * ����dateBirth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateBirth(String value) {
        this.dateBirth = value;
    }

    /**
     * ��ȡfamilyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * ����familyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * ��ȡhomeAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * ����homeAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAddress(String value) {
        this.homeAddress = value;
    }

    /**
     * ��ȡphoneNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNO() {
        return phoneNO;
    }

    /**
     * ����phoneNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNO(String value) {
        this.phoneNO = value;
    }

    /**
     * ��ȡicno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICNO() {
        return icno;
    }

    /**
     * ����icno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICNO(String value) {
        this.icno = value;
    }

}
