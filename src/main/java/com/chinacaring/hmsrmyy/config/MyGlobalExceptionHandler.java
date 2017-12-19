package com.chinacaring.hmsrmyy.config;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.common.vo.ResultStatusCode;
import com.chinacaring.core.config.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class MyGlobalExceptionHandler extends GlobalExceptionHandler {

    @ExceptionHandler({NullPointerException.class})
    public Object nullExceptionHandler(HttpServletRequest req, NullPointerException e){
        return new Result<>(ResultStatusCode.SYSTEM_ERR.getErrorCode(), e.toString(),  "接口异常",null);
    }

    @ExceptionHandler({CommonException.class})
    public Object commonExceptionHandler(HttpServletRequest req, CommonException e){
        return new Result<>( ResultStatusCode.WEBSERVICE_WRONG_RESPONSE.getErrorCode(), e.getDetailMessage(), "接口返回码 非 1", null);
    }

}
