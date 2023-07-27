package pattern.creational.abstract_factory.fabric;

import pattern.creational.abstract_factory.body_factor.Coupe;
import pattern.creational.abstract_factory.body_factor.Sedan;

public interface CarFactory {

    Sedan createSedan();

    Coupe createCoupe();

}
