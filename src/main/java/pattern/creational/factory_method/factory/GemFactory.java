package pattern.creational.factory_method.factory;

import pattern.creational.factory_method.reward.Rewardable;
import pattern.creational.factory_method.reward.GemReward;

public class GemFactory extends RewardAbstractFactory {

    @Override
    public Rewardable createRewardable() {
        return new GemReward();
    }

}
