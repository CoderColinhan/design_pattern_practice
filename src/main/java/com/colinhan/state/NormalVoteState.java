package com.colinhan.state;

public class NormalVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票
        System.out.println("正常投票");
        voteManager.getMapVote().put(user, voteItem);

    }
}
