package com.pattern.compound;


/**
 * @author pc
 * @since 2018/1/9.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
