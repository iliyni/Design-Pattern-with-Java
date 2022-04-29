public class Microwave implements Device {
    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void setMicrowave(String heat, String temp, int time){
        System.out.println("Setting microwave on " + heat + ", temperature " + temp + ", time" + time + " minutes");

    }
}
