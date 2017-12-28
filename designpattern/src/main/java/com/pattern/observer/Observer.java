package com.pattern.observer;

/**
 * @author pc
 * @since 2017/12/21.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
