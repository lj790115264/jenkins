package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.common.dto.response.DoctorResponse;
import com.chinacaring.common.dto.response.ExamineResponse;
import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dto.front.response.ExamineDetailResponseWithSortCode;
import com.chinacaring.hmsrmyy.dto.his.request.examineDetail.ExamineDetailRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.examineList.ExamineListRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.examineDetail.ExamineDetailResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.examineList.ExamineListResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.examineList.ItemType;
import com.chinacaring.hmsrmyy.service.ExamineService;
import com.chinacaring.hmsrmyy.utils.RequestUtil;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author xjh1994
 * @date 2017/10/13
 * @intro
 */
@Service
public class ExamineServiceImpl implements ExamineService {

    @Override
    public List<ExamineResponse> getExamine(String regNo) throws ParseException, CommonException {

        ExamineListRequestHis request = new ExamineListRequestHis();
        request.setRegNO(regNo);
        String regResult = RequestUtil.soap(InterfaceName.getLisResultInfo.name(), JaxbXmlUtil.convertToXml(request));

        ExamineListResponseHis response = JaxbXmlUtil.convertToJavaBean(regResult, ExamineListResponseHis.class);

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

        return examineResponses;
    }

    @Override
    public List<ExamineDetailResponseWithSortCode> getDetail(String reportNO) throws CommonException {

        ExamineDetailRequestHis request = new ExamineDetailRequestHis();
        request.setReportNO(reportNO);
        String regResult = RequestUtil.soap(InterfaceName.getLisResultDetilInfo.name(), JaxbXmlUtil.convertToXml(request));

        ExamineDetailResponseHis result = JaxbXmlUtil.convertToJavaBean(regResult, ExamineDetailResponseHis.class);

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, result.getReturnCode())){
            throw new CommonException(result.getReturnDesc());
        }else if (result.getItems().getItem().isEmpty()){
            throw new CommonException("暂无相关数据");
        }

        List<ExamineDetailResponseWithSortCode> response = BeanMapperUtil.mapList(result.getItems().getItem(), ExamineDetailResponseWithSortCode.class);

        for (int i = 0; i < response.size() ; i++){
            ExamineDetailResponseWithSortCode examineDetailResponseWithSortCode = response.get(i);
            com.chinacaring.hmsrmyy.dto.his.response.examineDetail.ItemType itemType = result.getItems().getItem().get(i);

            //是危急值
            if ("1".equals(itemType.getIsDanger())){
                examineDetailResponseWithSortCode.setStatus("danger");
                examineDetailResponseWithSortCode.setStatus_code(4);
            }

            //偏高或者偏低
            if ("↑".equals(itemType.getResultFlag())){
                examineDetailResponseWithSortCode.setStatus("high");
                examineDetailResponseWithSortCode.setStatus_code(3);
            }else if ("↓".equals(itemType.getResultFlag())){
                examineDetailResponseWithSortCode.setStatus("low");
                examineDetailResponseWithSortCode.setStatus_code(2);
            }else {
                examineDetailResponseWithSortCode.setStatus("normal");
                examineDetailResponseWithSortCode.setStatus_code(1);
            }
            examineDetailResponseWithSortCode.setRange(examineDetailResponseWithSortCode.getRange().trim());
        }

        response.sort((o1, o2) -> o2.getStatus_code() - o1.getStatus_code());

        return response;
    }
}
