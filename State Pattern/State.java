public interface State {

    public void attack();
    public void beAttacked(int hp);
    public void silenced();
    public void disappear();
    public void revived();
    public void recovered();
    public void appear();
}
