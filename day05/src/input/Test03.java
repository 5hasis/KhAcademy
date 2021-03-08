package input;

import java.lang.*;
import java.util.*;

public class Test03 {
	public static void main(String[] args) {
		//Q : 사용자에게 출생년도 4자리 입력받아 나이와 성인 여부 판단 후 출력
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int age = 2021 - year + 1;
		boolean adult = age >= 20;
		
		System.out.println("나이 : " + age);
		System.out.println("성인인가요?");
		System.out.println(adult);
		
		sc.close();
	}

}
