package com.pattern.template;

/**
 * @author pc
 * @since 2017/12/28.
 */
public class Coffee extends CaffeineBeverage {


    void brew() {
        System.out.println("Dripping Coffee through");
    }

    void addCondiments() {
        System.out.println("Adding Sugar");
    }
}
