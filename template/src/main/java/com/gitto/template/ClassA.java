package com.gitto.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassA extends AbstractClass {
    @Override
    public void stepOne() {
        log.info("A step one");
    }

    @Override
    public void stepTwo() {
        log.info("A step two");
    }
}
