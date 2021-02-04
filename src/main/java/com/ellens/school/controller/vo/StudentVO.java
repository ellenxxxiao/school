package com.ellens.school.controller.vo;

import com.ellens.school.model.Student;
import lombok.Data;

@Data
public class StudentVO {
    private Student student;
    private int totalGrade;

}
