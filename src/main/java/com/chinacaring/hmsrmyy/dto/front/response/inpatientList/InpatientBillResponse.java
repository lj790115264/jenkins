package com.chinacaring.hmsrmyy.dto.front.response.inpatientList;


import lombok.Data;

@Data
public class InpatientBillResponse {

    /*
    *  <examineDetailDepartMent>
            <date>2017-02-05</date>
            <itemClass>西药费</itemClass>
            <itemName>0.9%氯化钠注射液(直立式软袋)/250ml/袋</itemName>
            <itemCode>5063</itemCode>
            <specifications></specifications>
            <number>1</number>
            <unitPrice>4.08</unitPrice>
            <totCost>4.08</totCost>
        </examineDetailDepartMent>
        */

    //项目代码
    private String itemCode;

    private String itemClass;
    //项目名称
    private String name;
    //规格
    private String specifications;
    //数量
    private double amount;
    //单价
    private double unitPrice;
    //总价
    private double totalCost;
    //消费日期
    private String date;

}
