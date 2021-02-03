package com.afm8.ssm.controller;

import com.afm8.ssm.entity.TUser;
import com.afm8.ssm.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findById")
    @ResponseBody
    public TUser findUser(Long id){
        TUser tUser = userService.selectById(id);
        String string= JSON.toJSONString(tUser);
        return tUser;
    }


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(@RequestBody TUser user){
        int i = userService.addUser(user);
        return i+"";
    }

    @RequestMapping("/queryList")
    @ResponseBody
    public List<TUser> queryList(){
        List<TUser> tUsers = userService.queryList(new TUser());
        return tUsers;
    }
}
