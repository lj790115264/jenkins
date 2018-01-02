package com.chinacaring.hmsrmyy.controller;

import com.chinacaring.common.dto.response.ExamineResponse;
import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.hmsrmyy.service.ExamineService;
import io.swagger.annotations.Api;
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

    @GetMapping(value = "/examine")
    public Object getExamine(@RequestParam("register_id") String regNo) throws ParseException, CommonException {

        List<ExamineResponse> examineResponses = examineService.getExamine(regNo);
        if (Objects.equals(0, examineResponses.size())){
            throw new CommonException("暂无相关记录");
        }
        return new Result<>(examineResponses);

    }

    @GetMapping(value = "/examine/{examine_code}")
    public Object getExamineDetail(@PathVariable("examine_code") String examine_code) throws CommonException {

        return new Result<>(examineService.getDetail(examine_code));
    }
}
