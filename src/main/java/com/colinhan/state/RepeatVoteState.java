package com.colinhan.state;

public class RepeatVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票
        System.out.println("重复投票，请不要重复操作");
    }
}
