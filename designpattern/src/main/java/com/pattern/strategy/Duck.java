package com.pattern.strategy;

/**
 * @author pc
 * @since 2017/12/21.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void display() {
        flyBehavior.fly();
        quackBehavior.quack();
    }
}