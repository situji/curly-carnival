package com.pattern.signleton;

/**
 * @author pc
 * @since 2017/12/26.
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton uniqueInstance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
