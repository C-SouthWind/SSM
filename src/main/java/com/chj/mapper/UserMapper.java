package com.chj.mapper;

import com.chj.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User getUserOne(@Param("userAccount") String userAccount,@Param("userPwd") String userPwd);
}
