package pattern.structural.decorator.decorators;

import pattern.structural.decorator.Pizza;

public class CheeseDecorator extends PizzaDecorator {

    public static final String CHEESE_APPENDER = ", cheese";

    public static final Long CHEESE_COST = 2L;

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + CHEESE_APPENDER;
    }

    public Long getCost() {
        return pizza.getCost() + CHEESE_COST;
    }

    @Override
    public String toString() {
        return getDescription() + ", $: " + getCost();
    }

}
