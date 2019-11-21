package com.gitto.strategy;

public interface Strategy {

    default String doSomething() {
        return "default";
    }
}
