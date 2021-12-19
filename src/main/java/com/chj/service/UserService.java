package com.chj.service;

import com.chj.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2021/12/7 20:43
 * @params :
 */

public interface UserService {
    List<User> selectUserList();
}
