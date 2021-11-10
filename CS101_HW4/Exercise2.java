import java.util.Scanner;

public class Exercise2 {
	public static int reverse(int input) {
		int output = 0;
		while(input != 0) {
			int digit = input % 10;
			output = output*10 + digit;

			input /= 10;

		}
		return output;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to be reversed: ");
		int userIn = input.nextInt();

		int output = reverse(userIn);

		System.out.println(output);
	}
}