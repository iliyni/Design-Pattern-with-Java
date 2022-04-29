public class Main {

    public static void main(String[] args) {

        HeroContext heroContext = new HeroContext(10);
        System.out.println(heroContext);

        heroContext.beAttacked(5);
        System.out.println(heroContext);

        heroContext.attack();
        System.out.println(heroContext);

        heroContext.appear();
        heroContext.recovered();
        heroContext.revived();
        heroContext.disappear();

    }
}
