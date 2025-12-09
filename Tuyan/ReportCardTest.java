import java.util.Scanner;

public class ReportCardTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReportCard myReportCard = new ReportCard();
        
        System.out.println( "Please enter the grade level: ");
        String levelofGrade = input.nextLine(); //read a line of text
        System.out.println();  //outputs a blank line
        
        myReportCard.displayMessage(levelofGrade);
    }
}