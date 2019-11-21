package com.gitto.strategy;

import org.springframework.stereotype.Component;

@Component
public class ResourceB implements Strategy {
    @Override
    public String doSomething() {
        return "B";
    }
}
