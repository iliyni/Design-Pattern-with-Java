public class lazyInitialization {

    private int coins = 0;
    private static lazyInitialization instance;
    private lazyInitialization(){}

    public static lazyInitialization getInstance(){
        if(instance == null){
            instance = new lazyInitialization();
        }
        return instance;
    }

    public void add(){
        coins=coins+10;
        System.out.println("Coin addition with Lazy Initialization");
        System.out.println("The coint point: "+coins);
    }
    public void decrease(){
        coins=coins-1;
        System.out.println("Coin reduction with Lazy Initialization");
        System.out.println("The coin point: "+coins);
    }
}
