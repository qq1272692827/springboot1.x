package com.btm.api.service.impl;

import com.btm.api.entity.StudentEntity;
import com.btm.api.mapper.StudentMapper;
import com.btm.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wenzhenyu
 * @description 业务处理实现
 * @date 2018/11/30
 */
@Service
public class TestServiceImpl  implements TestService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentEntity getStudentByID(long studentId) {
        return studentMapper.getStudent(studentId);
//        int count = studentMapper.countStudent();
//        StudentEntity studentEntity = new StudentEntity();
//        studentEntity.setGender(count);
//        studentEntity.setStudentName("测试人的姓名");
//        return studentEntity;
    }

    @Override
    public int insertStudent(StudentEntity studentEntity) {
        return studentMapper.insertStudent(studentEntity);
//        return 0;
    }

    @Override
    public List<StudentEntity> listStudent() {
        return null;
    }

    @Override
    public int countStudents(){
        return studentMapper.countStudent();
    }


}
