package com.colinhan.template;

import com.colinhan.template.data.LoginModel;

/**
 * 模板方法模式：
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以不改变一个算法的结构，即可重定义该算法的某些特定步骤
 * <p>
 * 例子：
 * 管理员登陆和普通用户登陆过程
 */
public class Client {
    public static void main(String[] args) {
        LoginModel input = new LoginModel();
        input.setName("ABC");
        input.setPassword("NormalLoginPwd");

        LoginTemplate template = new WorkerLogin();
        boolean isOk = template.login(input);
        System.out.println("登陆结果 " + isOk);

        LoginTemplate template2 = new NormalLogin();
        boolean isOk2 = template2.login(input);
        System.out.println("登陆结果 " + isOk2);

    }
}
