<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="get_queue_for_patient">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sParams" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="get_queue_for_patientResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="get_queue_for_patientResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="get_queue_by_dept">
        <s:complexType />
      </s:element>
      <s:element name="get_queue_by_deptResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="get_queue_by_deptResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="get_queue_for_patientSoapIn">
    <wsdl:part name="parameters" element="tns:get_queue_for_patient" />
  </wsdl:message>
  <wsdl:message name="get_queue_for_patientSoapOut">
    <wsdl:part name="parameters" element="tns:get_queue_for_patientResponse" />
  </wsdl:message>
  <wsdl:message name="get_queue_by_deptSoapIn">
    <wsdl:part name="parameters" element="tns:get_queue_by_dept" />
  </wsdl:message>
  <wsdl:message name="get_queue_by_deptSoapOut">
    <wsdl:part name="parameters" element="tns:get_queue_by_deptResponse" />
  </wsdl:message>
  <wsdl:portType name="WebServiceCallInterfaceSoap">
    <wsdl:operation name="get_queue_for_patient">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">通过本接口可以查询患者当天的排队叫号信息</wsdl:documentation>
      <wsdl:input message="tns:get_queue_for_patientSoapIn" />
      <wsdl:output message="tns:get_queue_for_patientSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="get_queue_by_dept">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">通过本接口可以查询所有科室的当天排队叫号信息</wsdl:documentation>
      <wsdl:input message="tns:get_queue_by_deptSoapIn" />
      <wsdl:output message="tns:get_queue_by_deptSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="WebServiceCallInterfaceSoap" type="tns:WebServiceCallInterfaceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="get_queue_for_patient">
      <soap:operation soapAction="http://tempuri.org/get_queue_for_patient" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="get_queue_by_dept">
      <soap:operation soapAction="http://tempuri.org/get_queue_by_dept" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="WebServiceCallInterfaceSoap12" type="tns:WebServiceCallInterfaceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="get_queue_for_patient">
      <soap12:operation soapAction="http://tempuri.org/get_queue_for_patient" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="get_queue_by_dept">
      <soap12:operation soapAction="http://tempuri.org/get_queue_by_dept" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="WebServiceCallInterface">
    <wsdl:port name="WebServiceCallInterfaceSoap" binding="tns:WebServiceCallInterfaceSoap">
      <soap:address location="http://172.17.10.236:81/WebServiceCallInterface_wx.asmx" />
    </wsdl:port>
    <wsdl:port name="WebServiceCallInterfaceSoap12" binding="tns:WebServiceCallInterfaceSoap12">
      <soap12:address location="http://172.17.10.236:81/WebServiceCallInterface_wx.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>