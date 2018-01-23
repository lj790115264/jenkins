package com.chinacaring.peixian.patient.client.utils;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.exception.MyException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateUtils {

    public static String time(String oTime) throws MyException {

        return time(oTime, "yyyyMMdd");
    }

    public static String time(String oTime, String format) throws MyException {

        SimpleDateFormat osdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat asdf = new SimpleDateFormat(format);
        try {
            Date date = osdf.parse(oTime);
            return asdf.format(date);
        } catch (ParseException e) {
            throw new MyException("时间格式有问题", oTime);
        }
    }

    public static String soapTime(String oTime) throws MyException {

        return soapTime(oTime, "yyyy-MM-dd HH:mm:ss");
    }

    public static String soapTime(String oTime, String formate) throws MyException {

        oTime = oTime.replaceAll(":", "");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HHmmss");
        SimpleDateFormat sdfAfter = new SimpleDateFormat(formate);

        Date date = null;
        try {
            date = sdf.parse(oTime);
        } catch (ParseException e) {
            throw new MyException("获取数据出错", "时间不符合规范");
        }
        return sdfAfter.format(date);
    }
}
