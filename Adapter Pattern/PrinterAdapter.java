public class PrinterAdapter implements Printer {

    NewPrinter newPrinter;

    public PrinterAdapter(String PrinterType){
        if(PrinterType.equalsIgnoreCase("buffer")){
               newPrinter = new BufferPrinter();
        }
    }
    @Override
    public void print(String PrinterType, String text) {
        if(PrinterType.equalsIgnoreCase("buffer")){
            for(int i=0; i<text.length(); i+=3){
                if(i+3>=text.length()){
                    char c = text.charAt(i);
                    System.out.println(c);
                }else if(i+2>=text.length()){
                    char c = text.charAt(i);
                    System.out.println(c);
                }else if(i+1>=text.length()){
                    char c = text.charAt(i);
                    System.out.println(c);
                }else {
                    String c = text.substring(i, i + 3);
                    System.out.println(c);
                }
            }

        }
    }
}
