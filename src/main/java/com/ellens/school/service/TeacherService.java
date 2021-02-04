package com.ellens.school.service;

import com.ellens.school.dao.TeacherMapper;
import com.ellens.school.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher getTeacherById(int teacherId){
        return teacherMapper.getTeacherById(teacherId);
    }


}
