import java.util.ArrayList;

public class GamingComputerIterator implements Iterator {

    ArrayList<Computer> computer;

    public GamingComputerIterator(){
        computer = new ArrayList<Computer>();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
