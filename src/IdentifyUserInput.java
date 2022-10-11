import java.util.Scanner;

public class IdentifyUserInput
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.print("\nEnter a character: ");
        char cUserInput = scannerObj.next().charAt(0);

        System.out.print("\n");

        if (Character.isDigit(cUserInput)) { System.out.print("User entered character is a number"); }
        else if (Character.isLetter(cUserInput)) { System.out.print("User entered character is a letter"); }
        else { System.out.print("User entered character is a Symbol"); }

        scannerObj.close();
    }
}
