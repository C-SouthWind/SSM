package com.chj.service;

import com.chj.pojo.User;

public interface UserService {
    User getUserOne(String userAccount, String userPwd);
}
