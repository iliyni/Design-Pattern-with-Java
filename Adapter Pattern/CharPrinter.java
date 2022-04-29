public class CharPrinter implements Printer {
    PrinterAdapter printerAdapter;

    @Override
    public void print(String PrinterType, String text) {

        if(PrinterType.equalsIgnoreCase("char")){
            System.out.println("Printing in char format...");
            for(int i=0; i<text.length(); i++){
                char c = text.charAt(i);
                System.out.println(c);
            }
        }
        else if(PrinterType.equalsIgnoreCase("buffer")){
            printerAdapter = new PrinterAdapter(PrinterType);
            printerAdapter.print(PrinterType, text);
        }
        else{
            System.out.println("Invalid printer type.");
        }
    }
}
