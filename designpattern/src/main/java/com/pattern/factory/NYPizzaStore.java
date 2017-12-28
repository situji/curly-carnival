package com.pattern.factory;

/**
 * @author pc
 * @since 2017/12/26.
 */
public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYCheesePizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        }
        return pizza;
    }
}
