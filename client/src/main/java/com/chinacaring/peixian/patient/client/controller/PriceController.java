package com.chinacaring.peixian.patient.client.controller;


import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping("prices")
    public Object getNameList(@RequestParam("item_name") String itemName){

        return new Result<>(priceService.getPriceList("%" + itemName + "%"));

    }

    @GetMapping("price")
    public Object getPriceDetail(@RequestParam("item_code") String itemCode){

        return new Result<>(priceService.getPrice(itemCode));

    }
}
