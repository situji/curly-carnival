package com.pattern.signleton;

/**
 * @author pc
 * @since 2017/12/26.
 */
public class StaticSingleton {
    private static StaticSingleton uniqueInstance = new StaticSingleton();

    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return uniqueInstance;
    }
}
