package pattern.creational.singleton;

public class CreateWrongSauron implements Runnable {

    @Override
    public void run() {
        WrongSauron instance = WrongSauron.getInstance();
        System.out.println(instance.say());
    }

}
