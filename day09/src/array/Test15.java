package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {

		int[] arr = new int[7];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		sc.close();

		// 자바에서는 배열의 기본 작업들을 처리하는 라이브러리(도구)가 있다.
		Arrays.sort(arr);

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

	}

}
