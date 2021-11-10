import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	// Get numbers from user
	System.out.println("enter first number: ");
	double num1 = input.nextDouble();
	System.out.println("enter second number: ");
	double num2 = input.nextDouble();

	// Invoke Math.max and output maximum
	double maxNum = Math.max(num1, num2);
	System.out.println("The maximum of the two numbers you entered is " + maxNum);

	}
}