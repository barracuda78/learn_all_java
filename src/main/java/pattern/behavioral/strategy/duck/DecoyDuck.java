package pattern.behavioral.strategy.duck;

import pattern.behavioral.strategy.behavior.FlyNoWay;
import pattern.behavioral.strategy.behavior.QuackNoWay;
import pattern.behavioral.strategy.behavior.QuackZhiZhi;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.fly = new FlyNoWay();
        this.quack = new QuackNoWay();
    }

    @Override
    public void display() {
        System.out.println("The appearance is the bait duck");
    }

}
