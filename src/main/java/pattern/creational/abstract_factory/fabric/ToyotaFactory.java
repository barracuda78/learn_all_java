package pattern.creational.abstract_factory.fabric;

import pattern.creational.abstract_factory.body_factor.Coupe;
import pattern.creational.abstract_factory.body_factor.Sedan;
import pattern.creational.abstract_factory.car.ToyotaCoupe;
import pattern.creational.abstract_factory.car.ToyotaSedan;

public class ToyotaFactory implements CarFactory {

    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }

}
