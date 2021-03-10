package loop;

import java.lang.*;
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		// 목표 : 1부터 100사이의 홀수를 다 더한 값을 출력
		// -1부터 100사이의 홀수를 화면에 출력
		// -출력된 값들을 더하려면 어떻게 해야하는가?
		
		int total = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println("i = " + i);
				total += i;
			}

		}
		System.out.println("합계 : " + total);

	}

}
