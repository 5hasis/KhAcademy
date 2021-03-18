package oop.keyword6;

import java.util.*;

public class Test03 {
	// 문제점 : 다른 프로그램에서 접근할 수 없음(공용으로 사용 불가)
	// 해결책 : 클래스에 static 형태로 상수 선언

	//일반적으로 상수는 대문자로 작성
	public static final int SCISSORS = 1;
	public static final int ROCK = 2;
	public static final int PAPER = 3;

	public static void main(String[] args) {
		//간단한 가위바위보 게임
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보");
		int user = sc.nextInt();
		sc.close();
		
		switch(user) {
		case SCISSORS:
			System.out.println("가위");
			break;
		case ROCK:
			System.out.println("바위");
			break;
		case PAPER:
			System.out.println("보");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
				
		}
	}
}
