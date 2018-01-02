package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dao.entity.Price;
import com.chinacaring.hmsrmyy.dto.front.response.PriceListResponse;

import java.util.List;

public interface PriceService {

    String insertDb() throws CommonException;

    List<PriceListResponse> getPriceList(String itemName);

    Price getPrice(String itemCode);
}
