package com.qianfeng.springboothello.controller;

import com.qianfeng.springboothello.entity.Resource;
import com.qianfeng.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Aix
 * @date 2019/7/29
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("hello")
    public String hello(){
        return "hello,springboot >>>>>>.///////>>>>>>>>>";
    }

    @RequestMapping("adduser")
    public User addUser(User user){
        //user.setEntrydate(new Date());
        return user;
    }

   /* @Value("${imageServer.path}")
    private String imageServer;

    //获取application.properties文件的参数
    @RequestMapping("properties")
    public String getProperties(){
        return imageServer;
    }*/

    @Autowired
    private Resource resource;

    @RequestMapping("properties2")
    public String getProperties2(){
        return resource.getEmailServer()+"----"+resource.getImageServer();
    }

}
