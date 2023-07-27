package pattern.creational.singleton;

import java.util.Objects;

public class WrongSauron {

    private static WrongSauron sauron;

    private WrongSauron() {

    }

    public static WrongSauron getInstance(){
        if (Objects.isNull(sauron)) {
            sauron = new WrongSauron();
        }
        return sauron;
    }

    public String say() {
        return "I am a wrong Sauron! - " + this.toString();
    }

}
