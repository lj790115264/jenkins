package com.chinacaring.peixian.patient.client.dto.front.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class PrescriptionResponse {

    private String recipeKey;
    private String recipeNO;
    private String seqNO;
    private String feeCode;
    private String drugFlag;
    private String itemCode;
    private String itemName;
    private String number;
    private String unitPrice;
    private String totCost;

    private String doctorName;

    private String doctorCode;

    private String deptCode;
    private String deptName;
    private String execDeptCode;
    private String execDeptName;
    private String itemClass;
    private String payFlag;

    private String time;

    public String getRecipeKey() {
        return recipeKey;
    }

    public void setRecipeKey(String recipeKey) {
        this.recipeKey = recipeKey;
    }

    public String getRecipeNO() {
        return recipeNO;
    }

    public void setRecipeNO(String recipeNO) {
        this.recipeNO = recipeNO;
    }

    public String getSeqNO() {
        return seqNO;
    }

    public void setSeqNO(String seqNO) {
        this.seqNO = seqNO;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getDrugFlag() {
        return drugFlag;
    }

    public void setDrugFlag(String drugFlag) {
        this.drugFlag = drugFlag;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotCost() {
        return totCost;
    }

    public void setTotCost(String totCost) {
        this.totCost = totCost;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getExecDeptCode() {
        return execDeptCode;
    }

    public void setExecDeptCode(String execDeptCode) {
        this.execDeptCode = execDeptCode;
    }

    public String getExecDeptName() {
        return execDeptName;
    }

    public void setExecDeptName(String execDeptName) {
        this.execDeptName = execDeptName;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
