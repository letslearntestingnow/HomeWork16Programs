import java.util.Scanner;

public class EmployeeSalary
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("\n");

        // Get Employee Id
        System.out.println("Enter Employee ID: ");
        String strEmpId = scannerObj.nextLine();

        // Get Employee Name
        System.out.println("Enter Employee name: ");
        String strEmpName = scannerObj.nextLine();

        // Get Employee Basic Salary
        System.out.println("Enter Employee basic salary: ");
        double dEmpBasicSal = scannerObj.nextDouble();

        EmployeeSalary employeeSalary = new EmployeeSalary();

        double dGrossSal = dEmpBasicSal + employeeSalary.getHRA(dEmpBasicSal) + employeeSalary.getDA(dEmpBasicSal) + employeeSalary.getTA(dEmpBasicSal) + employeeSalary.getPF(dEmpBasicSal);

        // Print output
        System.out.println("\nThe salary details of " + strEmpName + " with employee ID - " + strEmpId + " are as follows:-" );
        System.out.println("Basic Salary: " + dEmpBasicSal);
        System.out.println("HRA: " + employeeSalary.getHRA(dEmpBasicSal));
        System.out.println("DA: " + employeeSalary.getDA(dEmpBasicSal));
        System.out.println("TA: " + employeeSalary.getTA(dEmpBasicSal));
        System.out.println("PF: " + employeeSalary.getPF(dEmpBasicSal));
        System.out.println("Gross Salary: " + dGrossSal);

        scannerObj.close();
    }

    //Calculate HRA
    public double getHRA(double dBasicSal){ return dBasicSal/10; }

    //Calculate DA
    public double getDA(double dBasicSal) { return dBasicSal*.08; }

    //Calculate TA
    public double getTA(double dBasicSal) { return dBasicSal*.09; }

    //Calculate PF
    public double getPF(double dBasicSal) { return dBasicSal/5; }

}
