package pattern.behavioral.strategy.duck;

import pattern.behavioral.strategy.behavior.FlyWithWings;
import pattern.behavioral.strategy.behavior.QuackGuaGua;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.fly = new FlyWithWings();
        this.quack = new QuackGuaGua();
    }

    @Override
    public void display() {
        System.out.println("The appearance is red duck");
    }

}
