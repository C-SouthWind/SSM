package com.chj.service;

import com.chj.mapper.UserMapper;
import com.chj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2021/12/7 20:44
 * @params :
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }


}
