package com.chj.controller;

import com.chj.pojo.User;
import com.chj.result.Result;
import com.chj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/aa")
    public String aa(Model model){
        int i = 1/0;
        model.addAttribute("msg","aaaaaaaaaa");
        return "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Result login(HttpSession session, String userAccount, String userPwd){
        System.out.println("userAccount = " + userAccount + ", userPwd = " + userPwd);
        User userOne = userService.getUserOne(userAccount, userPwd);
        if (null != userOne) {
            session.setAttribute("user",userOne);
            return new Result(200,"成功",userOne);
        }else {
            return new Result(202,"失败",null);
        }
    }
}
