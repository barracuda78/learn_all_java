package pattern.behavioral.strategy.duck;

import pattern.behavioral.strategy.behavior.FlyWithWings;
import pattern.behavioral.strategy.behavior.QuackGuaGua;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.fly = new FlyWithWings();
        this.quack = new QuackGuaGua();
    }

    @Override
    public void display() {
        System.out.println("The appearance is green duck");
    }

}
