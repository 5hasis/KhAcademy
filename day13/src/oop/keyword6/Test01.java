package oop.keyword6;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		//간단한 가위바위보 게임
		//= 문자열로 입력받을 수도 있지만 사용자의 실수가 발생할 수 있으므로 다른 값으로 입력받음
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보");
		int user = sc.nextInt();
		sc.close();
		
		switch(user) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
				
		}
	}
}
