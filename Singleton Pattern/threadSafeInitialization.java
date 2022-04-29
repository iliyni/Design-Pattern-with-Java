public class threadSafeInitialization {

    private int coins = 0;
    private static threadSafeInitialization instance;
    private threadSafeInitialization(){}

    public static synchronized threadSafeInitialization getInstance(){
        if(instance == null){
            instance = new threadSafeInitialization();
        }
        return instance;
    }
    public void add(){
        coins = coins+10;
        System.out.println("Coin addition with Thread Safe Initialization");
        System.out.println("The coin point: "+coins);
    }
    public void decrease(){
        coins = coins-1;
        System.out.println("Coin reduction with Thread Safe Initialization");
        System.out.println("The coin point: "+coins);
    }
}
