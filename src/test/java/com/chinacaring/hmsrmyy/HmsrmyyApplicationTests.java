package com.chinacaring.hmsrmyy;

import com.chinacaring.common.dto.response.DoctorResponse;
import com.chinacaring.common.dto.response.ExamineResponse;
import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.dto.front.request.Prescription;
import com.chinacaring.hmsrmyy.dto.his.response.createProfile.CreateProfileResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.examineList.ExamineListResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.examineList.ItemType;
import com.chinacaring.hmsrmyy.dto.his.response.outPatientMedicalRecords.OutpatientMedicalRecordsResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.registerState.RegisterStateResponseHis;
import com.chinacaring.hmsrmyy.service.BaseInfoService;
import com.chinacaring.util.JaxbXmlUtil;
import com.chinacaring.util.StringUtil;
import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HmsrmyyApplicationTests {

	@Autowired
	private BaseInfoService baseInfoService;

	@Test
	public void contextLoads() {
	}

	@Autowired
	private Gson gson;

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

//		String xml = "<Response>\n" +
//				"    <returnCode>1</returnCode>\n" +
//				"    <returnDesc />\n" +
//				"    <Items>\n" +
//				"        <Item>\n" +
//				"            <regNo>O0000138</regNo>\n" +
//				"            <patientNo>928878</patientNo>\n" +
//				"            <drugName>铝碳酸镁片</drugName>\n" +
//				"            <drugSpec>0.5g×36片</drugSpec>\n" +
//				"            <amount>108</amount>\n" +
//				"            <unitPrice>0.5472</unitPrice>\n" +
//				"            <totCost>59.10</totCost>\n" +
//				"            <dosage>1.50</dosage>\n" +
//				"            <adminstration>po</adminstration>\n" +
//				"            <frequency>3</frequency>\n" +
//				"            <frequencyName>tid</frequencyName>\n" +
//				"            <diagnosis>(K25.903)胃溃疡</diagnosis>\n" +
//				"            <emplCode>497</emplCode>\n" +
//				"            <docName>赵志江</docName>\n" +
//				"        </Item>\n" +
//				"        <Item>\n" +
//				"            <regNo>O0000138</regNo>\n" +
//				"            <patientNo>928878</patientNo>\n" +
//				"            <drugName>兰索拉唑肠溶胶囊</drugName>\n" +
//				"            <drugSpec>30mg*14粒</drugSpec>\n" +
//				"            <amount>28</amount>\n" +
//				"            <unitPrice>5.2000</unitPrice>\n" +
//				"            <totCost>145.60</totCost>\n" +
//				"            <dosage>30</dosage>\n" +
//				"            <adminstration>po</adminstration>\n" +
//				"            <frequency>2</frequency>\n" +
//				"            <frequencyName>bid</frequencyName>\n" +
//				"            <diagnosis>(K25.903)胃溃疡</diagnosis>\n" +
//				"            <emplCode>497</emplCode>\n" +
//				"            <docName>赵志江</docName>\n" +
//				"        </Item>\n" +
//				"    </Items>\n" +
//				"</Response>\n";
//
//		OutpatientMedicalRecordsResponseHis recordsResponseHis = JaxbXmlUtil.convertToJavaBean(xml, OutpatientMedicalRecordsResponseHis.class);

//		String json = "[\n" +
//				"{\n" +
//				"\"prescriptionNo\":\"233\",\n" +
//				"\"cost\":\"200\"\n" +
//				"},\n" +
//				"{\n" +
//				"\"prescriptionNo\":\"233\",\n" +
//				"\"cost\":\"200\"\n" +
//				"}\n" +
//				"]";
//
//		List<Map> arrayList = gson.fromJson(json, List.class);
//		Map map = arrayList.get(0);
//		System.out.println(map.get("prescriptionNo"));
//		BigDecimal bigDecimal = new BigDecimal("123");
//		List<String> strings = new ArrayList<>();
//		String join = StringUtils.join(strings, "|");
//		System.out.println("\n" + join + "\n");

		String s = "<Response>\n" +
				"    <returnCode>1</returnCode>\n" +
				"    <returnDesc />\n" +
				"    <Items>\n" +
				"        <Item>\n" +
				"            <sampleType>血液</sampleType>\n" +
				"            <lisItemName>临检</lisItemName>\n" +
				"            <lisItemCode>临检</lisItemCode>\n" +
				"            <sendTime>2017/11/23 14:48:00</sendTime>\n" +
				"            <inceptTime>2017/11/23 12:59:00</inceptTime>\n" +
				"            <acceptTime>2017/11/23 14:48:38</acceptTime>\n" +
				"            <reportStatus>1</reportStatus>\n" +
				"            <approveTime>2017/11/23 15:00:07</approveTime>\n" +
				"            <doctorCode>3035</doctorCode>\n" +
				"            <doctorName>郭建晖</doctorName>\n" +
				"            <printSeq>1</printSeq>\n" +
				"            <machineId>028</machineId>\n" +
				"            <sampleId>232</sampleId>\n" +
				"            <reportNo>4652781</reportNo>\n" +
				"        </Item>\n" +
				"        <Item>\n" +
				"            <sampleType>血液</sampleType>\n" +
				"            <lisItemName>临检</lisItemName>\n" +
				"            <lisItemCode>临检</lisItemCode>\n" +
				"            <sendTime>2017/11/23 13:24:00</sendTime>\n" +
				"            <inceptTime>2017/11/23 12:59:00</inceptTime>\n" +
				"            <acceptTime>2017/11/23 13:24:48</acceptTime>\n" +
				"            <reportStatus>1</reportStatus>\n" +
				"            <approveTime>2017/11/23 13:28:48</approveTime>\n" +
				"            <doctorCode>3207</doctorCode>\n" +
				"            <doctorName>刘一坤</doctorName>\n" +
				"            <printSeq>1</printSeq>\n" +
				"            <machineId>019</machineId>\n" +
				"            <sampleId>80</sampleId>\n" +
				"            <reportNo>4652701</reportNo>\n" +
				"        </Item>\n" +
				"        <Item>\n" +
				"            <sampleType>血清</sampleType>\n" +
				"            <lisItemName>生化</lisItemName>\n" +
				"            <lisItemCode>生化</lisItemCode>\n" +
				"            <sendTime>2017/11/23 14:26:00</sendTime>\n" +
				"            <inceptTime>2017/11/23 12:59:00</inceptTime>\n" +
				"            <acceptTime>2017/11/23 14:26:35</acceptTime>\n" +
				"            <reportStatus>1</reportStatus>\n" +
				"            <approveTime>2017/11/23 15:17:51</approveTime>\n" +
				"            <doctorCode>3233</doctorCode>\n" +
				"            <doctorName>吴欢欢</doctorName>\n" +
				"            <printSeq>1</printSeq>\n" +
				"            <machineId>025</machineId>\n" +
				"            <sampleId>122</sampleId>\n" +
				"            <reportNo>4652614</reportNo>\n" +
				"        </Item>\n" +
				"    </Items>\n" +
				"</Response>\n";

		ExamineListResponseHis response = JaxbXmlUtil.convertToJavaBean(s, ExamineListResponseHis.class);

		if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, response.getReturnCode())){
			throw new CommonException(response.getReturnDesc());
		}else if (response.getItems().getItem().isEmpty()){
			throw new CommonException("暂无相关数据");
		}

		List<ExamineResponse> examineResponses = new ArrayList<>();
		for (ItemType departMent : response.getItems().getItem()){

			ExamineResponse examineResponse = new ExamineResponse();
			examineResponse.setName(departMent.getLisItemName());
			examineResponse.setExamine_code(departMent.getReportNo());
			examineResponse.setApply_date((departMent.getSendTime()).replace("/", "-"));
			examineResponse.setExecute_date((departMent.getAcceptTime()).replace("/", "-"));
			examineResponse.setReport_date((departMent.getApproveTime()).replace("/", "-"));
			examineResponse.setOrders_provider(new DoctorResponse(departMent.getDoctorCode(), departMent.getDoctorName()));
			examineResponse.setReport_code(departMent.getLisItemCode());

			examineResponses.add(examineResponse);
		}
	}

}
