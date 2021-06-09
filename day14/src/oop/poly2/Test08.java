package oop.poly2;

import java.util.Random;

public class Test08 {
	public static void main(String[] args) {
		//마무리
		//3. 휴대폰 10대를 랜덤으로 만들어 보관한 뒤 통화 기능 실행
		//= 0부터 3까지 = 0부터 4개
		Random r = new Random();
		
		Phone[] arr = new Phone[10];
		
		for(int i=0; i < arr.length; i++) {
			int choice = r.nextInt(4) + 0;
			if(choice == Phone.GALAXY21S) {
				arr[i] = new Galaxy21S("실버");
			}
			else if(choice == Phone.GALAXYNOTE10) {
				arr[i] = new GalaxyNote10("실버");
			}
			else if(choice == Phone.IPHONE11) {
				arr[i] = new IPhone11("실버");
			}
			else {
				arr[i] = new IPhone12("실버");
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			arr[i].call();
		}
		
	}
}