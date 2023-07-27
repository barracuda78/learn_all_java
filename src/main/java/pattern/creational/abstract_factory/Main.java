package pattern.creational.abstract_factory;

import pattern.creational.abstract_factory.body_factor.Sedan;
import pattern.creational.abstract_factory.fabric.CarFactory;
import pattern.creational.abstract_factory.fabric.FordFactory;
import pattern.creational.abstract_factory.fabric.ToyotaFactory;

public class Main {

    public static void main(String[] args) {
        CarFactory factory = new ToyotaFactory();
        Sedan sedan = factory.createSedan();
        factory = new FordFactory();
        factory.createCoupe();
    }

}
