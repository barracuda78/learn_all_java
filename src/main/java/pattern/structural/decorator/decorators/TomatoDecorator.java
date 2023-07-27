package pattern.structural.decorator.decorators;

import pattern.structural.decorator.Pizza;

public class TomatoDecorator extends PizzaDecorator {

    public static final String TOMATO = ", tomato";

    public static final Long TOMATO_COST = 3L;

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + TOMATO;
    }

    @Override
    public Long getCost() {
        return pizza.getCost() + TOMATO_COST;
    }

    @Override
    public String toString() {
        return getDescription() + ", $: " + getCost();
    }

}
