public class Exercise6 {
	public static void main(String[] args){
		// range is char 65 to char 126
		int j = 0;
		System.out.println("----Char Table----");
		for(int i = 65; i <= 126; i++) {
			System.out.printf("%3d: %1c ", i, (char) i);
			j++;
			if(j % 5 == 0)
				System.out.print("\n");
		}
	}
}