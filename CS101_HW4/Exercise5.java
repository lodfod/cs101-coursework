import java.lang.Math;
import java.util.Scanner;

public class Exercise5 {
	public static int randomOut(int a, int b) {
		// generate random int
		int range = b - a;
		int randomInt = (int) (Math.random() * range) + a;

		return randomInt;

	}

	public static char randomOut(char a, char b) {
		// generate random char
		int range = (int) b - (int) a;
		char randomChar = (char) ((Math.random() * (int) range) + (int) a);

		return randomChar;

	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		// conditional for method parameters
		System.out.println("Enter c for random char or i for random int: ");
		char c = input.next().charAt(0);

		// specificy input ranges
		if(c == 'c'){
			System.out.println("Enter first char in range: ");
			char a = input.next().charAt(0);
			
			System.out.println("Enter second char in range: ");
			char b = input.next().charAt(0);

			System.out.println("\nrandom char: " + randomOut(a,b));
			} 

		else if (c == 'i') {
			System.out.println("Enter first int in range: ");
			int a = input.nextInt();
				
			System.out.println("Enter second int in range: ");
			int b = input.nextInt();

			System.out.println("\nrandom int: " + randomOut(a,b));
			}

		


	}
}