package com.pattern.observer;

/**
 * @author pc
 * @since 2017/12/21.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
