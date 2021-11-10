public class challenge4 {
	public static void main(String[] args){
		
		String str = "treasurelieswithinthischest";
		int a[] = {323, 331, 323, 336, 319, 330, 322};
		char[] toArr = str.toCharArray();
		int intArray[] = new int[toArr.length];
		
		for(int i = 0; i<toArr.length; i++){
			intArray[i] = (int) toArr[i] - 97;
		}
		
		int sum = 0;
		
		for(int i = 0; i < intArray.length; i++){
			sum += intArray[i];
		}
		
		System.out.println(sum);
		
		for(int i = 0; i < a.length; i++){
			a[i] -= sum; 
		}
		
		String ans = "";
		char[] finArr = new char[a.length];
		
		for(int i = 0; i<a.length; i++){
			finArr[i] = (char)(a[i] + 97);
		}

		for(char elem: finArr){
			String addstr = Character.toString(elem);
			ans = ans + addstr;
		}
		
		System.out.println(ans);
	}
}