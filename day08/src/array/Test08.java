package array;

import java.lang.*;

public class Test08 {
	public static void main(String[] args) {
		// 배열에서 많이 나오는 계산 형태 : index를 구하는 계산
		int[] data = new int[]{30, 50, 20, 10, 40};
		
		//Q. 가장 큰 값은 뭘까요?
		//A : 50, 1번 위치
		
		int max = data[0];
		int idx = 0;
		
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
				idx = i;
			}
		}
		//
		System.out.println(max + ", " + idx + "번 위치");

	}

}
