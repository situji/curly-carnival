package com.pattern.decorator;

/**
 * @author pc
 * @since 2017/12/21.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
