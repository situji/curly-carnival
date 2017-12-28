package com.pattern.decorator;

/**
 * @author pc
 * @since 2017/12/21.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
