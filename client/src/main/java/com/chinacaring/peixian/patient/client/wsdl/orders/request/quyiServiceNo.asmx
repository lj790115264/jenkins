<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="HelloWorld">
        <s:complexType />
      </s:element>
      <s:element name="HelloWorldResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="HelloWorldResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPriceBoardInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="itemCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPriceBoardInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryPriceBoardInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDeptInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="deptCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDeptInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDeptInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDocInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="doctCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDocInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDocInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLisResultInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLisResultInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLisResultInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPacsResultInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPacsResultInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPacsResultInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetZYLisResultInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetZYLisResultInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetZYLisResultInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetZYPacsResultInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetZYPacsResultInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetZYPacsResultInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPatientCardNo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mcardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPatientCardNoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPatientCardNoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPatientCardNo1">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="iden" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPatientCardNo1Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPatientCardNo1Result" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertPatientInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="input" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertPatientInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InsertPatientInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertRegisterTemp">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="input" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertRegisterTempResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InsertRegisterTempResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNoonInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="noonCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNoonInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNoonInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShemaInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShemaInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetShemaInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShemaInfoNew">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="deptCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShemaInfoNewResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetShemaInfoNewResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShemaInfoNoVaild">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShemaInfoNoVaildResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetShemaInfoNoVaildResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShemaPointInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="shemaId" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShemaPointInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetShemaPointInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertBooking">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="input" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertBookingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InsertBookingResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRegState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRegStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRegStateResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRegisterStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRegisterStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRegisterStatusResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBookingState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="bookId" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBookingStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBookingStateResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRegInfoByCardNoOrName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="internalDays" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRegInfoByCardNoOrNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRegInfoByCardNoOrNameResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetQueue">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetQueueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetQueueResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertSIRegisterTemp">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="input" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="chargeSiReturn" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="readSiReturn" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="operCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ybInvoice" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertSIRegisterTempResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InsertSIRegisterTempResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryZDBookingInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="iden" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="phoneNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryZDBookingInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryZDBookingInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryAppRegistRecords">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="iden" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryAppRegistRecordsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryAppRegistRecordsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryAppAppointRecords">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inden" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryAppAppointRecordsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryAppAppointRecordsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryQuYiRegInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryQuYiRegInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryQuYiRegInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryRegInfoOper">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="operCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryRegInfoOperResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryRegInfoOperResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryRegInfoOperSi">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="operCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryRegInfoOperSiResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryRegInfoOperSiResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaveFee">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="recipeNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="operCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="payMode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="totCost" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaveFeeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SaveFeeResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaveSIFee">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="recipeNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="operCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="payMode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="totCost" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="chargeSiReturn" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="readSiReturn" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ybInvoice" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaveSIFeeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SaveSIFeeResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFcInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="recipeNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFcInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFcInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeleteFcInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeleteFcInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeleteFcInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFeeListByClinicCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="isFee" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFeeListByClinicCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFeeListByClinicCodeResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFeeListByClinicCode1">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="isFee" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFeeListByClinicCode1Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFeeListByClinicCode1Result" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOutpfreeRecordsStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="recipeNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="invoiceNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOutpfreeRecordsStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOutpfreeRecordsStatusResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOutpfreeRecordsNewStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="recipeNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="invoiceNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOutpfreeRecordsNewStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOutpfreeRecordsNewStatusResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInvoiceInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInvoiceInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryInvoiceInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInvoiceInfoOper">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="operCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInvoiceInfoOperResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryInvoiceInfoOperResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInvoiceInfoOperSi">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="beginDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="operCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInvoiceInfoOperSiResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryInvoiceInfoOperSiResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInvoiceMxInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="invoiceNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInvoiceMxInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryInvoiceMxInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPrescriptionInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clinicNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPrescriptionInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryPrescriptionInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPrescriptionMedicione">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="recipeNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPrescriptionMedicioneResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryPrescriptionMedicioneResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInMainInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="iden" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInMainInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryInMainInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInMainMxInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inPatientNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="patientNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryInMainMxInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryInMainMxInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPrefeeMaster">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inPatientNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPrefeeMasterResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryPrefeeMasterResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryBalanceHead">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inTimes" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="patient" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inden" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryBalanceHeadResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryBalanceHeadResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryBalanceDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="invoiceNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="patientNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryBalanceDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryBalanceDetailResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPatientDiag">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cardNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="patientNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryPatientDiagResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryPatientDiagResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSIRegUpload">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="input" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cardInfo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSIRegUploadResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSIRegUploadResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSIFeeUpload">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="input" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="recipeNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="clinicCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cardInfo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSIFeeUploadResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSIFeeUploadResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSIRegBalance">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="input" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSIRegBalanceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSIRegBalanceResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSIFeeBalance">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="input" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSIFeeBalanceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSIFeeBalanceResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRecieptRefundStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="receiptNum" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRecieptRefundStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRecieptRefundStatusResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRecieptStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="recipeNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRecieptStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRecieptStatusResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoByOperCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="operCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="beginTime" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endTime" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoByOperCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderInfoByOperCodeResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="HelloWorldSoapIn">
    <wsdl:part name="parameters" element="tns:HelloWorld" />
  </wsdl:message>
  <wsdl:message name="HelloWorldSoapOut">
    <wsdl:part name="parameters" element="tns:HelloWorldResponse" />
  </wsdl:message>
  <wsdl:message name="QueryPriceBoardInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryPriceBoardInfo" />
  </wsdl:message>
  <wsdl:message name="QueryPriceBoardInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryPriceBoardInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetDeptInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetDeptInfo" />
  </wsdl:message>
  <wsdl:message name="GetDeptInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetDeptInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetDocInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetDocInfo" />
  </wsdl:message>
  <wsdl:message name="GetDocInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetDocInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetLisResultInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetLisResultInfo" />
  </wsdl:message>
  <wsdl:message name="GetLisResultInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetLisResultInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetPacsResultInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetPacsResultInfo" />
  </wsdl:message>
  <wsdl:message name="GetPacsResultInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetPacsResultInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetZYLisResultInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetZYLisResultInfo" />
  </wsdl:message>
  <wsdl:message name="GetZYLisResultInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetZYLisResultInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetZYPacsResultInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetZYPacsResultInfo" />
  </wsdl:message>
  <wsdl:message name="GetZYPacsResultInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetZYPacsResultInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetPatientCardNoSoapIn">
    <wsdl:part name="parameters" element="tns:GetPatientCardNo" />
  </wsdl:message>
  <wsdl:message name="GetPatientCardNoSoapOut">
    <wsdl:part name="parameters" element="tns:GetPatientCardNoResponse" />
  </wsdl:message>
  <wsdl:message name="GetPatientCardNo1SoapIn">
    <wsdl:part name="parameters" element="tns:GetPatientCardNo1" />
  </wsdl:message>
  <wsdl:message name="GetPatientCardNo1SoapOut">
    <wsdl:part name="parameters" element="tns:GetPatientCardNo1Response" />
  </wsdl:message>
  <wsdl:message name="InsertPatientInfoSoapIn">
    <wsdl:part name="parameters" element="tns:InsertPatientInfo" />
  </wsdl:message>
  <wsdl:message name="InsertPatientInfoSoapOut">
    <wsdl:part name="parameters" element="tns:InsertPatientInfoResponse" />
  </wsdl:message>
  <wsdl:message name="InsertRegisterTempSoapIn">
    <wsdl:part name="parameters" element="tns:InsertRegisterTemp" />
  </wsdl:message>
  <wsdl:message name="InsertRegisterTempSoapOut">
    <wsdl:part name="parameters" element="tns:InsertRegisterTempResponse" />
  </wsdl:message>
  <wsdl:message name="GetNoonInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetNoonInfo" />
  </wsdl:message>
  <wsdl:message name="GetNoonInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetNoonInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetShemaInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetShemaInfo" />
  </wsdl:message>
  <wsdl:message name="GetShemaInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetShemaInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetShemaInfoNewSoapIn">
    <wsdl:part name="parameters" element="tns:GetShemaInfoNew" />
  </wsdl:message>
  <wsdl:message name="GetShemaInfoNewSoapOut">
    <wsdl:part name="parameters" element="tns:GetShemaInfoNewResponse" />
  </wsdl:message>
  <wsdl:message name="GetShemaInfoNoVaildSoapIn">
    <wsdl:part name="parameters" element="tns:GetShemaInfoNoVaild" />
  </wsdl:message>
  <wsdl:message name="GetShemaInfoNoVaildSoapOut">
    <wsdl:part name="parameters" element="tns:GetShemaInfoNoVaildResponse" />
  </wsdl:message>
  <wsdl:message name="GetShemaPointInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetShemaPointInfo" />
  </wsdl:message>
  <wsdl:message name="GetShemaPointInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetShemaPointInfoResponse" />
  </wsdl:message>
  <wsdl:message name="InsertBookingSoapIn">
    <wsdl:part name="parameters" element="tns:InsertBooking" />
  </wsdl:message>
  <wsdl:message name="InsertBookingSoapOut">
    <wsdl:part name="parameters" element="tns:InsertBookingResponse" />
  </wsdl:message>
  <wsdl:message name="GetRegStateSoapIn">
    <wsdl:part name="parameters" element="tns:GetRegState" />
  </wsdl:message>
  <wsdl:message name="GetRegStateSoapOut">
    <wsdl:part name="parameters" element="tns:GetRegStateResponse" />
  </wsdl:message>
  <wsdl:message name="GetRegisterStatusSoapIn">
    <wsdl:part name="parameters" element="tns:GetRegisterStatus" />
  </wsdl:message>
  <wsdl:message name="GetRegisterStatusSoapOut">
    <wsdl:part name="parameters" element="tns:GetRegisterStatusResponse" />
  </wsdl:message>
  <wsdl:message name="GetBookingStateSoapIn">
    <wsdl:part name="parameters" element="tns:GetBookingState" />
  </wsdl:message>
  <wsdl:message name="GetBookingStateSoapOut">
    <wsdl:part name="parameters" element="tns:GetBookingStateResponse" />
  </wsdl:message>
  <wsdl:message name="GetRegInfoByCardNoOrNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetRegInfoByCardNoOrName" />
  </wsdl:message>
  <wsdl:message name="GetRegInfoByCardNoOrNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetRegInfoByCardNoOrNameResponse" />
  </wsdl:message>
  <wsdl:message name="GetQueueSoapIn">
    <wsdl:part name="parameters" element="tns:GetQueue" />
  </wsdl:message>
  <wsdl:message name="GetQueueSoapOut">
    <wsdl:part name="parameters" element="tns:GetQueueResponse" />
  </wsdl:message>
  <wsdl:message name="InsertSIRegisterTempSoapIn">
    <wsdl:part name="parameters" element="tns:InsertSIRegisterTemp" />
  </wsdl:message>
  <wsdl:message name="InsertSIRegisterTempSoapOut">
    <wsdl:part name="parameters" element="tns:InsertSIRegisterTempResponse" />
  </wsdl:message>
  <wsdl:message name="QueryZDBookingInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryZDBookingInfo" />
  </wsdl:message>
  <wsdl:message name="QueryZDBookingInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryZDBookingInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryAppRegistRecordsSoapIn">
    <wsdl:part name="parameters" element="tns:QueryAppRegistRecords" />
  </wsdl:message>
  <wsdl:message name="QueryAppRegistRecordsSoapOut">
    <wsdl:part name="parameters" element="tns:QueryAppRegistRecordsResponse" />
  </wsdl:message>
  <wsdl:message name="QueryAppAppointRecordsSoapIn">
    <wsdl:part name="parameters" element="tns:QueryAppAppointRecords" />
  </wsdl:message>
  <wsdl:message name="QueryAppAppointRecordsSoapOut">
    <wsdl:part name="parameters" element="tns:QueryAppAppointRecordsResponse" />
  </wsdl:message>
  <wsdl:message name="QueryQuYiRegInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryQuYiRegInfo" />
  </wsdl:message>
  <wsdl:message name="QueryQuYiRegInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryQuYiRegInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryRegInfoOperSoapIn">
    <wsdl:part name="parameters" element="tns:QueryRegInfoOper" />
  </wsdl:message>
  <wsdl:message name="QueryRegInfoOperSoapOut">
    <wsdl:part name="parameters" element="tns:QueryRegInfoOperResponse" />
  </wsdl:message>
  <wsdl:message name="QueryRegInfoOperSiSoapIn">
    <wsdl:part name="parameters" element="tns:QueryRegInfoOperSi" />
  </wsdl:message>
  <wsdl:message name="QueryRegInfoOperSiSoapOut">
    <wsdl:part name="parameters" element="tns:QueryRegInfoOperSiResponse" />
  </wsdl:message>
  <wsdl:message name="SaveFeeSoapIn">
    <wsdl:part name="parameters" element="tns:SaveFee" />
  </wsdl:message>
  <wsdl:message name="SaveFeeSoapOut">
    <wsdl:part name="parameters" element="tns:SaveFeeResponse" />
  </wsdl:message>
  <wsdl:message name="SaveSIFeeSoapIn">
    <wsdl:part name="parameters" element="tns:SaveSIFee" />
  </wsdl:message>
  <wsdl:message name="SaveSIFeeSoapOut">
    <wsdl:part name="parameters" element="tns:SaveSIFeeResponse" />
  </wsdl:message>
  <wsdl:message name="GetFcInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetFcInfo" />
  </wsdl:message>
  <wsdl:message name="GetFcInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetFcInfoResponse" />
  </wsdl:message>
  <wsdl:message name="DeleteFcInfoSoapIn">
    <wsdl:part name="parameters" element="tns:DeleteFcInfo" />
  </wsdl:message>
  <wsdl:message name="DeleteFcInfoSoapOut">
    <wsdl:part name="parameters" element="tns:DeleteFcInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetFeeListByClinicCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetFeeListByClinicCode" />
  </wsdl:message>
  <wsdl:message name="GetFeeListByClinicCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetFeeListByClinicCodeResponse" />
  </wsdl:message>
  <wsdl:message name="GetFeeListByClinicCode1SoapIn">
    <wsdl:part name="parameters" element="tns:GetFeeListByClinicCode1" />
  </wsdl:message>
  <wsdl:message name="GetFeeListByClinicCode1SoapOut">
    <wsdl:part name="parameters" element="tns:GetFeeListByClinicCode1Response" />
  </wsdl:message>
  <wsdl:message name="GetOutpfreeRecordsStatusSoapIn">
    <wsdl:part name="parameters" element="tns:GetOutpfreeRecordsStatus" />
  </wsdl:message>
  <wsdl:message name="GetOutpfreeRecordsStatusSoapOut">
    <wsdl:part name="parameters" element="tns:GetOutpfreeRecordsStatusResponse" />
  </wsdl:message>
  <wsdl:message name="GetOutpfreeRecordsNewStatusSoapIn">
    <wsdl:part name="parameters" element="tns:GetOutpfreeRecordsNewStatus" />
  </wsdl:message>
  <wsdl:message name="GetOutpfreeRecordsNewStatusSoapOut">
    <wsdl:part name="parameters" element="tns:GetOutpfreeRecordsNewStatusResponse" />
  </wsdl:message>
  <wsdl:message name="QueryInvoiceInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryInvoiceInfo" />
  </wsdl:message>
  <wsdl:message name="QueryInvoiceInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryInvoiceInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryInvoiceInfoOperSoapIn">
    <wsdl:part name="parameters" element="tns:QueryInvoiceInfoOper" />
  </wsdl:message>
  <wsdl:message name="QueryInvoiceInfoOperSoapOut">
    <wsdl:part name="parameters" element="tns:QueryInvoiceInfoOperResponse" />
  </wsdl:message>
  <wsdl:message name="QueryInvoiceInfoOperSiSoapIn">
    <wsdl:part name="parameters" element="tns:QueryInvoiceInfoOperSi" />
  </wsdl:message>
  <wsdl:message name="QueryInvoiceInfoOperSiSoapOut">
    <wsdl:part name="parameters" element="tns:QueryInvoiceInfoOperSiResponse" />
  </wsdl:message>
  <wsdl:message name="QueryInvoiceMxInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryInvoiceMxInfo" />
  </wsdl:message>
  <wsdl:message name="QueryInvoiceMxInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryInvoiceMxInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryPrescriptionInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryPrescriptionInfo" />
  </wsdl:message>
  <wsdl:message name="QueryPrescriptionInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryPrescriptionInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryPrescriptionMedicioneSoapIn">
    <wsdl:part name="parameters" element="tns:QueryPrescriptionMedicione" />
  </wsdl:message>
  <wsdl:message name="QueryPrescriptionMedicioneSoapOut">
    <wsdl:part name="parameters" element="tns:QueryPrescriptionMedicioneResponse" />
  </wsdl:message>
  <wsdl:message name="QueryInMainInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryInMainInfo" />
  </wsdl:message>
  <wsdl:message name="QueryInMainInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryInMainInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryInMainMxInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryInMainMxInfo" />
  </wsdl:message>
  <wsdl:message name="QueryInMainMxInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryInMainMxInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryPrefeeMasterSoapIn">
    <wsdl:part name="parameters" element="tns:QueryPrefeeMaster" />
  </wsdl:message>
  <wsdl:message name="QueryPrefeeMasterSoapOut">
    <wsdl:part name="parameters" element="tns:QueryPrefeeMasterResponse" />
  </wsdl:message>
  <wsdl:message name="QueryBalanceHeadSoapIn">
    <wsdl:part name="parameters" element="tns:QueryBalanceHead" />
  </wsdl:message>
  <wsdl:message name="QueryBalanceHeadSoapOut">
    <wsdl:part name="parameters" element="tns:QueryBalanceHeadResponse" />
  </wsdl:message>
  <wsdl:message name="QueryBalanceDetailSoapIn">
    <wsdl:part name="parameters" element="tns:QueryBalanceDetail" />
  </wsdl:message>
  <wsdl:message name="QueryBalanceDetailSoapOut">
    <wsdl:part name="parameters" element="tns:QueryBalanceDetailResponse" />
  </wsdl:message>
  <wsdl:message name="QueryPatientDiagSoapIn">
    <wsdl:part name="parameters" element="tns:QueryPatientDiag" />
  </wsdl:message>
  <wsdl:message name="QueryPatientDiagSoapOut">
    <wsdl:part name="parameters" element="tns:QueryPatientDiagResponse" />
  </wsdl:message>
  <wsdl:message name="GetSIRegUploadSoapIn">
    <wsdl:part name="parameters" element="tns:GetSIRegUpload" />
  </wsdl:message>
  <wsdl:message name="GetSIRegUploadSoapOut">
    <wsdl:part name="parameters" element="tns:GetSIRegUploadResponse" />
  </wsdl:message>
  <wsdl:message name="GetSIFeeUploadSoapIn">
    <wsdl:part name="parameters" element="tns:GetSIFeeUpload" />
  </wsdl:message>
  <wsdl:message name="GetSIFeeUploadSoapOut">
    <wsdl:part name="parameters" element="tns:GetSIFeeUploadResponse" />
  </wsdl:message>
  <wsdl:message name="GetSIRegBalanceSoapIn">
    <wsdl:part name="parameters" element="tns:GetSIRegBalance" />
  </wsdl:message>
  <wsdl:message name="GetSIRegBalanceSoapOut">
    <wsdl:part name="parameters" element="tns:GetSIRegBalanceResponse" />
  </wsdl:message>
  <wsdl:message name="GetSIFeeBalanceSoapIn">
    <wsdl:part name="parameters" element="tns:GetSIFeeBalance" />
  </wsdl:message>
  <wsdl:message name="GetSIFeeBalanceSoapOut">
    <wsdl:part name="parameters" element="tns:GetSIFeeBalanceResponse" />
  </wsdl:message>
  <wsdl:message name="GetRecieptRefundStatusSoapIn">
    <wsdl:part name="parameters" element="tns:GetRecieptRefundStatus" />
  </wsdl:message>
  <wsdl:message name="GetRecieptRefundStatusSoapOut">
    <wsdl:part name="parameters" element="tns:GetRecieptRefundStatusResponse" />
  </wsdl:message>
  <wsdl:message name="GetRecieptStatusSoapIn">
    <wsdl:part name="parameters" element="tns:GetRecieptStatus" />
  </wsdl:message>
  <wsdl:message name="GetRecieptStatusSoapOut">
    <wsdl:part name="parameters" element="tns:GetRecieptStatusResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoByOperCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderInfoByOperCode" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoByOperCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderInfoByOperCodeResponse" />
  </wsdl:message>
  <wsdl:portType name="quyiServiceNoSoap">
    <wsdl:operation name="HelloWorld">
      <wsdl:input message="tns:HelloWorldSoapIn" />
      <wsdl:output message="tns:HelloWorldSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryPriceBoardInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查取价格公示信息</wsdl:documentation>
      <wsdl:input message="tns:QueryPriceBoardInfoSoapIn" />
      <wsdl:output message="tns:QueryPriceBoardInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDeptInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询科室信息</wsdl:documentation>
      <wsdl:input message="tns:GetDeptInfoSoapIn" />
      <wsdl:output message="tns:GetDeptInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDocInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询医生信息</wsdl:documentation>
      <wsdl:input message="tns:GetDocInfoSoapIn" />
      <wsdl:output message="tns:GetDocInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLisResultInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询检验信息</wsdl:documentation>
      <wsdl:input message="tns:GetLisResultInfoSoapIn" />
      <wsdl:output message="tns:GetLisResultInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPacsResultInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询检查信息</wsdl:documentation>
      <wsdl:input message="tns:GetPacsResultInfoSoapIn" />
      <wsdl:output message="tns:GetPacsResultInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetZYLisResultInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询住院检验信息</wsdl:documentation>
      <wsdl:input message="tns:GetZYLisResultInfoSoapIn" />
      <wsdl:output message="tns:GetZYLisResultInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetZYPacsResultInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询住院检查信息</wsdl:documentation>
      <wsdl:input message="tns:GetZYPacsResultInfoSoapIn" />
      <wsdl:output message="tns:GetZYPacsResultInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPatientCardNo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询患者在医院中卡号通过实物卡</wsdl:documentation>
      <wsdl:input message="tns:GetPatientCardNoSoapIn" />
      <wsdl:output message="tns:GetPatientCardNoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPatientCardNo1">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询患者在医院中卡号</wsdl:documentation>
      <wsdl:input message="tns:GetPatientCardNo1SoapIn" />
      <wsdl:output message="tns:GetPatientCardNo1SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="InsertPatientInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新建患者信息</wsdl:documentation>
      <wsdl:input message="tns:InsertPatientInfoSoapIn" />
      <wsdl:output message="tns:InsertPatientInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="InsertRegisterTemp">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">直接挂号、预约转挂号</wsdl:documentation>
      <wsdl:input message="tns:InsertRegisterTempSoapIn" />
      <wsdl:output message="tns:InsertRegisterTempSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNoonInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询午别信息</wsdl:documentation>
      <wsdl:input message="tns:GetNoonInfoSoapIn" />
      <wsdl:output message="tns:GetNoonInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询排班信息</wsdl:documentation>
      <wsdl:input message="tns:GetShemaInfoSoapIn" />
      <wsdl:output message="tns:GetShemaInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfoNew">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询排班信息可通过科室或者医生查询</wsdl:documentation>
      <wsdl:input message="tns:GetShemaInfoNewSoapIn" />
      <wsdl:output message="tns:GetShemaInfoNewSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfoNoVaild">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询作废的排班信息</wsdl:documentation>
      <wsdl:input message="tns:GetShemaInfoNoVaildSoapIn" />
      <wsdl:output message="tns:GetShemaInfoNoVaildSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetShemaPointInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">【暂未开放】查询预约时间点信息</wsdl:documentation>
      <wsdl:input message="tns:GetShemaPointInfoSoapIn" />
      <wsdl:output message="tns:GetShemaPointInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="InsertBooking">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">预约挂号、取消预约挂号</wsdl:documentation>
      <wsdl:input message="tns:InsertBookingSoapIn" />
      <wsdl:output message="tns:InsertBookingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRegState">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询挂号状态2为已看诊,0为未看诊,3为退号</wsdl:documentation>
      <wsdl:input message="tns:GetRegStateSoapIn" />
      <wsdl:output message="tns:GetRegStateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRegisterStatus">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询挂号状态2为已看诊,1为未看诊,3为退号</wsdl:documentation>
      <wsdl:input message="tns:GetRegisterStatusSoapIn" />
      <wsdl:output message="tns:GetRegisterStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBookingState">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询预约挂号状态</wsdl:documentation>
      <wsdl:input message="tns:GetBookingStateSoapIn" />
      <wsdl:output message="tns:GetBookingStateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRegInfoByCardNoOrName">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取时间范围内挂号信息</wsdl:documentation>
      <wsdl:input message="tns:GetRegInfoByCardNoOrNameSoapIn" />
      <wsdl:output message="tns:GetRegInfoByCardNoOrNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetQueue">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取排队叫号表</wsdl:documentation>
      <wsdl:input message="tns:GetQueueSoapIn" />
      <wsdl:output message="tns:GetQueueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="InsertSIRegisterTemp">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">【暂未开放】挂号、预约转挂号(临时表)医保脱卡支付</wsdl:documentation>
      <wsdl:input message="tns:InsertSIRegisterTempSoapIn" />
      <wsdl:output message="tns:InsertSIRegisterTempSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryZDBookingInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询非APP挂号记录</wsdl:documentation>
      <wsdl:input message="tns:QueryZDBookingInfoSoapIn" />
      <wsdl:output message="tns:QueryZDBookingInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryAppRegistRecords">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询所有挂号信息</wsdl:documentation>
      <wsdl:input message="tns:QueryAppRegistRecordsSoapIn" />
      <wsdl:output message="tns:QueryAppRegistRecordsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryAppAppointRecords">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询所有预约信息</wsdl:documentation>
      <wsdl:input message="tns:QueryAppAppointRecordsSoapIn" />
      <wsdl:output message="tns:QueryAppAppointRecordsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryQuYiRegInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询APP挂号对账信息</wsdl:documentation>
      <wsdl:input message="tns:QueryQuYiRegInfoSoapIn" />
      <wsdl:output message="tns:QueryQuYiRegInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryRegInfoOper">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询APP挂号对账信息根据收费工号</wsdl:documentation>
      <wsdl:input message="tns:QueryRegInfoOperSoapIn" />
      <wsdl:output message="tns:QueryRegInfoOperSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryRegInfoOperSi">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询APP挂号对账信息根据收费工号含医保</wsdl:documentation>
      <wsdl:input message="tns:QueryRegInfoOperSiSoapIn" />
      <wsdl:output message="tns:QueryRegInfoOperSiSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SaveFee">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">门诊结算</wsdl:documentation>
      <wsdl:input message="tns:SaveFeeSoapIn" />
      <wsdl:output message="tns:SaveFeeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SaveSIFee">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">【暂未开放】门诊结算医保拖卡支付</wsdl:documentation>
      <wsdl:input message="tns:SaveSIFeeSoapIn" />
      <wsdl:output message="tns:SaveSIFeeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFcInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">【暂未开放】获取辅材信息</wsdl:documentation>
      <wsdl:input message="tns:GetFcInfoSoapIn" />
      <wsdl:output message="tns:GetFcInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeleteFcInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">【暂未开放】删除辅材信息</wsdl:documentation>
      <wsdl:input message="tns:DeleteFcInfoSoapIn" />
      <wsdl:output message="tns:DeleteFcInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFeeListByClinicCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取病人收费信息</wsdl:documentation>
      <wsdl:input message="tns:GetFeeListByClinicCodeSoapIn" />
      <wsdl:output message="tns:GetFeeListByClinicCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFeeListByClinicCode1">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取病人收费信息含单位</wsdl:documentation>
      <wsdl:input message="tns:GetFeeListByClinicCode1SoapIn" />
      <wsdl:output message="tns:GetFeeListByClinicCode1SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOutpfreeRecordsStatus">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取门诊缴费记录查询(退费记录)</wsdl:documentation>
      <wsdl:input message="tns:GetOutpfreeRecordsStatusSoapIn" />
      <wsdl:output message="tns:GetOutpfreeRecordsStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOutpfreeRecordsNewStatus">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取门诊缴费记录查询</wsdl:documentation>
      <wsdl:input message="tns:GetOutpfreeRecordsNewStatusSoapIn" />
      <wsdl:output message="tns:GetOutpfreeRecordsNewStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查取门诊费用主表</wsdl:documentation>
      <wsdl:input message="tns:QueryInvoiceInfoSoapIn" />
      <wsdl:output message="tns:QueryInvoiceInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfoOper">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查取门诊费用主表传操作员</wsdl:documentation>
      <wsdl:input message="tns:QueryInvoiceInfoOperSoapIn" />
      <wsdl:output message="tns:QueryInvoiceInfoOperSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfoOperSi">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">【暂未开放】查取门诊费用主表传操作员含医保</wsdl:documentation>
      <wsdl:input message="tns:QueryInvoiceInfoOperSiSoapIn" />
      <wsdl:output message="tns:QueryInvoiceInfoOperSiSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceMxInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查取门诊费用明细表</wsdl:documentation>
      <wsdl:input message="tns:QueryInvoiceMxInfoSoapIn" />
      <wsdl:output message="tns:QueryInvoiceMxInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryPrescriptionInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询处方主信息</wsdl:documentation>
      <wsdl:input message="tns:QueryPrescriptionInfoSoapIn" />
      <wsdl:output message="tns:QueryPrescriptionInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryPrescriptionMedicione">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询处方药品信息</wsdl:documentation>
      <wsdl:input message="tns:QueryPrescriptionMedicioneSoapIn" />
      <wsdl:output message="tns:QueryPrescriptionMedicioneSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryInMainInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询在院患者住院费用</wsdl:documentation>
      <wsdl:input message="tns:QueryInMainInfoSoapIn" />
      <wsdl:output message="tns:QueryInMainInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryInMainMxInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询在院患者费用记录</wsdl:documentation>
      <wsdl:input message="tns:QueryInMainMxInfoSoapIn" />
      <wsdl:output message="tns:QueryInMainMxInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryPrefeeMaster">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询病人住院费用信息</wsdl:documentation>
      <wsdl:input message="tns:QueryPrefeeMasterSoapIn" />
      <wsdl:output message="tns:QueryPrefeeMasterSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryBalanceHead">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查取住院结算主表</wsdl:documentation>
      <wsdl:input message="tns:QueryBalanceHeadSoapIn" />
      <wsdl:output message="tns:QueryBalanceHeadSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryBalanceDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查取住院结算明细表</wsdl:documentation>
      <wsdl:input message="tns:QueryBalanceDetailSoapIn" />
      <wsdl:output message="tns:QueryBalanceDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryPatientDiag">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查取住院诊断表</wsdl:documentation>
      <wsdl:input message="tns:QueryPatientDiagSoapIn" />
      <wsdl:output message="tns:QueryPatientDiagSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSIRegUpload">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取医保挂号上传明细</wsdl:documentation>
      <wsdl:input message="tns:GetSIRegUploadSoapIn" />
      <wsdl:output message="tns:GetSIRegUploadSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSIFeeUpload">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取医保收费上传明细</wsdl:documentation>
      <wsdl:input message="tns:GetSIFeeUploadSoapIn" />
      <wsdl:output message="tns:GetSIFeeUploadSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSIRegBalance">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取医保挂号结算入参</wsdl:documentation>
      <wsdl:input message="tns:GetSIRegBalanceSoapIn" />
      <wsdl:output message="tns:GetSIRegBalanceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSIFeeBalance">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取医保挂号结算入参</wsdl:documentation>
      <wsdl:input message="tns:GetSIFeeBalanceSoapIn" />
      <wsdl:output message="tns:GetSIFeeBalanceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRecieptRefundStatus">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询门诊处方收据的退款状态，此接口为了对账</wsdl:documentation>
      <wsdl:input message="tns:GetRecieptRefundStatusSoapIn" />
      <wsdl:output message="tns:GetRecieptRefundStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRecieptStatus">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询门诊处方的缴费，执行，退款状态</wsdl:documentation>
      <wsdl:input message="tns:GetRecieptStatusSoapIn" />
      <wsdl:output message="tns:GetRecieptStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoByOperCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据时间段查询此操作员下的所有订单信息，查询我方操作员的订单信息，此接口为了对账</wsdl:documentation>
      <wsdl:input message="tns:GetOrderInfoByOperCodeSoapIn" />
      <wsdl:output message="tns:GetOrderInfoByOperCodeSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="quyiServiceNoSoap" type="tns:quyiServiceNoSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="HelloWorld">
      <soap:operation soapAction="http://tempuri.org/HelloWorld" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPriceBoardInfo">
      <soap:operation soapAction="http://tempuri.org/QueryPriceBoardInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDeptInfo">
      <soap:operation soapAction="http://tempuri.org/GetDeptInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDocInfo">
      <soap:operation soapAction="http://tempuri.org/GetDocInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLisResultInfo">
      <soap:operation soapAction="http://tempuri.org/GetLisResultInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPacsResultInfo">
      <soap:operation soapAction="http://tempuri.org/GetPacsResultInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetZYLisResultInfo">
      <soap:operation soapAction="http://tempuri.org/GetZYLisResultInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetZYPacsResultInfo">
      <soap:operation soapAction="http://tempuri.org/GetZYPacsResultInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPatientCardNo">
      <soap:operation soapAction="http://tempuri.org/GetPatientCardNo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPatientCardNo1">
      <soap:operation soapAction="http://tempuri.org/GetPatientCardNo1" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InsertPatientInfo">
      <soap:operation soapAction="http://tempuri.org/InsertPatientInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InsertRegisterTemp">
      <soap:operation soapAction="http://tempuri.org/InsertRegisterTemp" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNoonInfo">
      <soap:operation soapAction="http://tempuri.org/GetNoonInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfo">
      <soap:operation soapAction="http://tempuri.org/GetShemaInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfoNew">
      <soap:operation soapAction="http://tempuri.org/GetShemaInfoNew" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfoNoVaild">
      <soap:operation soapAction="http://tempuri.org/GetShemaInfoNoVaild" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetShemaPointInfo">
      <soap:operation soapAction="http://tempuri.org/GetShemaPointInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InsertBooking">
      <soap:operation soapAction="http://tempuri.org/InsertBooking" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRegState">
      <soap:operation soapAction="http://tempuri.org/GetRegState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRegisterStatus">
      <soap:operation soapAction="http://tempuri.org/GetRegisterStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBookingState">
      <soap:operation soapAction="http://tempuri.org/GetBookingState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRegInfoByCardNoOrName">
      <soap:operation soapAction="http://tempuri.org/GetRegInfoByCardNoOrName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetQueue">
      <soap:operation soapAction="http://tempuri.org/GetQueue" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InsertSIRegisterTemp">
      <soap:operation soapAction="http://tempuri.org/InsertSIRegisterTemp" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryZDBookingInfo">
      <soap:operation soapAction="http://tempuri.org/QueryZDBookingInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryAppRegistRecords">
      <soap:operation soapAction="http://tempuri.org/QueryAppRegistRecords" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryAppAppointRecords">
      <soap:operation soapAction="http://tempuri.org/QueryAppAppointRecords" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryQuYiRegInfo">
      <soap:operation soapAction="http://tempuri.org/QueryQuYiRegInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryRegInfoOper">
      <soap:operation soapAction="http://tempuri.org/QueryRegInfoOper" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryRegInfoOperSi">
      <soap:operation soapAction="http://tempuri.org/QueryRegInfoOperSi" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveFee">
      <soap:operation soapAction="http://tempuri.org/SaveFee" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveSIFee">
      <soap:operation soapAction="http://tempuri.org/SaveSIFee" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFcInfo">
      <soap:operation soapAction="http://tempuri.org/GetFcInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeleteFcInfo">
      <soap:operation soapAction="http://tempuri.org/DeleteFcInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFeeListByClinicCode">
      <soap:operation soapAction="http://tempuri.org/GetFeeListByClinicCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFeeListByClinicCode1">
      <soap:operation soapAction="http://tempuri.org/GetFeeListByClinicCode1" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOutpfreeRecordsStatus">
      <soap:operation soapAction="http://tempuri.org/GetOutpfreeRecordsStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOutpfreeRecordsNewStatus">
      <soap:operation soapAction="http://tempuri.org/GetOutpfreeRecordsNewStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfo">
      <soap:operation soapAction="http://tempuri.org/QueryInvoiceInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfoOper">
      <soap:operation soapAction="http://tempuri.org/QueryInvoiceInfoOper" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfoOperSi">
      <soap:operation soapAction="http://tempuri.org/QueryInvoiceInfoOperSi" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceMxInfo">
      <soap:operation soapAction="http://tempuri.org/QueryInvoiceMxInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPrescriptionInfo">
      <soap:operation soapAction="http://tempuri.org/QueryPrescriptionInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPrescriptionMedicione">
      <soap:operation soapAction="http://tempuri.org/QueryPrescriptionMedicione" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInMainInfo">
      <soap:operation soapAction="http://tempuri.org/QueryInMainInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInMainMxInfo">
      <soap:operation soapAction="http://tempuri.org/QueryInMainMxInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPrefeeMaster">
      <soap:operation soapAction="http://tempuri.org/QueryPrefeeMaster" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryBalanceHead">
      <soap:operation soapAction="http://tempuri.org/QueryBalanceHead" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryBalanceDetail">
      <soap:operation soapAction="http://tempuri.org/QueryBalanceDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPatientDiag">
      <soap:operation soapAction="http://tempuri.org/QueryPatientDiag" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSIRegUpload">
      <soap:operation soapAction="http://tempuri.org/GetSIRegUpload" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSIFeeUpload">
      <soap:operation soapAction="http://tempuri.org/GetSIFeeUpload" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSIRegBalance">
      <soap:operation soapAction="http://tempuri.org/GetSIRegBalance" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSIFeeBalance">
      <soap:operation soapAction="http://tempuri.org/GetSIFeeBalance" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecieptRefundStatus">
      <soap:operation soapAction="http://tempuri.org/GetRecieptRefundStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecieptStatus">
      <soap:operation soapAction="http://tempuri.org/GetRecieptStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoByOperCode">
      <soap:operation soapAction="http://tempuri.org/GetOrderInfoByOperCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="quyiServiceNoSoap12" type="tns:quyiServiceNoSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="HelloWorld">
      <soap12:operation soapAction="http://tempuri.org/HelloWorld" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPriceBoardInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryPriceBoardInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDeptInfo">
      <soap12:operation soapAction="http://tempuri.org/GetDeptInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDocInfo">
      <soap12:operation soapAction="http://tempuri.org/GetDocInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLisResultInfo">
      <soap12:operation soapAction="http://tempuri.org/GetLisResultInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPacsResultInfo">
      <soap12:operation soapAction="http://tempuri.org/GetPacsResultInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetZYLisResultInfo">
      <soap12:operation soapAction="http://tempuri.org/GetZYLisResultInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetZYPacsResultInfo">
      <soap12:operation soapAction="http://tempuri.org/GetZYPacsResultInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPatientCardNo">
      <soap12:operation soapAction="http://tempuri.org/GetPatientCardNo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPatientCardNo1">
      <soap12:operation soapAction="http://tempuri.org/GetPatientCardNo1" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InsertPatientInfo">
      <soap12:operation soapAction="http://tempuri.org/InsertPatientInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InsertRegisterTemp">
      <soap12:operation soapAction="http://tempuri.org/InsertRegisterTemp" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNoonInfo">
      <soap12:operation soapAction="http://tempuri.org/GetNoonInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfo">
      <soap12:operation soapAction="http://tempuri.org/GetShemaInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfoNew">
      <soap12:operation soapAction="http://tempuri.org/GetShemaInfoNew" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetShemaInfoNoVaild">
      <soap12:operation soapAction="http://tempuri.org/GetShemaInfoNoVaild" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetShemaPointInfo">
      <soap12:operation soapAction="http://tempuri.org/GetShemaPointInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InsertBooking">
      <soap12:operation soapAction="http://tempuri.org/InsertBooking" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRegState">
      <soap12:operation soapAction="http://tempuri.org/GetRegState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRegisterStatus">
      <soap12:operation soapAction="http://tempuri.org/GetRegisterStatus" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBookingState">
      <soap12:operation soapAction="http://tempuri.org/GetBookingState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRegInfoByCardNoOrName">
      <soap12:operation soapAction="http://tempuri.org/GetRegInfoByCardNoOrName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetQueue">
      <soap12:operation soapAction="http://tempuri.org/GetQueue" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InsertSIRegisterTemp">
      <soap12:operation soapAction="http://tempuri.org/InsertSIRegisterTemp" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryZDBookingInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryZDBookingInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryAppRegistRecords">
      <soap12:operation soapAction="http://tempuri.org/QueryAppRegistRecords" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryAppAppointRecords">
      <soap12:operation soapAction="http://tempuri.org/QueryAppAppointRecords" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryQuYiRegInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryQuYiRegInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryRegInfoOper">
      <soap12:operation soapAction="http://tempuri.org/QueryRegInfoOper" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryRegInfoOperSi">
      <soap12:operation soapAction="http://tempuri.org/QueryRegInfoOperSi" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveFee">
      <soap12:operation soapAction="http://tempuri.org/SaveFee" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveSIFee">
      <soap12:operation soapAction="http://tempuri.org/SaveSIFee" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFcInfo">
      <soap12:operation soapAction="http://tempuri.org/GetFcInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeleteFcInfo">
      <soap12:operation soapAction="http://tempuri.org/DeleteFcInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFeeListByClinicCode">
      <soap12:operation soapAction="http://tempuri.org/GetFeeListByClinicCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFeeListByClinicCode1">
      <soap12:operation soapAction="http://tempuri.org/GetFeeListByClinicCode1" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOutpfreeRecordsStatus">
      <soap12:operation soapAction="http://tempuri.org/GetOutpfreeRecordsStatus" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOutpfreeRecordsNewStatus">
      <soap12:operation soapAction="http://tempuri.org/GetOutpfreeRecordsNewStatus" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryInvoiceInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfoOper">
      <soap12:operation soapAction="http://tempuri.org/QueryInvoiceInfoOper" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceInfoOperSi">
      <soap12:operation soapAction="http://tempuri.org/QueryInvoiceInfoOperSi" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInvoiceMxInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryInvoiceMxInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPrescriptionInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryPrescriptionInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPrescriptionMedicione">
      <soap12:operation soapAction="http://tempuri.org/QueryPrescriptionMedicione" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInMainInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryInMainInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryInMainMxInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryInMainMxInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPrefeeMaster">
      <soap12:operation soapAction="http://tempuri.org/QueryPrefeeMaster" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryBalanceHead">
      <soap12:operation soapAction="http://tempuri.org/QueryBalanceHead" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryBalanceDetail">
      <soap12:operation soapAction="http://tempuri.org/QueryBalanceDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryPatientDiag">
      <soap12:operation soapAction="http://tempuri.org/QueryPatientDiag" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSIRegUpload">
      <soap12:operation soapAction="http://tempuri.org/GetSIRegUpload" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSIFeeUpload">
      <soap12:operation soapAction="http://tempuri.org/GetSIFeeUpload" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSIRegBalance">
      <soap12:operation soapAction="http://tempuri.org/GetSIRegBalance" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSIFeeBalance">
      <soap12:operation soapAction="http://tempuri.org/GetSIFeeBalance" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecieptRefundStatus">
      <soap12:operation soapAction="http://tempuri.org/GetRecieptRefundStatus" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecieptStatus">
      <soap12:operation soapAction="http://tempuri.org/GetRecieptStatus" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoByOperCode">
      <soap12:operation soapAction="http://tempuri.org/GetOrderInfoByOperCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="quyiServiceNo">
    <wsdl:port name="quyiServiceNoSoap" binding="tns:quyiServiceNoSoap">
      <soap:address location="http://172.17.10.236/quyiService/quyiServiceNo.asmx" />
    </wsdl:port>
    <wsdl:port name="quyiServiceNoSoap12" binding="tns:quyiServiceNoSoap12">
      <soap12:address location="http://172.17.10.236/quyiService/quyiServiceNo.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>