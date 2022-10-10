import java.util.Scanner;

// Program to find if a number is Odd or Even

public class OddEvenTernary
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");

        Scanner scannerObj = new Scanner(System.in);
        // Get user input from command line
        int iNumber = scannerObj.nextInt();

        if (isEven(iNumber))
        {
            System.out.println("The number: " + iNumber + ", is Even");
        }
        else
        {
            System.out.println("The number: " + iNumber + ", is Odd");
        }
    }

    // check if the number is Even
    static boolean isEven(int a)
    {
        int iRemainder = a%2;
        return ( iRemainder == 0 ? true : false);
    }
}