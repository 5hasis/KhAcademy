package array2d;

public class Test03 {
	public static void main(String[] args) {
		//
		int[][] arr1 = new int[5][5];


		int k = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = j + 1;
				k++;
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();

		}
		
		//System.out.println(Arrays.deepToString(arr1));

	}

}