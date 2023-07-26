package pattern.structural.facade;

import org.apache.log4j.BasicConfigurator;
import pattern.structural.facade.subsystems.CoolingController;
import pattern.structural.facade.subsystems.Radiator;
import pattern.structural.facade.subsystems.TemperatureSensor;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BasicConfigurator.configure();
        CarEngineFacade facade = new CarEngineFacade(new CoolingController(new Radiator(), new TemperatureSensor()));
        facade.startEngine(100);
        Thread.sleep(5000);
        facade.startEngine(200);
    }

}
