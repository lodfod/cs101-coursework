import java.util.Scanner;

public class Exercise3 {
	
	public static boolean checkPalindrome(String input) {
		
		// create char array to parse string
		char [] parseInput = input.toCharArray();
		boolean isPalindrome = true;
		int length = input.length();

		// compare opposing indices of list
		for(int i = 0; i < length; i++) {
			if (parseInput[i] != parseInput[length-1-i]){
				isPalindrome = false;
			}
		}

		return isPalindrome;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word to check palindromity: ");
		String word = input.nextLine();

		// remove whitespace and call function 
		boolean output = checkPalindrome(word.toLowerCase().replaceAll("[^a-zA-Z]", ""));

		if(output == true)
			System.out.println("Your input is a palindrome.");
		else
			System.out.println("Your input is not a palindrome.");
	
	}


}