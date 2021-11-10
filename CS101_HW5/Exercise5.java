import java.util.Arrays;

public class Exercise5 {
	public static void main(String[] args){
		int[][] randArr = new int[7][7];
		System.out.println("Original Array: ");
		
		for(int i = 0; i < randArr.length; i++){
			for(int j = 0; j<randArr[i].length; j++){
				randArr[i][j] = (int) (Math.random() * 100);
				System.out.printf("%3d", randArr[i][j]);
			}
			System.out.println();
		}
		sortArrayRows(randArr);
		sortArray(randArr);
	}

	public static void sortArrayRows(int[][] arr){
		System.out.println();
		System.out.println("Sort Rows: ");
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				for(int k = j+1; k<arr[i].length; k++){
					if(arr[i][j]>arr[i][k]){
						int temp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = temp;
					}
				}
			}
			for(int f = 0; f < arr[i].length; f++){
				System.out.printf("%3d", arr[i][f]);
			}
			System.out.println();
		}
	}

	public static void sortArray(int[][] arr){
		System.out.println();
		System.out.println("Sort by Ascending: ");
		int[] arr1d = new int[(arr[0].length * arr.length)];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr1d[(arr[0].length*i)+j] = arr[i][j];
			}
		}
		
		for(int i = 0; i<arr1d.length; i++){
			for(int j = 0; j<arr1d.length; j++){
			if(arr1d[i] < arr1d[j]){
				int temp = arr1d[i];
				arr1d[i] = arr1d[j];
				arr1d[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] =(arr1d[(i * arr[0].length) + j]);
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
