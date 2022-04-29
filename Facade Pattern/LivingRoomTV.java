public class LivingRoomTV implements Device {
    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void setSource(String source) {
        System.out.println("Setting Source of Living Room TV to " + source);
    }
}
