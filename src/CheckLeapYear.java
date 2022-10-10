import java.util.Scanner;

public class CheckLeapYear
{
    public static void main(String[] args)
    {
        // variable to check if the year is leap or not
        boolean bLeapYear;

        // creating scanner object
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Enter the year: ");
        // Get the user input
        int iYear = scannerObj.nextInt();

        // Call method to check for leap year
        bLeapYear = checkLeapYear(iYear);

        if (bLeapYear) { System.out.println("Yes, it is a leap year."); }
        else { System.out.println("No, it is not a leap year."); }
    }

    static boolean checkLeapYear(int iYear)
    {
        boolean bLeapYear;

        // if the year, divided by 4, results in remainder of 0 then it is a leap year
        if (iYear %4 == 0) { bLeapYear = true; }
        else { bLeapYear = false; }

        return bLeapYear;
    }
}
