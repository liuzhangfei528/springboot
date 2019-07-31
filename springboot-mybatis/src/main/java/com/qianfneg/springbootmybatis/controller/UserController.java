package com.qianfneg.springbootmybatis.controller;

import com.qianfneg.springbootmybatis.entity.TUser;
import com.qianfneg.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aix
 * @date 2019/7/29
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("get/{id}")
    public TUser getUserById(@PathVariable("id") long id){
      return  userService.getUserById(id);
    }



}
