package com.pattern.factory;

import com.pattern.factory.material.cheese.Cheese;
import com.pattern.factory.material.cheese.ReggianoCheese;
import com.pattern.factory.material.clams.Clams;
import com.pattern.factory.material.clams.FreshClams;
import com.pattern.factory.material.dough.Dough;
import com.pattern.factory.material.dough.ThinCrustDough;
import com.pattern.factory.material.pepperoni.Pepperoni;
import com.pattern.factory.material.pepperoni.SlicedPepperoni;
import com.pattern.factory.material.sauce.MarinaraSauce;
import com.pattern.factory.material.sauce.Sauce;
import com.pattern.factory.material.veggies.*;

/**
 * @author pc
 * @since 2017/12/22.
 */
public class NYCheesePizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
