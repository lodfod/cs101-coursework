import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month name: ");
		String inputMonth = input.nextLine();

		// catch mixed/uppercase inputs
		String month = inputMonth.toLowerCase();
		String season = " ";
		boolean invalid = false;

		// assign season based on input
		if(month.equals("december") || month.equals("january") || month.equals("february")) {
			season = "Winter";
		} else if(month.equals("march") || month.equals("april") || month.equals("may")) {
			season = "Spring";
		} else if(month.equals("june") || month.equals("july") || month.equals("august")) {
			season = "Summer";
		} else if(month.equals("september") || month.equals("october") || month.equals("november")) {
			season = "Fall";
		} else {
			invalid = true;
		}
		
		//catch invalid input
		if (invalid == true) {
			System.out.println("Invalid input! Please try again.");
		} else {
			System.out.println("Season is: "+ season);
		}

	}
}