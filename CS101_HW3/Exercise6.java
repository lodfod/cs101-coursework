import java.util.Scanner;

// use string.charAt(i)

public class Exercise6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = input.nextLine();
		boolean digit = false;
		boolean letter = false;

		// case password is shorter than 8 characters
		if(password.length() < 8) {
			System.out.println("Weak Password.");
		} else if(password.length() > 8){
			// check contents of password
			for (int i = 0; i < password.length(); i++) {
				if(Character.isDigit(password.charAt(i))) {
					digit = true;
				} else {
					letter = true;
				}
			}

			if (!(digit == true && letter == true)) {
				// case password only contains digits or letters
				System.out.println("Medium Password.");
			} else if (password.toUpperCase().equals(password) || password.toLowerCase().equals(password)) {
					// password has same case characters only
					System.out.println("OK Password.");
			} else if (password.length() > 8 && password.length() < 12){
					// password meets criteria but is less than 12 characters long
					System.out.println("Strong Password.");
				} else {
					// password meets all preceding criteria
				System.out.println("Awesome Password.");
				}
			
		} else {
			// exception handling
			System.out.println("Invalid Password.");
			}
		}
	}

