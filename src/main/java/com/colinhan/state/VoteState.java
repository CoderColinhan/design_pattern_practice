package com.colinhan.state;

public interface VoteState {
    void vote(String user, String voteItem, VoteManager voteManager);
}
