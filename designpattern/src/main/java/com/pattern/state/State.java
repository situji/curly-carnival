package com.pattern.state;

/**
 * @author pc
 * @since 2017/12/29.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
