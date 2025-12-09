import java.util.Scanner;

public class ReportCardTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Reportcard myReportcard = new Reportcard();
        
        System.out.println( "Please enter the grade level: ");
        String levelofGrade = input.nextLine();
        System.out.println();
        
        myReportcard.displayMessage(levelofGrade);
    }
}