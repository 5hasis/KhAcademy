package loop;

import java.lang.*;
import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		// 숫자 10개 입력받아 홀짝 판정
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if(num % 2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
		}
		
		sc.close();

	}

}
