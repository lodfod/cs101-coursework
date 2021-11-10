
import java.util.Scanner;

public class Exercise4 {
	public static int toBinary(int input) {
		// binary conversion method

		int output = 0;
		int remainder = 0;
		while(input > 0){
			remainder = input % 2;
			input /= 2;

			output = output*10 + remainder;


		}

		return output;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter int to convert to binary: ");

		// setup variables
		int userIn = input.nextInt();
		int binaryOut = toBinary(userIn);

		System.out.println("Your input of "+userIn+" in base-10 is equal to " + binaryOut+ " in binary (base-2).");


	}
}