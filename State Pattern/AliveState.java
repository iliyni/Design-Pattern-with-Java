public class AliveState implements State {

    HeroContext heroContext;

    public AliveState(HeroContext heroContext){
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {
        System.out.println("\n...Hero is attacking others\n");
    }

    @Override
    public void beAttacked(int hp) {
        System.out.println("\n...Hero is being attacked with damage: " + hp + "\n");
        heroContext.hp = heroContext.hp - hp;
    }

    @Override
    public void silenced() {
        heroContext.setState(heroContext.silencedState);
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

    @Override
    public String toString() {
        return "alive";
    }
}
