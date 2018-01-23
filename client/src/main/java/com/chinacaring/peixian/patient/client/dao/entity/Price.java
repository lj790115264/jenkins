package com.chinacaring.peixian.patient.client.dao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Price {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "board_style")
    private String boardStyle;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_code")
    private String itemCode;
    @Column(name = "item_price")
    private String itemPrice;
    @Column(name = "item_category")
    private String itemCategory;
    @Column(name = "item_measure_unit")
    private String itemMeasureUnit;

    private String manufactory;
    private String instructions;
    private String formats;
    private String remark;

    @Column(name = "create_time")
    private String createTime;

    public Price() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManufactory() {
        return manufactory;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getFormats() {
        return formats;
    }

    public void setFormats(String formats) {
        this.formats = formats;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBoardStyle() {
        return boardStyle;
    }

    public void setBoardStyle(String boardStyle) {
        this.boardStyle = boardStyle;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemMeasureUnit() {
        return itemMeasureUnit;
    }

    public void setItemMeasureUnit(String itemMeasureUnit) {
        this.itemMeasureUnit = itemMeasureUnit;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return  "名称: " + itemName + '\n' +
                "价格: " + itemPrice + " 元 \n" +
                "分类: " + itemCategory + '\n' +
                "计量单位: " + itemMeasureUnit + '\n' +
                "厂商: " + manufactory + '\n' +
                "使用说明: " + instructions + '\n' +
                "规格: " + formats + '\n' +
                "备注: " + remark + '\n' ;
    }
}
