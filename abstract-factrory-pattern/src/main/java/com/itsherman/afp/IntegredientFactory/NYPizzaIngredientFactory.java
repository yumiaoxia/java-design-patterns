package com.itsherman.afp.IntegredientFactory;

import com.itsherman.afp.meterial.*;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class NYPizzaIngredientFactory implements PizzaIntegredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clames createClams() {
        return new FreshClames();
    }
}
