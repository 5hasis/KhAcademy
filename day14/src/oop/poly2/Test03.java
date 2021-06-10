package oop.poly2;

import java.util.*;

public class Test03 {
	public static void main(String[] args) {
		//랜덤 문자열을 추첨할 때, 배열 이용
		String[] colors = new String[] {"골드", "실버", "아쿠아블루"};
		
		Random r = new Random();
		int choice = r.nextInt(colors.length);
		String color = colors[choice];
		
		System.out.println(choice);
		System.out.println(color);
	}

}
