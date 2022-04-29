public class Chocolate extends Toppings {

    protected Chocolates chocolates;
    private final Waffle waffle;

    public Chocolate(Waffle waffle, Chocolates chocolates){
        this.waffle= waffle;
        this.chocolates = chocolates;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", (" + chocolates + ")Chocolate ";
    }

    @Override
    public double getCost() {
        return waffle.getCost() + 2.0;
    }
}
