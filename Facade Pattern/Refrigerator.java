public class Refrigerator implements Device {
    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void setCooling(String mode){
        System.out.println("Setting refrigerator to " + mode);
    }
}
