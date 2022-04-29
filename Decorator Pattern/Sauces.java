public class Sauces extends Toppings {

    protected Sauce sauce;
    private final Waffle waffle;

    public Sauces(Waffle waffle, Sauce sauce){
        this.waffle= waffle;
        this.sauce = sauce;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", (" + sauce + ")Sauces ";
    }

    @Override
    public double getCost() {
        return waffle.getCost() + 1.0;
    }
}
