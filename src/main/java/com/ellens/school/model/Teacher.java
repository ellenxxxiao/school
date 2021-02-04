package com.ellens.school.model;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {

    private int id;
    private String name;
    private List<Subject> subjects;

}
