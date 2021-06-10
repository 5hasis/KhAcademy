package oop.poly2;

import java.util.Random;

public class Test07 {
	public static void main(String[] args) {
		//마무리
		//2. 아이폰 10대를 랜덤으로 만들어 보관한 뒤 시리 기능 실행
		//= 2부터 3까지 = 2부터 2개
		Random r = new Random();
		
		IPhone[] arr = new IPhone[10];
		
		for(int i=0; i < arr.length; i++) {
			int choice = r.nextInt(2) + 2;
			if(choice == Phone.IPHONE11) {
				arr[i] = new IPhone11("실버");
			}
			else {
				arr[i] = new IPhone12("실버");
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			arr[i].siri();
		}
		
	}
}