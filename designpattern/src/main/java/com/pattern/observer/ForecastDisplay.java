package com.pattern.observer;

import java.util.Observable;

/**
 * @author pc
 * @since 2017/12/21.
 */
public class ForecastDisplay implements java.util.Observer, DisplayElement {
    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
        }
    }

    public void display() {
        System.out.println("Current pressure: " + currentPressure
                + "F last pressure:  " + lastPressure + "F ");
    }
}
