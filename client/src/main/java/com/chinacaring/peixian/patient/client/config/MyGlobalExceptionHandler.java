package com.chinacaring.peixian.patient.client.config;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.common.vo.ResultStatusCode;
import com.chinacaring.core.config.GlobalExceptionHandler;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class MyGlobalExceptionHandler extends GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(MyGlobalExceptionHandler.class);

    @ExceptionHandler({NullPointerException.class})
    public Object nullExceptionHandler(HttpServletRequest req, NullPointerException e){
        logger.error(e.getMessage());
        return new Result<>(ResultStatusCode.SYSTEM_ERR.getErrorCode(), e.toString(),  "接口异常",null);
    }

    @ExceptionHandler({CommonException.class})
    public Object commonExceptionHandler(HttpServletRequest req, CommonException e){
        return new Result<>( ResultStatusCode.WEBSERVICE_WRONG_RESPONSE.getErrorCode(), e.getDetailMessage(), "接口返回码 非 1", null);
    }

    @ExceptionHandler({Exception.class})
    public Result defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        Result result = new Result();
        result.setMessage(e.getMessage());
        if (e instanceof NoHandlerFoundException) {
            result.setCode(404);
        } else if (e instanceof CommonException) {
            result.setCode(((CommonException)e).getResultCode());
        } else {
            result.setCode(500);
        }

        result.setData((Object)null);
        if (!(e instanceof NoHandlerFoundException) && !(e instanceof MissingServletRequestParameterException)) {
            this.sendEmail(req, e);
        }

        logger.error(e.getMessage());

        return result;
    }

    @ExceptionHandler({MyException.class})
    public Object myExceptionHandler(HttpServletRequest req, MyException e){

        logger.error("------------------------------");
        logger.error("exception:" + e.getDevMessage());
        return new Result<>( 500, e.getMessage(), e.getDevMessage(), null);
    }

    @ExceptionHandler({SoapException.class})
    public Object myExceptionHandler(HttpServletRequest req, SoapException e){

        logger.error("------------------------------");
        logger.error("argument:" + e.getArguments());
        logger.error("exception:" + e.getDevMessage());
        return new Result<>( 500, e.getMessage(), e.getDevMessage(), null);
    }
}
