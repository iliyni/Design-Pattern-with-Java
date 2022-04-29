public class Main {

    public static void main(String[] args) {

	    Waffle waffle = new NormalWaffle();
        System.out.println(waffle.getDescription() + "= $" + waffle.getCost() +"\n");

        Waffle waffle2 = new BelgianWaffle();
        waffle2 = new Fruits(waffle2, Fruit.KIWI);
        System.out.println(waffle2.getDescription() + "= $" + waffle2.getCost());
        waffle2 = new Fruits(waffle2, Fruit.BANANA);
        System.out.println(waffle2.getDescription() + "= $" + waffle2.getCost());
        waffle2 = new Chocolate(waffle2, Chocolates.CARAMEL);
        System.out.println(waffle2.getDescription() + "= $" + waffle2.getCost());
        waffle2 = new Sauces(waffle2, Sauce.RASPBERRY);
        System.out.println(waffle2.getDescription() + "= $" + waffle2.getCost());
        waffle2 = new Nuts(waffle2, Nut.HAZELNUT);
        System.out.println(waffle2.getDescription() + "= $" + waffle2.getCost() +"\n");

        Waffle waffle3 = new FreeGlutenWaffle();
        waffle3 = new Fruits(waffle3, Fruit.STRAWBERRY);
        waffle3 = new Chocolate(waffle3, Chocolates.NUTELLA);
        waffle3 = new Sauces(waffle3, Sauce.CHOCOLATE);
        System.out.println(waffle3.getDescription() + "= $" + waffle3.getCost() +"\n");

    }

}
