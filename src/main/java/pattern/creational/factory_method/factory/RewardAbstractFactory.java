package pattern.creational.factory_method.factory;

import pattern.creational.factory_method.reward.Rewardable;

public abstract class RewardAbstractFactory {

    public abstract Rewardable createRewardable();

    public void openReward() {
        Rewardable rewardable = createRewardable();
        rewardable.open();
    }

}
