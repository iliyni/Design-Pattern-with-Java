public class Follower implements Observer{

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String tweet, String celebrityName) {
        System.out.println(followerName + " has received "+ celebrityName + "'s tweet : "+  tweet);
    }

    @Override
    public String toString(){ //without these i can not see followers name onscreen.
        return followerName;
    }
}
