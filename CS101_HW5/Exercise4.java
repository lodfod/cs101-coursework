import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list: ");
		int numElems = input.nextInt();
		int count = 0;
		int[] list = new int[numElems];
		while(count < numElems) {
			list[count] = input.nextInt();
			count += 1;
		}

		boolean x = isSorted(list);
		if(x == true) {
			System.out.println("The list is sorted.");
		} else {
			System.out.println("The list is not sorted.");
		}

	}
	public static boolean isSorted(int[] list){
		boolean sorted = true;
		for(int i = 0; i<list.length-1; i++){
			if(list[i] > list[i+1]){
				sorted = false;
			}
		}
		return sorted;
	}
}