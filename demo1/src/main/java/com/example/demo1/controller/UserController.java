package com.example.demo1.controller;

import com.example.demo1.bean.UserInfo;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
   private  UserService userService;


    //查找
    @RequestMapping("listInfo")
    public List<UserInfo> listInfo(){
        userService.getUserInfoListAll();

        return userService.getUserInfoListAll();
    }
//添加
    @GetMapping("addUser")
    void addUser( UserInfo userInfo){
        userInfo.setName("卢本伟");
        userInfo.setLoginName("yyy");
       userService.addUser(userInfo);
    }
//xiugai
    @RequestMapping("updateUser")
    void updateUser(UserInfo userInfo){
        userInfo.setName("PDD");
        userInfo.setId("4");
        userService.updateUser(userInfo);
    }
@RequestMapping("updateUserByName")
    void updateUserByName(String name,UserInfo userInfo){
         name = "PDD";
    userInfo.setName("余小C");
    userService.updateUserByName(name,userInfo);
}
//shanchu
    @RequestMapping("delUser")
    void delUser(UserInfo userInfo){
        userInfo.setName("卢本伟");
        userService.delUser(userInfo);
    }
}
