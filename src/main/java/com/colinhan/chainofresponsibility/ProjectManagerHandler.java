package com.colinhan.chainofresponsibility;

/**
 * 项目经理处理
 */
public class ProjectManagerHandler extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String result = null;
        if (fee < 500) {
            if ("xiaoming".equals(user)) {
                result = "项目经理同意 " + user + " 申请的聚餐费用 " + fee;
            } else {
                result = "项目经理不同意 " + user + " 申请的聚餐费用 " + fee;
            }
        } else {
            if (nextHandler != null) {
                result = nextHandler.handleFeeRequest(user, fee);
            }
        }
        return result;
    }
}
