package com.colinhan.chainofresponsibility;

/**
 * 总经理处理
 */
public class GeneralManagerHandler extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String result = null;
        if (fee >= 1000) {
            if ("xiaoming".equals(user)) {
                result = "总经理同意 " + user + " 申请的聚餐费用 " + fee;
            } else {
                result = "总经理不同意 " + user + " 申请的聚餐费用 " + fee;
            }
        } else {
            if (nextHandler != null) {
                result = nextHandler.handleFeeRequest(user, fee);
            }
        }
        return result;
    }
}
