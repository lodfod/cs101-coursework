import java.util.Scanner;


public class Exercise4 {

// get letter from percent entered
	public static String getLetter(double in){
		String letter = "0";
		if(in >= 90.0){
			letter = "A"; 
		} else 
		if (in < 90.0 && in >= 80.0) {
			letter = "B"; 
		} else
		if (in < 80.0 && in >= 70.0) {
			letter = "C";
		} else
		if (in < 70.0 && in >= 60.0){
			letter = "D";
		} else {
			letter = "F";
		}
		return letter;
	}

// find grade sign from units digit of grade, catching cases of A and F 
	public static String getSign(double in, String letter){
		String sign = "0";
		double unitDigit = in % 10.0; 

		if (letter.equals("A")){
			if (unitDigit <= 2.0){
				sign = "-";
			} else {
				sign = " ";
			}
		} else if (letter.equals("F")) {
			sign = " ";
		}
		else {
			
			if (unitDigit <= 3.0 ) {
				sign = "-";
			} else if (unitDigit <= 7.0) {
				sign = " ";
			} else {
				sign = "+";
			}

		}
		
		return sign;
		
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter numeric percentage: ");
	double percent = input.nextDouble();
	String letter = getLetter(percent);
	String grade = (String) letter + (String) getSign(percent, letter);

	System.out.println("You entered "+percent+"%, your letter grade is "+grade);

	}
}