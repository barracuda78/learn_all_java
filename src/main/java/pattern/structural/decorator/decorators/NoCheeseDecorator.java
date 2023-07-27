package pattern.structural.decorator.decorators;

import pattern.structural.decorator.Pizza;

public class NoCheeseDecorator extends PizzaDecorator {

    public NoCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription().replace(", cheese", "");
    }

    public Long getCost() {
        return pizza.getCost() - 2L;
    }

    @Override
    public String toString() {
        return getDescription() + ", $: " + getCost();
    }

}
