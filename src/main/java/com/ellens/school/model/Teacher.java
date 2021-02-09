package com.ellens.school.model;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {

    private int teacherId;
    private String teacherName;
    private List<Subject> subjects;

}
