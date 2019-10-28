package com.colinhan.state;

/**
 * 状态模式：
 * 允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类
 * <p>
 * 例子：
 * 在线投票功能，
 * 1）要控制同一个用户只能投一次
 * 2）如果一个用户反复投票超过5次，则判定为恶意投票，要取消该用户的投票资格，还要取消他投的票
 * 3）如果一个用户投票次数超过8次，则将进入黑名单，禁止再登陆和使用系统
 */
public class Client {
    public static void main(String[] args) {
        VoteManager manager = new VoteManager();
        for (int i = 0; i < 10; i++) {
            manager.vote("xiaoming", "shopping");
        }
    }
}
