package com.pattern.compound;

/**
 * @author pc
 * @since 2018/1/5.
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallarDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
