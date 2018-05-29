package com.chinacaring.peixian.patient.client.dto.front.response;

import com.chinacaring.peixian.patient.client.dto.check.CheckCompare;
import com.chinacaring.peixian.patient.client.dto.check.CheckCount;

import java.util.List;

public class CheckOrderResponse {

    private List<CheckCount> count;
    private List<CheckCompare> checkLong;
    private List<CheckCompare> checkShort;

    public List<CheckCount> getCount() {
        return count;
    }

    public void setCount(List<CheckCount> count) {
        this.count = count;
    }

    public List<CheckCompare> getCheckLong() {
        return checkLong;
    }

    public void setCheckLong(List<CheckCompare> checkLong) {
        this.checkLong = checkLong;
    }

    public List<CheckCompare> getCheckShort() {
        return checkShort;
    }

    public void setCheckShort(List<CheckCompare> checkShort) {
        this.checkShort = checkShort;
    }
}
