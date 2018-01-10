package com.pattern.compound;

/**
 * @author pc
 * @since 2018/1/10.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
