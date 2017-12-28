package com.pattern.factory;

import com.pattern.factory.material.cheese.Cheese;
import com.pattern.factory.material.clams.Clams;
import com.pattern.factory.material.dough.Dough;
import com.pattern.factory.material.pepperoni.Pepperoni;
import com.pattern.factory.material.sauce.Sauce;
import com.pattern.factory.material.veggies.Veggies;

/**
 * @author pc
 * @since 2017/12/22.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
