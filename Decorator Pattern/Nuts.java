public class Nuts extends Toppings{

    protected Nut nut;
    private final Waffle waffle;

    public Nuts(Waffle waffle, Nut nut){
        this.waffle= waffle;
        this.nut = nut;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", (" + nut + ")Nuts ";
    }

    @Override
    public double getCost() {
        return waffle.getCost() + 1.0;
    }
}
