package com.colinhan.template;

import com.colinhan.template.data.LoginModel;

public class NormalLogin extends LoginTemplate {
    @Override
    public LoginModel findLoginUser(String name) {
        LoginModel data = new LoginModel();
        data.setName(name);
        data.setPassword("NormalLoginPwd");
        return data;
    }
}
