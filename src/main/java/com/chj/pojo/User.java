package com.chj.pojo;


import com.chj.pojo.base.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User extends BasePojo {
    private String userAccount;
    private String userPwd;
    private String userToken;
}
