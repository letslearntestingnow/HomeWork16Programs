import java.util.Scanner;

public class SalesCommission
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\nEnter Sales ID: ");
        String strSalesID = scannerObj.nextLine();

        System.out.println("Enter Seller's name: ");
        String strSellerName = scannerObj.nextLine();

        System.out.println("Enter sales amount: ");
        int iSalesAmount = scannerObj.nextInt();

        System.out.println("Enter basic salary: ");
        int iBasicSalary = scannerObj.nextInt();

        // Print output
        System.out.print("\nThe basic salary of " + strSellerName + " is " + iBasicSalary);

        if (iSalesAmount >= 50000) { System.out.println(" and the sales commission for the ID - " + strSalesID +" is: " + (iSalesAmount * 0.35)); }
        else if (iSalesAmount >= 30000) { System.out.println(" and the sales commission for the ID - " + strSalesID +" is: " + (iSalesAmount * 0.2)); }
        else if (iSalesAmount >= 20000) { System.out.println(" and the sales commission for the ID - " + strSalesID +" is: " + (iSalesAmount * 0.1)); }
        else if (iSalesAmount >= 10000) { System.out.println(" and the sales commission for the ID - " + strSalesID +" is: " + (iSalesAmount * 0.05)); }
        else { System.out.println(" and the sales commission for the ID - " + strSalesID +" is: " + (iSalesAmount * 0.02)); }


        scannerObj.close();
    }
}
