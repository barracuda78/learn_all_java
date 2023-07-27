package pattern.creational.abstract_factory.fabric;

import pattern.creational.abstract_factory.body_factor.Coupe;
import pattern.creational.abstract_factory.car.FordCoupe;
import pattern.creational.abstract_factory.car.FordSedan;
import pattern.creational.abstract_factory.body_factor.Sedan;

public class FordFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}
