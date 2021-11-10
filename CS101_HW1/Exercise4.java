import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter desired grade: ");
  String grade = input.nextLine();
  
  System.out.println("Enter minimum average required: ");
  double minAvg = input.nextDouble();
  
  System.out.println("Enter current average in course: ");
  double currentAvg = input.nextDouble();
  
  System.out.println("Enter percentage of course grade covered by final: ");
  double finalPercent = input.nextDouble();
  double finalDecimal = finalPercent/100.0;
 
  double score = (minAvg-(currentAvg*(1-finalDecimal))) / finalDecimal;
  System.out.println("You need a score of "+score+"% on the final to get "+grade);
  }
}
