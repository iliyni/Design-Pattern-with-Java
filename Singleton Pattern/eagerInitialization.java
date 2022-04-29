public class eagerInitialization {
    private int coins=0;

    private static final eagerInitialization instance = new eagerInitialization();
    private eagerInitialization(){}
    public static eagerInitialization getInstance(){
        return instance;
    }


    public void add(){
        coins=coins+10;
        System.out.println("Coin addition with Eager Initialization");
        System.out.println("The coin point: "+coins);
    }
    public void decrease(){
        coins=coins-1;
        System.out.println("Coin reduction with Eager Initialization");
        System.out.println("The coin point: "+coins);
    }
}
