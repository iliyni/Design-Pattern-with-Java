public class Main {

    public static void main(String[] args) {

        Celebrity karsu = new Celebrity("Karsu Dönmez");
        Celebrity ferit = new Celebrity("Ferit Odman");

        Follower deniz = new Follower("Deniz");
        Follower jeff = new Follower("Jeff");
        Follower robert = new Follower("Robert");
        Follower sandra =  new Follower("Sandra");
        Follower steven = new Follower("Steven");
        Follower olivia =  new Follower("Olivia");

        karsu.registerObserver(deniz);
        karsu.registerObserver(robert);
        karsu.registerObserver(steven);

        ferit.registerObserver(jeff);
        ferit.registerObserver(sandra);
        ferit.registerObserver(olivia);

        karsu.notifyObservers("Which artists will be guests in my room?" + "\n" + "Sometimes I will sing songs with their valuable guests and sometimes I will give my guests pleasant moments with the little games I have prepared!\n");
        ferit.notifyObservers("It rarely happens to me, but I was hittin’ it hard tonight!!");

        System.out.println("");

        karsu.removeObserver(deniz);

        karsu.notifyObservers("WHAA I am the new FOOD COLUMNIST of Magazine! Thank you ! I am sooo sooo sooo HAPPY!");


    }
}
