package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.dto.response.ExamineResponse;
import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.response.ExamineDetailResponseWithSortCode;

import java.text.ParseException;
import java.util.List;

/**
 * @author xjh1994
 * @date 2017/10/13
 * @intro
 */
public interface ExamineService {

    List<ExamineResponse> getExamine(String regNo) throws ParseException, CommonException;

    List<ExamineDetailResponseWithSortCode> getDetail(String reportNO) throws CommonException;
}
