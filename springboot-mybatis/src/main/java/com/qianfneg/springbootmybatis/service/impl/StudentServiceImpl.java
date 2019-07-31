package com.qianfneg.springbootmybatis.service.impl;

import com.qianfneg.springbootmybatis.entity.TStudent;
import com.qianfneg.springbootmybatis.mapper.TStudentMapper;
import com.qianfneg.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aix
 * @date 2019/7/30
 **/
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private TStudentMapper studentMapper;


    @Override
    public void add(TStudent student) {
        studentMapper.insert(student);
    }
}
