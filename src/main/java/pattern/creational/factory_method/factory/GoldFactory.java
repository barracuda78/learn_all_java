package pattern.creational.factory_method.factory;

import pattern.creational.factory_method.reward.Rewardable;
import pattern.creational.factory_method.reward.GoldReward;

public class GoldFactory extends RewardAbstractFactory {

    @Override
    public Rewardable createRewardable() {
        return new GoldReward();
    }

}
