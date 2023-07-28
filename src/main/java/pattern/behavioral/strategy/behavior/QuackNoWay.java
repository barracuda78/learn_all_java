package pattern.behavioral.strategy.behavior;

public class QuackNoWay implements Quack {

    @Override
    public void quack() {
        System.out.println("I can not quack");
    }

}
