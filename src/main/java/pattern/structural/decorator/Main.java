package pattern.structural.decorator;

import pattern.structural.decorator.decorators.CheeseDecorator;
import pattern.structural.decorator.decorators.NoCheeseDecorator;
import pattern.structural.decorator.decorators.TomatoDecorator;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new CheeseDecorator(new PepperoniPizza());
        System.out.println("cheese decorator: " + pizza);

        pizza = new NoCheeseDecorator(pizza);
        System.out.println("no cheese decorator: " + pizza);

        pizza = new TomatoDecorator(pizza);
        System.out.println("tomato decorator: " + pizza);

        pizza = new CheeseDecorator(pizza);
        System.out.println("cheese and tomato decorator: " + pizza);
    }

}
