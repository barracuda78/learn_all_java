package pattern.creational.factory_method.reward;

public class GoldReward implements Rewardable {

    @Override
    public void open() {
        System.out.println("Gold reward opened");
    }

}
