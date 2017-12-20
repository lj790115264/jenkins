package com.chinacaring.hmsrmyy.dao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Dept {

    @Id
    @GeneratedValue
    private Integer id;
    private String deptCode;
    private String deptName;
    private String deptDes;
    private String deptType;
    private String branch;
    private String regFlag;
}
