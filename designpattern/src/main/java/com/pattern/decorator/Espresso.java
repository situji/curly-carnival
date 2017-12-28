package com.pattern.decorator;

/**
 * @author pc
 * @since 2017/12/21.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
