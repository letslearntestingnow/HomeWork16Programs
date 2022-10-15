import java.util.Scanner;

public class IdentifyUserInput
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("\n");
        
        // Get Input
        System.out.print("Enter a character: ");
        char cUserinput = scannerObj.next().charAt(0);

        System.out.println("\n");

        if(Character.isDigit(cUserinput))
        {
            System.out.println("User entered character is a number.");
        } else if (Character.isLetter(cUserinput))
        {
            System.out.println("User entered character is a letter.");
        }
        else
        {
            System.out.println("User entered character is a Symbol.");
        }

        scannerObj.close();
    }
}
