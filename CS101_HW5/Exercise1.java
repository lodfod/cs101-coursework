import java.util.Scanner;
public class Exercise1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];

		System.out.println("Enter 10 integers separated by spaces: ");
		for (int i = 0; i < 10; i++){
			a[i] = input.nextInt();
		}
		System.out.print("in reverse: ");
		for(int i = 9; i >= 0; i--){
			System.out.print(a[i] + " ");
		}

	}
}