package com.colinhan.simplefactory;

public class Factory {

    public static Api createApi(int condition) {
        Api api = null;

        if (condition == 1) {
            api = new ApiImpl();
        } else {
            api = new Api2Impl();
        }

        return api;
    }
}
