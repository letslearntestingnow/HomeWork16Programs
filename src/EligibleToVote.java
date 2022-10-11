import java.util.Scanner;

public class EligibleToVote
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.print("\nEnter your age: ");
        int iAge = scannerObj.nextInt();

        // Print output
        if (iAge >= 18) { System.out.print("\nYou are ELIGIBLE to vote."); }
        else { System.out.print("\nYou are NOT ELIGIBLE to vote."); }

        scannerObj.close();
    }
}
