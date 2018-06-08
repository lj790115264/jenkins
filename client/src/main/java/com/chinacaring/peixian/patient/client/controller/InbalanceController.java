package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.dto.front.request.InbalanceInfoRequest;
import com.chinacaring.peixian.patient.client.service.InbalanceService;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
public class InbalanceController {

    @Autowired
    private InbalanceService inbalanceService;

    /**
     * @param name
     * @param idcard
     * @return
     * @throws CommonException
     */
    @GetMapping("in_hospital/balance")
    public Object getInbalance(@RequestParam("name") String name,
                               @RequestParam("id_card") String idcard) throws CommonException {
        return new Result<>(inbalanceService.getInbalance(name, idcard));
    }

    /**
     * @param inbalanceInfoRequest
     * @param user
     * @return
     * @throws ParseException
     */
    @PostMapping("in_hospital/deposit/recharge")
    public Object createInbalanceOrder(@RequestBody InbalanceInfoRequest inbalanceInfoRequest, @CurrentUser User user) throws ParseException {
        return new Result<>(inbalanceService.createInbalanceOrder(inbalanceInfoRequest, user));

    }

    /**
     * @param id
     * @return
     * @throws CommonException
     */
    @GetMapping("in_hospital/balance/{id}")
    public Object getInbalanceStatus(@PathVariable("id") Integer id) throws CommonException {
        return new Result<>(inbalanceService.getInbalanceStatus(id));
    }

    /**
     * 住院清单
     * @param name
     * @param idcard
     * @return
     * @throws CommonException
     */
    @GetMapping("in_hospital/bills")
    public Object getInhospitalBills(@RequestParam("name") String name,
                                     @RequestParam("id_card") String idcard) throws CommonException {
        return new Result<>(inbalanceService.getInbalanceList(name, idcard));

    }



}
