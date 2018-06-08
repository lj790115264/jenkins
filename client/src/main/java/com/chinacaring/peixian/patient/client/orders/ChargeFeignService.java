package com.chinacaring.peixian.patient.client.orders;

import com.chinacaring.peixian.patient.client.dto.pingpp.ChargeResponse;
import com.chinacaring.peixian.patient.client.dto.pingpp.PingxxRefundRequest;
import com.chinacaring.peixian.patient.client.dto.pingpp.Refund;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xjh1994
 * @date 2017/12/5
 * @intro
 */
@FeignClient(value = "pay")
public interface ChargeFeignService {

    String AUTHORIZATION = "Basic cGF5OnBheWNhcmluZzIwMTc=";

    @GetMapping("charge")
    ChargeResponse getCharges(@RequestHeader(value = "Authorization") String authorization,
                              @RequestParam(value = "app_id") String app_id,
                              @RequestParam(value = "limit", required = false) Integer limit,
                              @RequestParam(value = "start", required = false) String start,
                              @RequestParam(value = "end", required = false) String end,
                              @RequestParam(value = "channel", required = false) String channel,
                              @RequestParam(value = "paid", required = false) Boolean paid,
                              @RequestParam(value = "refunded", required = false) Boolean refunded);

    @GetMapping("charge/{charge_id}")
    ChargeResponse getCharge(@RequestHeader(value = "Authorization") String authorization,
                             @PathVariable(value = "charge_id") String charge_id);

    @PostMapping("refund")
    String refund1(@RequestHeader(value = "Authorization") String authorization,
                  @RequestBody PingxxRefundRequest request);

    @PostMapping("refund")
    Refund refund(@RequestHeader(value = "Authorization") String authorization,
                  @RequestBody PingxxRefundRequest request);

    @GetMapping("refund")
    String getRefund(@RequestHeader(value = "Authorization") String authorization,
                           @RequestParam(value = "charge_id") String charge_id);
}
