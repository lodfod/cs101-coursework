import java.util.Scanner;

public class Exercise2{
	public static void main(String[] args){
		int[] count = new int[100];
		Scanner input = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter ints separated by spaces ending with 0: ");
		int in = -1;


		while(in != 0){
			in = input.nextInt();
			count[counter] = in;
			counter += 1;

		};

		occurences(count);
	}


	public static void occurences(int[] list) {
        for (int i = 1; i < 100; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    count += 1;
            }
            if (count != 0)
                System.out.printf("\n%d occurs %d %s%n", 
                    i, count, count > 1 ? "times" : "time");

        } 
    }

		
}



	

		




		


	
