package array;

import java.util.*;

public class Test13 {
	public static void main(String[] args) {
		//내림차순으로 선택 정렬
		int[] arr = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			int idx = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[idx] < arr[j]) {
					idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
		
	}

}
