package pattern.structural.facade;

import pattern.structural.facade.subsystems.CoolingController;
import pattern.structural.facade.subsystems.TemperatureSensor;

public class CarEngineFacade {

    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(CarEngineFacade.class);

    private final CoolingController coolingController;

    public CarEngineFacade(CoolingController coolingController) {
        this.coolingController = coolingController;
    }

    public void startEngine(long speed) {
        coolingController.run();
        coolingController.cool();
        coolingController.setTemperatureUpperLimit();
        coolingController.getRadiator().on();
        coolingController.getRadiator().setSpeed(speed);
        final long temperature = coolingController.getTemperatureSensor().getTemperature();
        log.info("temperature = " + temperature);

        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void stopEngine() {
        coolingController.stop();
        coolingController.getRadiator().off();
        long temperature = coolingController.getTemperatureSensor().getTemperature();
        log.info("temperature = " + temperature);
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

}
