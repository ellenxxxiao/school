package com.ellens.school.dao;

import com.ellens.school.model.Subject;
import com.ellens.school.model.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SubjectMapper {

//    @Select("SELECT sub_id, sub_name, sub_description FROM subject WHERE teacher_id = #{teacherId}")
//    @Results({
//            @Result(column = "sub_id", property = "id"),
//            @Result(column = "sub_name", property = "name"),
//            @Result(column = "sub_description", property = "description"),
//            //下面的property是Subject的attribute，column是pass给one里方法的参数。
//            @Result(column = "teacher_id", one = @One(select="com.ellens.school.dao.TeacherDao.getTeacherById" ), property = "teacher")
//            })
    List<Subject> getSubjectsByTeacherId(int teacherId);

    Subject getSubjectById(int subjectId);

}
