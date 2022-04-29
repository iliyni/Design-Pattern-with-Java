public class WeekendHouseParty {
    CoffeeMaker coffeeMaker;
    ElectricGrill electricGrill;
    KitchenLight kitchenLight;
    LivingRoomFan livingRoomFan;
    LivingRoomFireTV4KStick livingRoomFireTV4KStick;
    LivingRoomLight livingRoomLight;
    LivingRoomSoundBar livingRoomSoundBar;
    LivingRoomTV livingRoomTV;
    Microwave microwave;
    Refrigerator refrigerator;

    public WeekendHouseParty(CoffeeMaker coffeeMaker, ElectricGrill electricGrill, KitchenLight kitchenLight, LivingRoomFan livingRoomFan, LivingRoomFireTV4KStick livingRoomFireTV4KStick, LivingRoomLight livingRoomLight, LivingRoomSoundBar livingRoomSoundBar, LivingRoomTV livingRoomTV, Microwave microwave, Refrigerator refrigerator) {
        this.coffeeMaker = coffeeMaker;
        this.electricGrill = electricGrill;
        this.kitchenLight = kitchenLight;
        this.livingRoomFan = livingRoomFan;
        this.livingRoomFireTV4KStick = livingRoomFireTV4KStick;
        this.livingRoomLight = livingRoomLight;
        this.livingRoomSoundBar = livingRoomSoundBar;
        this.livingRoomTV = livingRoomTV;
        this.microwave = microwave;
        this.refrigerator = refrigerator;
    }

    public void watchMovie(String movie){
        System.out.println("Setting up movie...");
        livingRoomFan.on();
        livingRoomFan.setSpeed(2);
        livingRoomLight.on();
        livingRoomTV.on();
        livingRoomTV.setSource("HDMI ARC");
        livingRoomFireTV4KStick.on();
        livingRoomSoundBar.on();
        livingRoomSoundBar.setMode("Dolby Atoms");
        livingRoomFireTV4KStick.openNetflix();
        livingRoomFireTV4KStick.searchNetflix(movie);
        livingRoomLight.dim();
        livingRoomSoundBar.setVolume(20);
        livingRoomFireTV4KStick.play(movie);
    }

    public void prepareFood(){
        System.out.println("Preparing food...");
        kitchenLight.on();
        refrigerator.setCooling("Party");
        microwave.on();
        microwave.setMicrowave("Preheat", "200", 5);
        electricGrill.on();
        coffeeMaker.on();
    }

    public void stopMovie(){
        System.out.println("Stopping Movie...");
        livingRoomFireTV4KStick.closeNetflix();

    }


}
