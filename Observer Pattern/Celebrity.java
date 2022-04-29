import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject{

    private String celebrityName;
    private List<Observer> followers = new ArrayList<>();

    public Celebrity(String celebrityName) {
        this.celebrityName = celebrityName;
        //this.followers = followers;
    }

    @Override
    public void registerObserver(Observer observer) {
        followers.add(observer);
        System.out.println(observer + " has started following " + celebrityName);

    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
        System.out.println(observer + " has stopped following " + celebrityName);
    }


    @Override
    public void notifyObservers(String tweet) {
        System.out.println("\n" + celebrityName + " has tweeted : " + tweet + "\n");
        for (Observer follower: followers)
            follower.update(tweet, celebrityName);

    }
}
