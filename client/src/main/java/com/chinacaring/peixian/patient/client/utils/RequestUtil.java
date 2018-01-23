package com.chinacaring.peixian.patient.client.utils;


import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.util.DomMapUtil;
import com.chinacaring.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;


public class RequestUtil {

    private static Logger logger = LoggerFactory.getLogger(RequestUtil.class);

    private static String SOAPENV = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <tem:%s>\n" +
            "         <!--Optional:-->\n" +
            "         <tem:strInput>%s</tem:strInput>\n" +
            "      </tem:%s>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>";

    public static String soap(String params) {
        return soap(Constant.URL_WEBSERVICE, params, StringUtil.UTF8);
    }


    public static String soap(String interfaceName, String strInput){
        strInput = strInput.replace("<", "&lt;");
        strInput = strInput.replace(">", "&gt;");
        String soapRequest = String.format(SOAPENV, interfaceName, strInput, interfaceName);
        logger.info("入参\n\n\n" + soapRequest + "\n\n\n");
        String soapResponse = soap(soapRequest);
        logger.info("出参\n\n\n" + soapResponse + "\n\n\n");
        return getResult(soapResponse, interfaceName);
    }

    /**
     * 获取返回结果
     * @param result
     * @return
     */
    public static String getResult(String result, String interfaceName) {
        Map resultMap = null;
        resultMap = DomMapUtil.Dom2Map(result);
        return String.valueOf(((Map) ((Map) resultMap.get("Body")).get(interfaceName + "Response")).get(interfaceName + "Result"));
    }

    // http的soap方法
    public static String soap(String url, String params, String encoding) {
        PrintWriter out = null;
        InputStream in = null;
        String result = "";
        HttpURLConnection conn = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            conn = (HttpURLConnection)realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            //conn.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            // conn.setRequestProperty("SOAPAction","\"\"");
            conn.setRequestProperty("Content-Length", params.getBytes().length + "");
            conn.setRequestProperty("Content-Type", "text/xml;charset=" + encoding);
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(params);
            // flush输出流的缓冲
            out.flush();

            // 定义BufferedReader输入流来读取URL的响应
            in = conn.getInputStream();
            result = streamToString(in, encoding);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            if (conn != null) {
                conn.disconnect();
            }
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    // 流转string
    public static String streamToString(InputStream inputStream, String encode) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int len = 0;
        String result = "";
        if (inputStream != null) {
            try {
                while ((len = inputStream.read(data)) != -1) {
                    outputStream.write(data, 0, len);
                }
                result = new String(outputStream.toByteArray(), encode);

                outputStream.close();
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
