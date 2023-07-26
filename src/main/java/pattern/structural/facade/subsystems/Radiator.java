package pattern.structural.facade.subsystems;

public class Radiator {

    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Radiator.class);

    public void on() {
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void off() {
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void setSpeed(long speed) {
        log.info(this.getClass().getName() + " is performing " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

}
