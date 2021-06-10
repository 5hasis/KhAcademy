package array2d;

public class Test05 {
	public static void main(String[] args) {
		//
		int[][] arr1 = new int[5][5];

		int k = 1;
		for (int i = 0; i < arr1.length; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = k;
					k++;
					System.out.print(arr1[i][j] + "\t");
				}
			}
			else {
				for (int j = arr1[i].length - 1; j >= 0; j--) {
					arr1[i][j] = k;
					k++;
					System.out.print(arr1[i][j] + "\t");
				}
			}
			
				System.out.println();
			

		}
	}

}
