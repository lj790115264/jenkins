package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dao.entity.Price;
import com.chinacaring.hmsrmyy.dao.repository.PriceRepository;
import com.chinacaring.hmsrmyy.dto.front.response.PriceListResponse;
import com.chinacaring.hmsrmyy.dto.his.request.price.PriceRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.price.PriceResponseHis;
import com.chinacaring.hmsrmyy.service.PriceService;
import com.chinacaring.hmsrmyy.utils.RequestUtil;
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

    @Override
    public String insertDb() throws CommonException {

        PriceRequestHis priceRequest = new PriceRequestHis();
        priceRequest.setItemCode("ALL");
        String xmlString = RequestUtil.soap(InterfaceName.QueryPriceBoardInfo.name(), JaxbXmlUtil.convertToXml(priceRequest));

        PriceResponseHis priceResponse = JaxbXmlUtil.convertToJavaBean(xmlString, PriceResponseHis.class);

        if (Objects.equals(Constant.RETURN_CODE_SUCCESS, priceResponse.getReturnCode())){
            throw new CommonException("获取价格公示失败");
        }

        List<Price> prices = BeanMapperUtil.mapList(priceResponse.getDatas().getData(), Price.class);

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
