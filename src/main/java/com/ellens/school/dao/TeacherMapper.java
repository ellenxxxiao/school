package com.ellens.school.dao;

import com.ellens.school.model.Subject;
import com.ellens.school.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeacherMapper {

//    @Select("SELECT * FROM teacher WHERE teacher_id = #{teacherId}")
//    @Results({
//            @Result(column="teacher_id", property="id"),
//            @Result(column="teacher_name", property="name"),
//    })
    Teacher getTeacherById(int teacherId);
}
