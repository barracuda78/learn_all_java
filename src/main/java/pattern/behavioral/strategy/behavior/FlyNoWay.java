package pattern.behavioral.strategy.behavior;

public class FlyNoWay implements Fly {

    @Override
    public void fly() {
        System.out.println("fly no way");
    }

}
