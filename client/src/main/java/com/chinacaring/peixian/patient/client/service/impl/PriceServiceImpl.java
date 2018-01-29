package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.config.InterfaceName;
import com.chinacaring.peixian.patient.client.dao.entity.Price;
import com.chinacaring.peixian.patient.client.dao.repository.PriceRepository;
import com.chinacaring.peixian.patient.client.dto.front.response.PriceListResponse;
import com.chinacaring.peixian.patient.client.dto.his.request.price.PriceRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.response.price.PriceResponseHis;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.PriceService;
import com.chinacaring.peixian.patient.client.utils.RequestUtil;
import com.chinacaring.peixian.patient.client.wsdl.reponse.query_priceboardinfo.QueryPriceBoardInfoSoap;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private QuyiServiceNo service;

    @Override
    public String insertDb() throws CommonException {

        String res = service.getQuyiServiceNoSoap().queryPriceBoardInfo("ALL");
        QueryPriceBoardInfoSoap soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, QueryPriceBoardInfoSoap.class);
        } catch (Exception e) {
            throw new SoapException("获取价格公式信息失败", res, "ALL");
        }

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())){
            throw new SoapException("获取价格公示失败", soap.getResult().getReturnDesc(), "ALL");
        }

        List<Price> prices = BeanMapperUtil.mapList(soap.getData().getQueryPriceBoardInfo(), Price.class);

        priceRepository.save(prices);

        return "ok";
    }

    @Override
    public List<PriceListResponse> getPriceList(String itemName) {

        List<Price> prices = priceRepository.findByItemNameLike(itemName);

        return BeanMapperUtil.mapList(prices, PriceListResponse.class);
    }

    @Override
    public Price getPrice(String itemCode) {

        Price price = priceRepository.findTopByItemCode(itemCode);

        return price;
    }

}
