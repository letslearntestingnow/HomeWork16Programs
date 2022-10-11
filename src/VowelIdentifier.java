import java.util.Scanner;

public class VowelIdentifier
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        // Get Input
        System.out.print("\nEnter an alphabet: ");
        char cUserInput = scannerObj.next().charAt(0);

        switch (cUserInput)
        {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.print("\nInput letter is a Vowel");
            default -> System.out.print("\nInput letter is a Consonant");
        }

    }
}
