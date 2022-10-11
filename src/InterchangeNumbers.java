import java.util.Scanner;

public class InterchangeNumbers
{
    public static void main(String[] args)
    {
        Scanner scannerObj  = new Scanner(System.in);

        // Get the first number
        System.out.println("Enter the first number: ");
        int iFirstNumber = scannerObj.nextInt();

        // Get the second number
        System.out.println("Enter the second number: ");
        int iSecondNumber = scannerObj.nextInt();

        // Swap the numbers
        int iPlaceholder = iFirstNumber;
        iFirstNumber = iSecondNumber;
        iSecondNumber = iPlaceholder;

        // Print output
        System.out.println("The value of the first number after swap is: " + iFirstNumber);
        System.out.println("The value of the second number after swap is: " + iSecondNumber);
    }
}
