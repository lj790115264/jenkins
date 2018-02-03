package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.dto.response.ExamineResponse;
import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.dto.front.response.ExamineDetailResponseWithSortCode;
import com.chinacaring.peixian.patient.client.dto.front.response.ExamineList;
import com.chinacaring.peixian.patient.client.service.ExamineService;
import com.chinacaring.peixian.patient.client.utils.ValidateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Objects;

/**
 * @author xjh1994
 * @date 2017/10/13
 * @intro
 */
@RestController
@Api("检验接口")
public class ExamineController {

    @Autowired
    private ExamineService examineService;

    @ApiOperation("获取检验列表")
    @GetMapping(value = "/examine")
    public Object getExamine(@RequestParam("register_id") String regNo,
                             @RequestParam("begin_time") String beginTime,
                             @RequestParam("end_time") String endTime) throws ParseException, CommonException {

        beginTime = ValidateUtils.time(beginTime) + "000000";
        endTime = ValidateUtils.time(endTime) + "000000";

        List<ExamineList> examineResponses = examineService.getExamine(regNo, beginTime, endTime);
        if (Objects.equals(0, examineResponses.size())){
            throw new CommonException("暂无相关记录");
        }
        return new Result<>(examineResponses);

    }

//    @ApiOperation("获取检验详情")
//    @GetMapping(value = "/examine/{examine_id}")
//    public Object getExamineDetail(@PathVariable("examine_id") String examine_code) throws CommonException {
//
//        return new Result<>(examineService.getDetail(examine_code));
//    }
}
