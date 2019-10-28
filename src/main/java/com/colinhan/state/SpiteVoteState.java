package com.colinhan.state;

public class SpiteVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //恶意投票
        System.out.println("恶意投票, 删除已有投票");

        String s = (String) voteManager.getMapVote().get(user);
        if (s != null) {
            voteManager.getMapVote().remove(user);
        }

    }
}
