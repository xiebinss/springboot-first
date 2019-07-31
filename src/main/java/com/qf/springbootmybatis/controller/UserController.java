package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.User;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author xiebin
 * @Date ${Date}
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("register")
    public String register(@Valid User user){
       int count = userService.register(user);
       return "register";
    }
    @RequestMapping("toadd")
    public String toadd(){
        return "hello";
    }
    @GetMapping("tem/{userid}")
    public String tem(@PathVariable("userid")int userid, ModelMap map){
        User user=userService.tem(userid);
        map.put("user",user);
        return "hello";
    }

}
