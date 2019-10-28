package com.colinhan.mediator;

/**
 * 所有同事的父类
 */
public abstract class Collegue {
    private Mediator mediator;

    public Collegue(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
