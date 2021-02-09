package com.ellens.school.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Subject implements Serializable {

    private int subId;
    private String subName;
    private String subDescription;
//    private int teacherId;
    private Teacher teacher;

}
