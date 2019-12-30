package com.gitto.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassB extends AbstractClass {
    @Override
    public void stepTwo() {
        log.info("B step two");
    }

    @Override
    public void stepThree() {
        log.info("B step three");
    }
}
