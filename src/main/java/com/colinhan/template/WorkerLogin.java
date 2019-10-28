package com.colinhan.template;

import com.colinhan.template.data.LoginModel;

public class WorkerLogin extends LoginTemplate {
    @Override
    public LoginModel findLoginUser(String name) {
        LoginModel data = new LoginModel();
        data.setName(name);
        data.setPassword("workerPwd");
        return data;
    }

    @Override
    public String encryptPwd(String password) {
        System.out.println("对密码进行加密处理");
        return password;
    }
}
