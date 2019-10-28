package com.colinhan.state;

public class BlackVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //进入黑名单中，被禁止登陆
        System.out.println("进入黑名单中，被禁止登陆");
    }
}
