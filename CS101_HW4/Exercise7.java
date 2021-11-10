import java.util.Scanner;

public class Exercise7{
	public static String compareStrings(String string1, String string2) {
		int minLength = Math.min(string1.length(), string2.length());
		String common = "";

		for(int i = 0; i <= minLength-1; i++){
			if(string1.charAt(i) == string2.charAt(i)) {
				common = common+string1.charAt(i);
			} else {
				break;
			}
		}
		return common;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter String 1: ");
		String string1 = input.nextLine();
		
		System.out.println("Enter String 2: ");
		String string2 = input.nextLine();

		String commonString = compareStrings(string1, string2);
		
		if(commonString.equals("")){
			System.out.println(string1+" and "+string2+" have no common prefix");
		} else {
			System.out.println("Common prefix: "+commonString);
		}
	}
}