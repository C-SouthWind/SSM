package com.chj.controller;

import com.chj.pojo.User;
import com.chj.service.UserService;
import com.chj.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：chj
 * @date ：Created in 2021/12/8 20:37
 * @params :
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/l1")
    private String list(Model model){
        model.addAttribute("list",userService.selectUserList());
        return "user";
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
