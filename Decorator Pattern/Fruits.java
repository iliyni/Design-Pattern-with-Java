public class Fruits extends Toppings {

    protected Fruit fruit;
    private final Waffle waffle;

    public Fruits(Waffle waffle, Fruit fruit){
        this.waffle= waffle;
        this.fruit = fruit;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", (" + fruit + ")Fruits ";
    }

    @Override
    public double getCost() {
        return waffle.getCost() + 0.5;
    }
}
