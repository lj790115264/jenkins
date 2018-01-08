package com.chinacaring.hmsrmyy.config;

public enum InterfaceName {

    inhosBill("住院清单"),
    getInpatientNo("查询当前的住院信息"),
    QueryPriceBoardInfo("价格公式"),
    getLisResultInfo("检验主表"),
    getLisResultDetilInfo("检验明细"),
    hospitalizationExpensesRecharge("住院押金费充值确认"),
    saveFee("门诊结算确认"),
    getPrescriptionInfo("获取处方信息"),
    getUnpaidClinicInfo("未缴费门诊"),
    GetOrderInfo("门诊用药记录"),
    getClinicRecordsInfo("查询门诊记录"),
    getClinicState("查询挂号状态"),
    insertRegisterInfo("挂号"),
    insertBooking("预约"),
    getSchemaInfo("排版信息"),
    deptInfo("科室信息"),
    createProfile("建立门诊档案"),
    getExistProfile("返回此身份证关联的门诊档案");

    private String interfaceName;

    InterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }
}
