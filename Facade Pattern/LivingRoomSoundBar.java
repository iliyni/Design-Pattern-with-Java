public class LivingRoomSoundBar implements Device{
    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void setMode(String mode) {
        System.out.println("Setting Sound Mode of Living Room Sound Bar to "+mode);
    }

    public void setVolume(int volume) {
        System.out.println("Setting Volume of Living Room Sound Bar to "+ volume);
    }
}
