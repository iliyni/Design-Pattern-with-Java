public class DeadState implements State {

    HeroContext heroContext;

    public DeadState(HeroContext heroContext){
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {

    }

    @Override
    public void beAttacked(int hp) {

    }

    @Override
    public void silenced() {

    }

    @Override
    public void disappear() {

    }

    @Override
    public void revived() {

    }

    @Override
    public void recovered() {

    }

    @Override
    public void appear() {
        System.out.println("\n...Hero is already visible, and cannot appear");
    }
}
