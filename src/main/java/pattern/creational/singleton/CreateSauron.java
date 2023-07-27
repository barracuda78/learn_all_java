package pattern.creational.singleton;

public class CreateSauron implements Runnable {

    @Override
    public void run() {
        Sauron instance = Sauron.getInstance();
        System.out.println(instance.say());
    }

}
