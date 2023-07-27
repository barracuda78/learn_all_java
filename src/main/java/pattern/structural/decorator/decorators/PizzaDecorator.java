package pattern.structural.decorator.decorators;

import pattern.structural.decorator.Pizza;

public abstract class PizzaDecorator implements Pizza {

    protected final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

}
