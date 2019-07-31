package com.qianfneg.springbootmybatis.controller;

import com.qianfneg.springbootmybatis.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aix
 * @date 2019/7/30
 **/
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("test")
    public String testThymeleaf(Model model){
       //单一属性
        String film="狂徒";
        model.addAttribute("film",film);

        //对象
        TUser user=new TUser(2L,"ZS","123");
        model.addAttribute("user",user);

        //集合
        List<TUser> users=new ArrayList<>();
        users.add(user);
        users.add(new TUser(3L,"LS","456"));
        model.addAttribute("users",users);

        //判断
        int money=101;
        model.addAttribute("money",money);

        //制造异常，测试全局异常处理
        int i=1/0;
        return "hello";
    }

}
