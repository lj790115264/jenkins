package com.chinacaring.hmsrmyy.config;

public enum InterfaceName {

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
