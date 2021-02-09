package com.ellens.school.service;

import com.ellens.school.dao.SubjectMapper;
import com.ellens.school.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;

    public List<Subject> getSubjectByTeacherId(int teacherId){
        return subjectMapper.getSubjectsByTeacherId(teacherId);
    }

    public Subject getSubjectById(int subjectId){
        return subjectMapper.getSubjectById(subjectId);
    }
}
