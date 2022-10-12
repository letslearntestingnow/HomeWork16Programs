import java.util.Scanner;

public class AverageOfFiveNumbers
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("\n");
        // Get input
        System.out.print("Enter the first number : ");
        int iNumber1 = scannerObj.nextInt();

        System.out.print("Enter the second number : ");
        int iNumber2 = scannerObj.nextInt();

        System.out.print("Enter the third number : ");
        int iNumber3 = scannerObj.nextInt();

        System.out.print("Enter the fourth number : ");
        int iNumber4 = scannerObj.nextInt();

        System.out.print("Enter the fifth number : ");
        int iNumber5 = scannerObj.nextInt();

        // Calculate average and print output
        System.out.println("\nThe average of the given five numbers is : " + ((iNumber1 + iNumber2 + iNumber3 + iNumber4 + iNumber5)/5));
    }
}

