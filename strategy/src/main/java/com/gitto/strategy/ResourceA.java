package com.gitto.strategy;

import org.springframework.stereotype.Component;

@Component
public class ResourceA implements Strategy {
    @Override
    public String doSomething() {
        return "A";
    }
}
