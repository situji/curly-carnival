package com.pattern.adapter;

/**
 * @author pc
 * @since 2017/12/28.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
