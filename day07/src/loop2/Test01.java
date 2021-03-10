package loop2;

import java.lang.*;

public class Test01 {
	public static void main(String[] args) {
		// while 반복문

		//for(선언부; 조건부; 증감부){ 코드 }
		for (int i = 0; i < 10; i++)
			System.out.println(i);
		
		int n = 1; //---------------선언부
		while(n <= 10) { //---------조건부(필수)
			System.out.println(n);
			n++; //-----------------증감부
		}
	}

}
