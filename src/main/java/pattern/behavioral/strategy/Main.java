package pattern.behavioral.strategy;

import pattern.behavioral.strategy.duck.DecoyDuck;
import pattern.behavioral.strategy.duck.MallardDuck;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.getFly().fly();
        mallardDuck.getQuack().quack();

        System.out.println("-------------------");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.getFly().fly();
        decoyDuck.getQuack().quack();
    }

}
