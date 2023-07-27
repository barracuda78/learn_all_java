package pattern.structural.decorator;

public class PepperoniPizza implements Pizza {
    public static final String PEPPERONI = "sausages";

    public static final Long PEPPERONI_COST = 10L;

    @Override
    public String getDescription() {
        return PEPPERONI;
    }

    @Override
    public Long getCost() {
        return PEPPERONI_COST;
    }

    @Override
    public String toString() {
        return getDescription() + ", $: " + getCost();
    }

}
