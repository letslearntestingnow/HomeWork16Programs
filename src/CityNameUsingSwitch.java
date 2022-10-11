import java.util.Scanner;

public class CityNameUsingSwitch
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("Enter an alphabet between a and f : ");
        char cAlphabet = scannerObj.next().charAt(0);

        switch (cAlphabet)
        {
            case 'a', 'A' -> System.out.println("\nAhmedabad");
            case 'b', 'B' -> System.out.println("\nBengaluru");
            case 'c', 'C' -> System.out.println("\nCochin");
            case 'd', 'D' -> System.out.println("\nDelhi");
            case 'e', 'E' -> System.out.println("\nEnfield");
            case 'f', 'F' -> System.out.println("\nFarnworth");
            default -> System.out.println("\nInvalid entry");
        }

        scannerObj.close();
    }
}
