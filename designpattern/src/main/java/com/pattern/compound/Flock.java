package com.pattern.compound;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author pc
 * @since 2018/1/5.
 */
public class Flock implements Quackable {
    ArrayList ducks = new ArrayList();

    public void add(Quackable quacker) {
        ducks.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
