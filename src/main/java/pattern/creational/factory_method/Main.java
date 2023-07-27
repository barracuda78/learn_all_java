package pattern.creational.factory_method;

import pattern.creational.factory_method.factory.GemFactory;
import pattern.creational.factory_method.factory.GoldFactory;
import pattern.creational.factory_method.factory.RewardAbstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<RewardAbstractFactory> list = new ArrayList<>();
        list.add(new GoldFactory());
        list.add(new GemFactory());

        IntStream.rangeClosed(1, 10).forEach(
                n -> {
                    int index = Math.abs(random.nextInt() % 2) == 0 ? 0 : 1;
                    RewardAbstractFactory factory = list.get(index);
                    factory.openReward();
                }
        );
    }

}
