package com.pattern.compound;

/**
 * @author pc
 * @since 2018/1/5.
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
