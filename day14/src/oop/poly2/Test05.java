package oop.poly2;

import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
//		1개의 전화기를 랜덤으로 생성
		
//		약속 : 갤럭시21s(0) , 갤럭시노트10(1) , 아이폰11(2) , 아이폰12(3)
//		= 0부터 3까지 = 0부터 4개
		
		Random r = new Random();
		int choice = r.nextInt(4) + 0;
		System.out.println("choice = " + choice);
		
//		Phone p = 4개중 1개;
		Phone p;
		if(choice == 0) {
			p = new Galaxy21S("010-1212-3434", "골드");
		}
		else if(choice == 1) {
			p = new GalaxyNote10("010-1212-3434", "골드");
		}
		else if(choice == 2) {
			p = new IPhone11("010-1212-3434", "화이트");
		}
		else {
			p = new IPhone12("010-1212-3434", "화이트");
		}
		
		p.call();
		p.sms();
		
	}
}

