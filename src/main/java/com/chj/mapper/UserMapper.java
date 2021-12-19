package com.chj.mapper;

import com.chj.pojo.User;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2021/12/7 20:31
 * @params :
 */
public interface UserMapper {

    //查询用户
    List<User> selectUserList();
}
