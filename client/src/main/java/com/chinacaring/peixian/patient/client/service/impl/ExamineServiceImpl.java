package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dto.front.response.ExamineDetailResponseWithSortCode;
import com.chinacaring.peixian.patient.client.dto.front.response.ExamineList;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.ExamineService;
import com.chinacaring.peixian.patient.client.utils.ListUtils;
import com.chinacaring.peixian.patient.client.utils.ValidateUtils;
import com.chinacaring.peixian.patient.client.wsdl.reponse.lis_resultinfo.LisResultInfo;
import com.chinacaring.peixian.patient.client.wsdl.reponse.lis_resultinfo.LisResultInfoSoap;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author xjh1994
 * @date 2017/10/13
 * @intro
 */
@Service
public class ExamineServiceImpl implements ExamineService {

    @Autowired
    private QuyiServiceNo service;

    @Override
    public List<ExamineList> getExamine(String regNo, String beginTime, String endTime) throws ParseException, CommonException, MyException {

        String result = service.getQuyiServiceNoSoap().getLisResultInfo(regNo, beginTime, endTime);
        LisResultInfoSoap soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(result, LisResultInfoSoap.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", result, regNo + "-" + beginTime + "-" + endTime);
        }

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())){
            throw new SoapException("暂时没有数据哦～", soap.getResult().getReturnDesc(), regNo + "-" + beginTime + "-" + endTime);
        } else if (soap.getData().getLisResultInfo().isEmpty()){
            throw new MyException("暂时没有数据哦～", regNo + "-" + beginTime + "-" + endTime);
        }

        List<ExamineDetailResponseWithSortCode> examineResponses = new ArrayList<>();
        for (LisResultInfo departMent : soap.getData().getLisResultInfo()){

            ExamineDetailResponseWithSortCode examineResponse = new ExamineDetailResponseWithSortCode();
            examineResponse.setName(departMent.getHisitemnamelist());
            examineResponse.setExamine_code(departMent.getBarcode());
            examineResponse.setItemName(departMent.getItemname());
            if (null != departMent.getAccepttime()) {
                examineResponse.setReportTime((ValidateUtils.soapTime(departMent.getAccepttime())));
            }
            examineResponse.setUnit(departMent.getUnit());
            examineResponse.setValue(departMent.getReportvalue());
            if (null != departMent.getRangeinfo()) {
                examineResponse.setRange(departMent.getRangeinfo().trim());
            }

            if (null == departMent.getResultflag()) {
                examineResponse.setStatus("normal");
                examineResponse.setStatusCode(1);
            } else {
                switch (departMent.getResultflag()) {
                    case "高":examineResponse.setStatus("high");
                        examineResponse.setStatusCode(3); break;
                    case "低":examineResponse.setStatus("lower");
                        examineResponse.setStatusCode(2); break;
                    default: examineResponse.setStatus("normal");
                        examineResponse.setStatusCode(1);
                }
            }

            examineResponses.add(examineResponse);
        }



        ListUtils<ExamineDetailResponseWithSortCode> listUtils = new ListUtils<>(examineResponses);

        Map<String, List<ExamineDetailResponseWithSortCode>> map = listUtils.groupBy(ExamineDetailResponseWithSortCode.class,
                "getExamine_code");

        List<ExamineList> examineListList = new ArrayList<>();
        for (List<ExamineDetailResponseWithSortCode> list: map.values()) {
            ExamineList examineList = new ExamineList();
            list.sort((a, b) -> {
                if (a.getStatusCode() > b.getStatusCode()) {
                    return -1;
                }
                return 1;
            });

            examineList.setDetail(list);
            examineList.setExamine_code(list.get(0).getExamine_code());
            examineList.setName(list.get(0).getName());
            examineList.setReport_time(list.get(0).getReportTime());
            examineListList.add(examineList);
        }

        return examineListList;
    }

//    @Override
//    public List<ExamineDetailResponseWithSortCode> getDetail(String reportNO) throws CommonException {
//
//        ExamineDetailRequestHis request = new ExamineDetailRequestHis();
//        request.setReportNO(reportNO);
//        String regResult = RequestUtil.soap(InterfaceName.getLisResultDetilInfo.name(), JaxbXmlUtil.convertToXml(request));
//
//        ExamineDetailResponseHis result = JaxbXmlUtil.convertToJavaBean(regResult, ExamineDetailResponseHis.class);
//
//        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, result.getReturnCode())){
//            throw new CommonException(result.getReturnDesc());
//        }else if (result.getItems().getItem().isEmpty()){
//            throw new CommonException("暂无相关数据");
//        }
//
//        List<ExamineDetailResponseWithSortCode> response = BeanMapperUtil.mapList(result.getItems().getItem(), ExamineDetailResponseWithSortCode.class);
//
//        for (int i = 0; i < response.size() ; i++){
//            ExamineDetailResponseWithSortCode examineDetailResponseWithSortCode = response.get(i);
//            com.chinacaring.peixian.patient.client.dto.his.response.examineDetail.ItemType itemType = result.getItems().getItem().get(i);
//
//            //是危急值
//            if ("1".equals(itemType.getIsDanger())){
//                examineDetailResponseWithSortCode.setStatus("danger");
//                examineDetailResponseWithSortCode.setStatus_code(4);
//            }
//
//            //偏高或者偏低
//            if ("↑".equals(itemType.getResultFlag())){
//                examineDetailResponseWithSortCode.setStatus("high");
//                examineDetailResponseWithSortCode.setStatus_code(3);
//            }else if ("↓".equals(itemType.getResultFlag())){
//                examineDetailResponseWithSortCode.setStatus("low");
//                examineDetailResponseWithSortCode.setStatus_code(2);
//            }else {
//                examineDetailResponseWithSortCode.setStatus("normal");
//                examineDetailResponseWithSortCode.setStatus_code(1);
//            }
//            examineDetailResponseWithSortCode.setRange(examineDetailResponseWithSortCode.getRange().trim());
//        }
//
//        response.sort((o1, o2) -> o2.getStatus_code() - o1.getStatus_code());
//
//        return response;
//    }
}
