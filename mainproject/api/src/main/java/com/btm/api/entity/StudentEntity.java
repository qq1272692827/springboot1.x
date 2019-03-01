package com.btm.api.entity;


import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wenzhenyu
 * @description 学生实体
 * @date 2018/11/30
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Slf4j
public class StudentEntity {

    //学生ID
    private long studentId;
    //学生姓名
    private String studentName;
    //性别ID 0男1女
    private int gender;

}
