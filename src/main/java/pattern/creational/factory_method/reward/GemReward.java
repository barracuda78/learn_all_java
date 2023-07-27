package pattern.creational.factory_method.reward;

public class GemReward implements Rewardable {
    @Override
    public void open() {
        System.out.println("Gem reward opened");
    }
}
