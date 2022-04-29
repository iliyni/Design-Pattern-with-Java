import java.util.Iterator;

public class OfficeComputerIterator implements Iterator{

    Computer[] computer;
    int position = 0;

    public OfficeComputerIterator(Computer[] computer) {
        this.computer = computer;
    }

    @Override
    public boolean hasNext() {
        if(position >= computer.length || computer[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Computer next() {
        Computer computerItem = computer[position];
        position = position + 1;
        return computerItem;
    }
}
