public class OfficeComputerLine {
    static final int MAX_ITEMS = 5;
    int numberOfComputers = 0;
    Computer[] computer;

    public OfficeComputerIterator createIterator(){
        return new OfficeComputerIterator(computer);
    }
}
