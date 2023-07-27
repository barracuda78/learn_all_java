package pattern.creational.singleton;

import java.util.Objects;

public class Sauron {

    private static volatile Sauron sauron;

    private Sauron() {

    }

    public static Sauron getInstance(){
        if (Objects.isNull(sauron)) {
            synchronized(Sauron.class) {
                if(Objects.isNull(sauron)) {
                    sauron = new Sauron();
                }
            }
        }
        return sauron;
    }

    public String say() {
        return "I am Sauron! - " + this.toString();
    }

}
