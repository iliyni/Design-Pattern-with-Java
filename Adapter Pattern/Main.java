import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     CharPrinter charprinter = new CharPrinter();

         System.out.println("Enter your text:");
         Scanner scanner = new Scanner(System.in);
         String text = scanner.nextLine();

         System.out.println("Enter printer type:");
         Scanner scanner2 = new Scanner(System.in);
	     String type = scanner2.nextLine();


         charprinter.print(type, text);
    }
}
