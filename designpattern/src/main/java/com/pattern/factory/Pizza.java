package com.pattern.factory;

import com.pattern.factory.material.cheese.Cheese;
import com.pattern.factory.material.clams.Clams;
import com.pattern.factory.material.dough.Dough;
import com.pattern.factory.material.pepperoni.Pepperoni;
import com.pattern.factory.material.sauce.Sauce;
import com.pattern.factory.material.veggies.Veggies;

import java.util.Arrays;

/**
 * @author pc
 * @since 2017/12/22.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
