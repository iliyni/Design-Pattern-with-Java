public class InvisibleState implements State {

    HeroContext heroContext;

    public InvisibleState(HeroContext heroContext){
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

    }
}
