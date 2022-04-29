public class LivingRoomFan implements Device {
    @Override
    public void on() {
        System.out.println("Turning on Living Room Fan");
    }

    @Override
    public void off() {

    }

    public void setSpeed(int speed){
        System.out.println("Encreasing Speed of LivingRoomFan to " + speed);
    }
}
