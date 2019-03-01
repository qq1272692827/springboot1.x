package com.btm.api.mapper;

import com.btm.api.entity.StudentEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {

//    @Select("select sid as studentId,sname as studentName,gender from test.student where sid = #{sid}")
//    StudentEntity getStudent(@Param("sid") long studentId);

    StudentEntity getStudent( long studentId);

//    @Insert("insert into test.student(sname,gender) values (#{studentName},#{gender})")
//    int insertStudent(StudentEntity student);

    int insertStudent(StudentEntity student);

    public int countStudent();

}
