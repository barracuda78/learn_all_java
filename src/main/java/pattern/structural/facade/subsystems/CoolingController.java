package pattern.structural.facade.subsystems;

import lombok.Getter;

@Getter
public class CoolingController {

    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(CoolingController.class);

    private final Radiator radiator;

    private final TemperatureSensor temperatureSensor;

    public CoolingController(Radiator radiator, TemperatureSensor temperatureSensor) {
        this.radiator = radiator;
        this.temperatureSensor = temperatureSensor;
    }

    public void setTemperatureUpperLimit() {
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
        log.info("temperature set");
    }

    public void run() {
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void cool() {
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void stop() {
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public Radiator getRadiator() {
        return this.radiator;
    }

    public TemperatureSensor getTemperatureSensor() {
        return this.temperatureSensor;
    }

}
