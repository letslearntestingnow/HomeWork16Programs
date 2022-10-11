import java.util.Scanner;

public class UserInputCalculator
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        // Get input of two numbers
        System.out.print("\nEnter the first number: ");
        int iNumber1 = scannerObj.nextInt();

        System.out.print("\nEnter the second number: ");
        int iNumber2 = scannerObj.nextInt();

        System.out.print("\nEnter the operation you want to perform using symbols such as (+ - * /): ");
        char cOperationToPerform = scannerObj.next().charAt(0);

        System.out.println("\n");

        switch (cOperationToPerform)
        {
            case '+' -> System.out.println(iNumber1 + " + " + iNumber2 + " = " + (iNumber1 + iNumber2));
            case '-' -> System.out.println(iNumber1 + " - " + iNumber2 + " = " + (iNumber1 - iNumber2));
            case '*' -> System.out.println(iNumber1 + " * " + iNumber2 + " = " + (iNumber1 * iNumber2));
            case '/' -> System.out.println(iNumber1 + " / " + iNumber2 + " = " + (iNumber1 / iNumber2));
        }
        scannerObj.close();
    }
}
