package pattern.structural.facade.subsystems;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor {

    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TemperatureSensor.class);

    public long getTemperature() {
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
        return ThreadLocalRandom.current().nextLong(100);
    }

}
