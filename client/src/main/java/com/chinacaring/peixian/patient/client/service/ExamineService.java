package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.front.response.ExamineDetailResponseWithSortCode;
import com.chinacaring.peixian.patient.client.dto.front.response.ExamineList;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;

import java.text.ParseException;
import java.util.List;

/**
 * @author xjh1994
 * @date 2017/10/13
 * @intro
 */
public interface ExamineService {

    List<ExamineList> getExamine(String regNo, String beginTime, String endTime) throws ParseException, CommonException, MyException;

}
