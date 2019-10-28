package com.colinhan.state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
    /**
     * 持有状态对象
     */
    private VoteState state;

    /**
     * 用户名称和对应的投票选项
     */
    private Map<String, String> mapVote = new HashMap<String, String>();

    /**
     * 用户投票的次数
     */
    private Map<String, Integer> mapCount = new HashMap<String, Integer>();

    public Map getMapVote() {
        return mapVote;
    }

    /**
     * 用户选择投票的选项
     * 自动记录选择的次数
     *
     * @param user
     * @param voteItem
     */
    public void vote(String user, String voteItem) {
        Integer count = mapCount.get(user);
        if (count == null) {
            count = 0;
        }
        count++;
        mapCount.put(user, count);

        if (count == 1) {
            state = new NormalVoteState();
        } else if (count > 1 && count < 5) {
            state = new RepeatVoteState();
        } else if (count >= 5 && count < 8) {
            state = new SpiteVoteState();
        } else if (count >= 8) {
            state = new BlackVoteState();
        }
        state.vote(user, voteItem, this);
    }

}
