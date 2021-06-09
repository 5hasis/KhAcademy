package array2d;

public class Test04 {

	public static void main(String[] args) {
		int[][] arr1 = new int[5][5];

		
		for (int i = 0; i < arr1.length; i++) {
			int k = i + 1;
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = k;
				k += 5;
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();

		}

	}

}
