package com.qianfneg.springbootmybatis.controller;

import com.qianfneg.springbootmybatis.entity.TStudent;
import com.qianfneg.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Aix
 * @date 2019/7/30
 **/
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("add")
    public String add(@Valid TStudent student, BindingResult bindingResult){
        studentService.add(student);
        return "ok";
    }
}
