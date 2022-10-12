import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("\n");

        // Get input
        System.out.print("Enter a number : ");
        int iNumber = scannerObj.nextInt();

        // Check if the entered number is positive, negative or zero and print output
        if (iNumber > 0) { System.out.println("\nThe given number is POSITIVE."); }
        else if (iNumber < 0) { System.out.println("\nThe given number is NEGATIVE."); }
        else { System.out.println("\nThe give number is ZERO."); }
    }
}
