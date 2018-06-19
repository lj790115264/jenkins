package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dao.entity.Price;
import com.chinacaring.peixian.patient.client.dto.front.response.PriceListResponse;
import com.chinacaring.peixian.patient.client.exception.SoapException;

import java.util.List;

public interface PriceService {

    String insertDb() throws CommonException, SoapException;

    List<PriceListResponse> getPriceList(String itemName);

    Price getPrice(String itemCode);
}
