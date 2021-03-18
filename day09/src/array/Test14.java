package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		// Bubble sort
		// = 인접한 두개를 비교하여 서로 교체하는 방식의 정렬
		int[] arr = new int[7];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = arr.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		//배열을 한줄로 찍어주는 명령
		System.out.println(Arrays.toString(arr));
	}

}
