public class ComputerBuildLine {
    OfficeComputerLine officeComputerLine;
    GamingComputerLine gamingComputerLine;

    public ComputerBuildLine(OfficeComputerLine officeComputerLine, GamingComputerLine gamingComputerLine) {
        this.officeComputerLine = officeComputerLine;
        this.gamingComputerLine = gamingComputerLine;
    }

    private void buildComputer(Iterator iterator){
        while(iterator.hasNext()){
            Computer computer = iterator.next();
            System.out.println();
        }
    }

    public void runLine(){
        Iterator officeComputerIterator = officeComputerLine.createIterator();
        Iterator gamingComputerIterator = gamingComputerLine.createIterator();
    }
}
