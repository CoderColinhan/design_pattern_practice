package com.colinhan.chainofresponsibility;

/**
 * 定义职责对象的接口
 */
public abstract class Handler {
    /**
     * 持有下一个处理请求的对象
     */
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract String handleFeeRequest(String user, double fee);
}
