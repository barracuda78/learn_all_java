package pattern.behavioral.strategy.duck;

import pattern.behavioral.strategy.behavior.FlyNoWay;
import pattern.behavioral.strategy.behavior.FlyWithWings;
import pattern.behavioral.strategy.behavior.QuackGuaGua;
import pattern.behavioral.strategy.behavior.QuackZhiZhi;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.fly = new FlyNoWay();
        this.quack = new QuackZhiZhi();
    }

    @Override
    public void display() {
        System.out.println("The appearance is rubber duck");
    }

}
