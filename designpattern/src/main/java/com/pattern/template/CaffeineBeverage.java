package com.pattern.template;

/**
 * @author pc
 * @since 2017/12/28.
 */
public abstract class CaffeineBeverage {
    /**
     * 模板方法
     */
    final void prepareRecope() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Bolling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
