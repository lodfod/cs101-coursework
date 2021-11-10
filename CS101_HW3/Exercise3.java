import java.util.Scanner;
import java.util.Random;

public class Exercise3 {

// method to generate random letter, case based on parameter from input
	public static void randomLetter(char letterType) {
		Random r = new Random();
		char output = (char) (letterType+r.nextInt(26));
		System.out.println("your random char is "+output+".");
	}

// method for letter entry (to catch error and continue in case of invalid entry)
	public static char enterLetter() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter either 'a' for lowercase or 'A' for uppercase random letter: ");
		char letterCase = input.next().charAt(0);
		return letterCase;

	}

	public static void main(String[] args) {		
		
		// continuity factor
		boolean cont = true;

		// check if correct input type has already been entered
		while(cont == true) {
			char letterCase = enterLetter();

			// check letter case
			if (letterCase == 'a' || letterCase == 'A') {
				randomLetter(letterCase);
				cont = false; }

			// catch error of wrong char entered
			else {
				System.out.println("Invalid Entry, please try again.");
				letterCase = enterLetter();
			}

		}
	}
}