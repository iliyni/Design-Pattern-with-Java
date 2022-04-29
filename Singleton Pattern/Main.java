public class Main {

    public static void main(String[] args) {
        eagerInitialization coin = eagerInitialization.getInstance();
        coin.add();
        coin.decrease();

        lazyInitialization coin2 = lazyInitialization.getInstance();
        coin2.add();
        coin2.decrease();

        threadSafeInitialization coin3 = threadSafeInitialization.getInstance();
        coin3.add();
        coin3.add();
        coin3.decrease();


    }
}
