import java.util.Scanner;

public class Exercise1 {

	public static void viewBalance(Scanner input, double balance) {
		// logs balance

		System.out.printf("\n Your balance is: $%.2f", balance);

	}

	public static double deposit(Scanner input, double balance) {
		// adds given amount to balance

		double addBalance = 0;
		System.out.println("\n Enter amount to deposit: ");
		addBalance = input.nextDouble();
		if(addBalance > 0){
		balance = balance + addBalance;
		}
		// case negative
		else{
			System.out.println("Enter positive deposit only!");
		}

		return balance;

	}

	public static double withdraw(Scanner input, double balance) {
		// removes given amount from balance if less than balance

		double withdrawBalance = 0;
		System.out.println("\n Enter amount to withdraw: ");
		withdrawBalance = input.nextDouble();

		if (withdrawBalance > balance) {
			// case not enough balance available to withdraw
			System.out.println("\n Sorry, you don't have enough balance to withdraw that amount!");
		} else if(withdrawBalance < 0) {
			// case negative
			System.out.println("Enter positive withdraw only!");
		} else {
			balance = balance - withdrawBalance;
		}
		
		return balance;
	}

	public static void main(String[] args) {
		double balance = 100.0;
		Scanner input = new Scanner(System.in);
		
		// continuity factor
		boolean cont = true;

		// check continuity factor while running loop
		do {
			System.out.print("\n 1. View Account Balance \n 2. Deposit Cash \n 3. Withdraw Cash \n 4. Exit ");
			System.out.println("\n Enter your selection: ");
			
			int selection = input.nextInt();

			// catch invalid input
			if (!(selection == 1 || selection == 2 || selection == 3 || selection == 4)) {
				System.out.println("Invalid entry! Please try again.");
			} else if (selection == 4) {
				System.out.println("Goodbye!");
				cont = false;
			} else {
				// valid input selection tree
				if (selection == 1) {
					viewBalance(input, balance);
				}
				else if (selection == 2) {
					balance = deposit(input, balance);
				}
				else {
					balance = withdraw(input, balance);
				}
			}

		} while(cont == true); 
		
	}
}