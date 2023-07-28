package pattern.behavioral.strategy.duck;

import pattern.behavioral.strategy.behavior.Fly;
import pattern.behavioral.strategy.behavior.Quack;

public abstract  class Duck {

    protected Fly fly;

    protected Quack quack;

    public abstract void display();

    public void swim() {
        System.out.println("I'm swimming...");
    }

    public Fly getFly() {
        return this.fly;
    }

    public Quack getQuack() {
        return this.quack;
    }

}
