package com.chj.serviceImpl;

import com.chj.mapper.UserMapper;
import com.chj.pojo.User;
import com.chj.result.Result;
import com.chj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserOne(String userAccount, String userPwd) {
        User userOne = userMapper.getUserOne(userAccount, userPwd);
        if (userOne != null) {
            return userOne;
        }else {
            return null;
        }
    }
}
