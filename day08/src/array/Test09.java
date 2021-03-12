package array;

import java.lang.*;
import java.util.*;

public class Test09 {
	public static void main(String[] args) {
		// 숫자 5개 입력 받아서 가장 작은 숫자의 위치와 값 출력
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		//굳이 최소값변수 지정할 필요 X, 인덱스 찾아서 값 가져오기
		//int min = arr[0];
		int idx = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[idx] > arr[i]) {
				arr[idx] = arr[i];
				idx = i;
			}
			
		}
		System.out.println(arr[idx] + ", " + idx + "번 위치");
		sc.close();

	}

}
