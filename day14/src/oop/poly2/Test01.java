package oop.poly2;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {

		Random r = new Random();
		Galaxy[] Galaxy = new Galaxy[10];
		IPhone[] IPhone = new IPhone[10];
		Phone[] Phone = new Phone[10];

		String color = "";

		// 갤럭시
		for (int i = 0; i < Galaxy.length; i++) {
			switch (r.nextInt(3) + 1) { // 1,2,3
			case PhoneColor.GOLD:
				color = "골드";
				break;
			case PhoneColor.SILVER:
				color = "실버";
				break;
			case PhoneColor.AQUABLUE:
				color = "아쿠아블루";
				break;
			}

			int num = r.nextInt(2);

			if (num == 0)
				Galaxy[i] = new Galaxy21S(color);
			else
				Galaxy[i] = new GalaxyNote10(color);

		}

		// 갤럭시 출력
		System.out.println("<갤럭시 정보>");
		for (int i = 0; i < Galaxy.length; i++) {
			Galaxy[i].samsungStore();
			System.out.println(Galaxy[i].getColor());
		}

		// 아이폰
		for (int i = 0; i < IPhone.length; i++) {
			switch (r.nextInt(3) + 4) { // 4,5,6
			case PhoneColor.WHITE:
				color = "화이트";
				break;
			case PhoneColor.BLACK:
				color = "블랙";
				break;
			case PhoneColor.PINK:
				color = "핑크";
				break;
			}

			int num = r.nextInt(2);

			if (num == 0)
				IPhone[i] = new IPhone11(color);
			else
				IPhone[i] = new IPhone12(color);

		}

		// 아이폰 출력
		System.out.println();
		System.out.println("<아이폰 정보>");
		for (int i = 0; i < IPhone.length; i++) {
			IPhone[i].siri();
			System.out.println(IPhone[i].getColor());
		}

		// 폰
		for (int i = 0; i < Phone.length; i++) {
			int rnd = r.nextInt(2);
			
			if (rnd == 0) { // 갤럭시일때
				switch (r.nextInt(3) + 1) { // 1,2,3
				case PhoneColor.GOLD:
					color = "골드";
					break;
				case PhoneColor.SILVER:
					color = "실버";
					break;
				case PhoneColor.AQUABLUE:
					color = "아쿠아블루";
					break;
				}

				int num = r.nextInt(2);

				if (num == 0)
					Phone[i] = new Galaxy21S(color);
				else
					Phone[i] = new GalaxyNote10(color);
			} 
			
			else {// 아이폰일때
				switch (r.nextInt(3) + 4) { // 4,5,6
				case PhoneColor.WHITE:
					color = "화이트";
					break;
				case PhoneColor.BLACK:
					color = "블랙";
					break;
				case PhoneColor.PINK:
					color = "핑크";
					break;
				}

				int num = r.nextInt(2);

				if (num == 0)
					Phone[i] = new IPhone11(color);
				else
					Phone[i] = new IPhone12(color);
			}

		}
		System.out.println();
		System.out.println("<휴대폰 정보>");
		for (int i = 0; i < Phone.length; i++) {

			Phone[i].call();
			System.out.println(Phone[i].getColor());
		}

	}

}
