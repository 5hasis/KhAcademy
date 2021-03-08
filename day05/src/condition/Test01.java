package condition;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		//사용자에게 숫자를 하나 입력받아서 짝수인지 홀수인지 판정하여 출력
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력");
		int num = sc.nextInt();
		sc.close();
		
		//boolean even = num을 2로 나눈 나머지가 0인가요?;
		boolean even = num % 2 == 0;
		
		//출력
		//if(even이 true인가요?)
		if(even == true) {
			System.out.println();
		}
		//if(even이 false인가요?)
		if(even == false) {
			System.out.println();
		}

	}

}
