package com.pattern.template;

/**
 * @author pc
 * @since 2017/12/28.
 */
public class Tea extends CaffeineBeverage {

    void brew() {
        System.out.println("Steeping the tea");
    }

    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
