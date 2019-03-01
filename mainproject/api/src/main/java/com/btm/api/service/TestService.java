package com.btm.api.service;


import com.btm.api.entity.StudentEntity;

import java.util.List;

public interface TestService {

    public StudentEntity getStudentByID(long studentId);

    public int insertStudent(StudentEntity studentEntity);

    public List<StudentEntity> listStudent();

    public int countStudents();

}
