package com.itsherman.afp.IntegredientFactory;

import com.itsherman.afp.meterial.*;

/**
 * 工厂接口，负责创建所有原料
 * @author Sherman
 * created in 2019/3/25
 */

public interface PizzaIntegredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clames createClams();
}
