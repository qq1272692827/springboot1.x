package com.btm.api.controller;

import com.btm.api.entity.StudentEntity;
import com.btm.api.remoteapi.TestRemoteService;
import com.btm.api.service.TestService;
import com.btm.api.vo.MessageVo;
import com.btm.tool.util.DateUtils;
import com.btm.tool.util.RequestUtils;
import org.bouncycastle.crypto.tls.TlsECDSASigner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;

/**
 * @author wenzhenyu
 * @description 测试类
 * @date 2018/11/28
 */
@RestController
@RequestMapping("/test/")
public class TestController extends  BaseController{

    @Autowired
    private TestRemoteService remoteService;

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public MessageVo test(){
        String dateStr = DateUtils.getWeekStrByDate(new Date());
        return new MessageVo(0,"success",dateStr);
    }

    @RequestMapping("remoteTest")
    public MessageVo remote(){
        String dateStr = DateUtils.getWeekStrByDate(new Date());
        String text = remoteService.test();
        System.out.println("返回的值--"+text);
        return new MessageVo(0,"success",dateStr+"---"+text);
    }

    @RequestMapping("testDao")
    public MessageVo testDao(){
        String studentId = RequestUtils.getQueryParam(request, "studentId");
        StudentEntity studentEntity = testService.getStudentByID(Long.parseLong(studentId));

        return new MessageVo(0,"success",studentEntity);
    }
    @RequestMapping("insert")
    public MessageVo inserTest(){
        String studentName = RequestUtils.getQueryParam(request, "studentName");
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentName(studentName);
        int studentId = testService.insertStudent(studentEntity);
        return new MessageVo(0,"success",studentId);
    }

    @RequestMapping("count")
    public MessageVo countStudent(){
        int count = testService.countStudents();
        return new MessageVo(0,"success",count);
    }

}
