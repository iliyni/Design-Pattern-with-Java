public class LivingRoomFireTV4KStick implements Device {
    public static void openNetflix() {
        System.out.println("Opening Netflix on LivingRoomFireTV4KStick");
    }
    public static void searchNetflix(String movie) {
        System.out.println("Searching "+ movie + " on Netflix");
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void play(String movie) {
        System.out.println("Playing "+ movie + " on Netflix");
    }

    public void closeNetflix() {
        System.out.println("Closing Netflix on LivingRoomFireTV4KStick");
    }
}
