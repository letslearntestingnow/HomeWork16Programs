import java.util.Scanner;

public class DayOfTheWeek
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        // Get Input
        System.out.print("\nEnter a number: ");
        int iNumber = scannerObj.nextInt();

        // Print output
        switch (iNumber)
        {
            case 1 -> System.out.print("\nThis number corresponds to Monday");
            case 2 -> System.out.print("\nThis number corresponds to Tuesday");
            case 3 -> System.out.print("\nThis number corresponds to Wednesday");
            case 4 -> System.out.print("\nThis number corresponds to Thursday");
            case 5 -> System.out.print("\nThis number corresponds to Friday");
            case 6 -> System.out.print("\nThis number corresponds to Saturday");
            case 7 -> System.out.print("\nThis number corresponds to Sunday");
            default -> System.out.print("\nInvalid input. There are only 7 days in a week.");
        }

        scannerObj.close();
    }
}
