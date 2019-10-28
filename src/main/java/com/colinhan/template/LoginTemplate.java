package com.colinhan.template;

import com.colinhan.template.data.LoginModel;

public abstract class LoginTemplate {

    /**
     * 根据名字查出用户
     *
     * @param name
     * @return
     */
    public abstract LoginModel findLoginUser(String name);

    public final boolean login(LoginModel data) {
        LoginModel dbUser = findLoginUser(data.getName());
        if (dbUser != null) {
            String encryptPwd = encryptPwd(data.getPassword());
            data.setPassword(encryptPwd);
            return dbUser.getPassword().equals(data.getPassword());
        }
        return false;
    }

    /**
     * 对密码进行加密
     *
     * @param password
     * @return
     */
    public String encryptPwd(String password) {
        return password;
    }
}
