import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter first number x: ");
  int x = input.nextInt();
  System.out.println("Enter second number y: ");
  int y = input.nextInt();

  int sum = x + y;
  int diff = x-y;
  double div = (double) x/ (double) y;
  int mult = x*y;
  int rem = x%y;

  System.out.println("Sum: "+sum+" | Difference: "+diff+" | Quotient: "+div+" | Product: "+mult+" | Remainder: "+rem);
    
    }
}