package com.ellens.school.controller;

import com.ellens.school.model.Subject;
import com.ellens.school.model.Teacher;
import com.ellens.school.service.SubjectService;
import com.ellens.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.PathParam;

@RestController
@RequestMapping("/school")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/teacher/{id}")
    public Teacher getTeacherById(@PathVariable String id){
        return teacherService.getTeacherById(Integer.parseInt(id));
    }

    @PostMapping("/subject/{id}")
    public Subject getSubjectById(@PathVariable String id){
        return subjectService.getSubjectById(Integer.parseInt(id));
    }

    @PostMapping("/subTeacher/{id}")
    public Subject getSubjectByTeacherId(@PathVariable String id) {
        return subjectService.getSubjectByTeacherId(Integer.parseInt(id));
    }
}
