
package com.chinacaring.hmsrmyy.dto.his.request.register;

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
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="realName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ICNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookingFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="medicalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isReg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departmentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doctorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emplCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preRegTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookRegTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clinicFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterRequestHis", propOrder = {
    "scheduleId",
    "realName",
    "icno",
    "idType",
    "sex",
    "bookingFlag",
    "medicalType",
    "isReg",
    "departmentName",
    "deptCode",
    "doctorName",
    "emplCode",
    "preRegTime",
    "bookRegTime",
    "patientNo",
    "bookingNo",
    "clinicFee",
    "payMode",
    "transNo"
})
@XmlRootElement(name = "Request")
public class RegisterRequestHis {

    @XmlElement(required = true)
    protected String scheduleId;
    @XmlElement(required = true)
    protected String realName;
    @XmlElement(name = "ICNO", required = true)
    protected String icno;
    @XmlElement(name = "IDType", required = true)
    protected String idType;

    //手动set
    @XmlElement(name = "Sex", required = true)
    protected String sex;

    //手动set
    @XmlElement(required = true)
    protected String bookingFlag;
    @XmlElement(required = true)
    protected String medicalType;

    //手动set
    @XmlElement(required = true)
    protected String isReg;
    @XmlElement(required = true)
    protected String departmentName;
    @XmlElement(required = true)
    protected String deptCode;
    @XmlElement(required = true)
    protected String doctorName;
    @XmlElement(required = true)
    protected String emplCode;

    //手动set
    @XmlElement(required = true)
    protected String preRegTime;

    //手动set
    @XmlElement(required = true)
    protected String bookRegTime;
    @XmlElement(required = true)
    protected String patientNo;
    @XmlElement(required = true)
    protected String bookingNo;

    //手动set
    @XmlElement(required = true)
    protected String clinicFee;
    @XmlElement(required = true)
    protected String payMode;
    @XmlElement(required = true)
    protected String transNo;

    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }


    /**
     * ��ȡscheduleId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * ����scheduleId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
    }

    /**
     * ��ȡrealName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealName() {
        return realName;
    }

    /**
     * ����realName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealName(String value) {
        this.realName = value;
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

    /**
     * ��ȡidType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * ����idType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * ��ȡsex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * ����sex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * ��ȡbookingFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingFlag() {
        return bookingFlag;
    }

    /**
     * ����bookingFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingFlag(String value) {
        this.bookingFlag = value;
    }

    /**
     * ��ȡmedicalType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalType() {
        return medicalType;
    }

    /**
     * ����medicalType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalType(String value) {
        this.medicalType = value;
    }

    /**
     * ��ȡisReg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReg() {
        return isReg;
    }

    /**
     * ����isReg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReg(String value) {
        this.isReg = value;
    }

    /**
     * ��ȡdepartmentName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * ����departmentName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * ��ȡdeptCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * ����deptCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptCode(String value) {
        this.deptCode = value;
    }

    /**
     * ��ȡdoctorName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * ����doctorName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorName(String value) {
        this.doctorName = value;
    }

    /**
     * ��ȡemplCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplCode() {
        return emplCode;
    }

    /**
     * ����emplCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplCode(String value) {
        this.emplCode = value;
    }

    /**
     * ��ȡpreRegTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreRegTime() {
        return preRegTime;
    }

    /**
     * ����preRegTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreRegTime(String value) {
        this.preRegTime = value;
    }

    /**
     * ��ȡbookRegTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookRegTime() {
        return bookRegTime;
    }

    /**
     * ����bookRegTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookRegTime(String value) {
        this.bookRegTime = value;
    }

    /**
     * ��ȡpatientNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientNo() {
        return patientNo;
    }

    /**
     * ����patientNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientNo(String value) {
        this.patientNo = value;
    }

    /**
     * ��ȡbookingNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingNo() {
        return bookingNo;
    }

    /**
     * ����bookingNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingNo(String value) {
        this.bookingNo = value;
    }

    /**
     * ��ȡclinicFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicFee() {
        return clinicFee;
    }

    /**
     * ����clinicFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicFee(String value) {
        this.clinicFee = value;
    }

    /**
     * ��ȡpayMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * ����payMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * ��ȡtransNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * ����transNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransNo(String value) {
        this.transNo = value;
    }

}
