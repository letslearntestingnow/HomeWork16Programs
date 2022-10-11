import java.util.Scanner;

public class StudentResultPassFail
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get student name
        System.out.println("Enter student name: ");
        String strStudentName = scannerObj.nextLine();

        // Get student roll number
        System.out.println("Enter student roll no.: ");
        String strStudentRollNo = scannerObj.nextLine();

        // Get marks in English
        System.out.println("Enter student's marks in English': ");
        int iMarksEnglish = scannerObj.nextInt();

        if (iMarksEnglish > 100 || iMarksEnglish < 0)
        {
            System.out.println("Invalid input. Enter again.");
            iMarksEnglish = scannerObj.nextInt();
        }

        // Get marks in Maths
        System.out.println("Enter student's marks in Maths: ");
        int iMarksMaths = scannerObj.nextInt();

        if (iMarksMaths > 100 || iMarksMaths < 0)
        {
            System.out.println("Invalid input. Enter again.");
            iMarksMaths = scannerObj.nextInt();
        }

        // Get marks in Science
        System.out.println("Enter student's marks in Science: ");
        int iMarksScience = scannerObj.nextInt();

        if (iMarksScience > 100 || iMarksScience < 0)
        {
            System.out.println("Invalid input. Enter again.");
            iMarksScience = scannerObj.nextInt();
        }

        // Create object of StudentResult class
        StudentResultPassFail studentResultObj = new StudentResultPassFail();

        // Calculate total of marks
        int iMarksTotal = studentResultObj.TotalMarks(iMarksEnglish, iMarksMaths, iMarksScience);
        // Calculate percentage of marks
        int iPercentage = studentResultObj.Percentage(iMarksTotal);
        // Check if the student passed ALL subjects
        boolean bPass = studentResultObj.isPass(iMarksEnglish, iMarksMaths, iMarksScience);

        // Print student name with total marks, percentage, the grade awarded and if Pass or Fail
        System.out.println("\n Total marks for " + strStudentName + " are: " + iMarksTotal);
        System.out.println("Percentage for "+ strStudentName + " is: " + iPercentage);
        System.out.println(strStudentName + " has been awarded the grade: " + studentResultObj.Grading(iPercentage));
        if (bPass) { System.out.println(strStudentName + " has Passed all the subjects.");}
        else { System.out.println(strStudentName + " has Failed in at least one subject."); }
    }

    public int TotalMarks(int iMarksEnglish, int iMarksMaths, int iMarksScience)
    {
        return (iMarksEnglish + iMarksMaths + iMarksScience);
    }

    public int Percentage(int iMarksTotal)
    {
        return (iMarksTotal / 3);
    }

    public String Grading(int iPercentage)
    {
        if (iPercentage >= 80) { return "A+";}
        else if (iPercentage >= 60) { return "A"; }
        else if (iPercentage >= 50) { return "B"; }
        else if (iPercentage >= 35) { return "C"; }
        return "N/A";
    }

    public boolean isPass(int iMarksEnglish, int iMarksMaths, int iMarksScience)
    {
        if (iMarksEnglish < 35 || iMarksMaths < 35 || iMarksScience < 35) return false;
        return true;
    }
}
