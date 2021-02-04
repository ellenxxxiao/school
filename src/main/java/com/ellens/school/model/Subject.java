package com.ellens.school.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Subject implements Serializable {

    private int subid;
    private String subname;
    private String subdescription;
    private Teacher teacher;

}
