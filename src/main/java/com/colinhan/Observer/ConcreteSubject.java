package com.colinhan.Observer;

public class ConcreteSubject extends Subject {
    private String state = "ON";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        boolean isChanged = false;
        if (!this.state.equals(state)) {
            isChanged = true;
        }
        this.state = state;
        if (isChanged) {
            notifyObservers();
        }
    }
}
