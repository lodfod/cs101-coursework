import java.util.Scanner;

public class Exercise1 {
	public static void enterPassword(){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Password: ");
			String userInput = input.nextLine();
			passwordCheck(userInput);

		}
	public static void passwordCheck(String password){
		if (password.equals("NYU42day")){
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
			enterPassword();

			}
		}
	public static void main(String[] args){
		enterPassword();

		}
	}




