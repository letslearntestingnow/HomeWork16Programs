import java.util.Scanner;

public class ChangeCase
{
    public static void main(String[] args)
    {
        // Create Scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get string input
        System.out.println("Enter an alphabet: ");
        char cTextInput = scannerObj.next().charAt(0);

        if (cTextInput == Character.toLowerCase(cTextInput)) { cTextInput = Character.toUpperCase(cTextInput); }
        else { cTextInput = Character.toLowerCase(cTextInput); }
        System.out.println("The alphabet after conversion of case is: " + cTextInput);

        scannerObj.close();
    }
}
