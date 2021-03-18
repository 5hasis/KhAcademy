package oop.keyword6;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		//간단한 가위바위보 게임
		
		//문제점 : 가독성이 낮음, 숫자와 가위바위보의 상관관계 파악이 어려움
		//해결책 : final 변수를 활용
		
		final int scissors = 1;
		final int rock = 2;
		final int paper = 3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보");
		int user = sc.nextInt();
		sc.close();
		
		switch(user) {
		case scissors:
			System.out.println("가위");
			break;
		case rock:
			System.out.println("바위");
			break;
		case paper:
			System.out.println("보");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
				
		}
	}
}
