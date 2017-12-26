package com.chinacaring.hmsrmyy;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.his.response.createProfile.CreateProfileResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.outPatientMedicalRecords.OutpatientMedicalRecordsResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.registerState.RegisterStateResponseHis;
import com.chinacaring.hmsrmyy.service.BaseInfoService;
import com.chinacaring.util.JaxbXmlUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HmsrmyyApplicationTests {

	@Autowired
	private BaseInfoService baseInfoService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test() throws CommonException {
//		baseInfoService.getExistProfile("410323199407104513");
//		String xml = "<Response>\n" +
//				"  <returnCode>1</returnCode>\n" +
//				"  <returnDesc/>\n" +
//				"  <patientNo>1711100618</patientNo>\n" +
//				"</Response>\n";
//
//		CreateProfileResponseHis createProfileResponseHis = JaxbXmlUtil.convertToJavaBean(xml, CreateProfileResponseHis.class);
//		String xml = "<Response>\n" +
//				"    <returnCode>7000</returnCode>\n" +
//				"    <returnDesc>未找到挂号信息!</returnDesc>\n" +
//				"    <state/>\n" +
//				"</Response>";
//		RegisterStateResponseHis registerStateResponseHis = JaxbXmlUtil.convertToJavaBean(xml, RegisterStateResponseHis.class);

		String xml = "<Response>\n" +
				"    <returnCode>1</returnCode>\n" +
				"    <returnDesc />\n" +
				"    <Items>\n" +
				"        <Item>\n" +
				"            <regNo>O0000138</regNo>\n" +
				"            <patientNo>928878</patientNo>\n" +
				"            <drugName>铝碳酸镁片</drugName>\n" +
				"            <drugSpec>0.5g×36片</drugSpec>\n" +
				"            <amount>108</amount>\n" +
				"            <unitPrice>0.5472</unitPrice>\n" +
				"            <totCost>59.10</totCost>\n" +
				"            <dosage>1.50</dosage>\n" +
				"            <adminstration>po</adminstration>\n" +
				"            <frequency>3</frequency>\n" +
				"            <frequencyName>tid</frequencyName>\n" +
				"            <diagnosis>(K25.903)胃溃疡</diagnosis>\n" +
				"            <emplCode>497</emplCode>\n" +
				"            <docName>赵志江</docName>\n" +
				"        </Item>\n" +
				"        <Item>\n" +
				"            <regNo>O0000138</regNo>\n" +
				"            <patientNo>928878</patientNo>\n" +
				"            <drugName>兰索拉唑肠溶胶囊</drugName>\n" +
				"            <drugSpec>30mg*14粒</drugSpec>\n" +
				"            <amount>28</amount>\n" +
				"            <unitPrice>5.2000</unitPrice>\n" +
				"            <totCost>145.60</totCost>\n" +
				"            <dosage>30</dosage>\n" +
				"            <adminstration>po</adminstration>\n" +
				"            <frequency>2</frequency>\n" +
				"            <frequencyName>bid</frequencyName>\n" +
				"            <diagnosis>(K25.903)胃溃疡</diagnosis>\n" +
				"            <emplCode>497</emplCode>\n" +
				"            <docName>赵志江</docName>\n" +
				"        </Item>\n" +
				"    </Items>\n" +
				"</Response>\n";

		OutpatientMedicalRecordsResponseHis recordsResponseHis = JaxbXmlUtil.convertToJavaBean(xml, OutpatientMedicalRecordsResponseHis.class);
	}

}
