public class HeroContext {

    State aliveState;
    State deadState;
    State invisibleState;
    State silencedState;

    State state;
    int hp=0;

    public HeroContext(int HeroHP){
        aliveState = new AliveState(this);
        deadState = new DeadState(this);
        invisibleState = new InvisibleState(this);
        silencedState = new SilencedState(this);

        this.hp = HeroHP;
        if(HeroHP > 0){
            state = aliveState;
        }else{
            state = deadState;
        }

    }

    public void attack(){
        state.attack();
    }
    public void beAttacked(int hp){
        state.beAttacked(hp);
    }
    public void appear(){
        if(state == invisibleState){
            state.appear();
        }else{
            System.out.println("\n...Hero is already visible, and cannot appear");
        }

    }
    public void revived(){
        if(state==aliveState){
            System.out.println("\n...Hero is already alive, and cannot be revived");
        }else{
            state.revived();
            state=aliveState;
        }

    }
    public void recovered(){
        state.recovered();
    }
    public void disappear() {
        state.disappear();
    }

    void setState(State state){
        this.state = state;
    }

    @Override
    public String toString() {
        return "HeroContext \n" + "========== \n" + "Hero HP " + hp +"\n"+"Hero is "+state ;
    }


}
