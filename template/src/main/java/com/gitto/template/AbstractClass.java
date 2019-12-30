package com.gitto.template;


import lombok.extern.slf4j.Slf4j;

/**
 * 模板抽象类
 */
@Slf4j
public abstract class AbstractClass {

    /**
     * 申明final 防止子类修改模板执行流程
     */
    public final void process() {
        this.stepOne();
        this.stepTwo();
        this.stepThree();
    }

    public void stepOne() {
        log.info("default step one");
    }

    public abstract void stepTwo();

    public void stepThree() {
        log.info("default step three");
    }
}
