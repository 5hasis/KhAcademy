package loop;

import java.lang.*;

public class Test06 {
	public static void main(String[] args) {
		//Q1 : 1부터 100까지 5가 들어간 숫자를 출력
		
//		if(50이상60미만 or 1의 자리가 5)
//		if(i >= 50 && i < 60 || i % 10 == 5)
		
		for(int i = 1; i <= 100; i++) {
			if(i / 10 == 5 || i % 10 == 5) 
				System.out.println(i);
		}
	}

}
