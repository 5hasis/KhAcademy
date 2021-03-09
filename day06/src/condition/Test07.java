package condition;

import java.util.*;

public class Test07 {
	public static void main(String[] args) {
		// 여행사 시뮬레이션 프로그램
		// <계절별 할인율>
		// 봄 : 20%
		// 여름 : 5%
		// 가을 : 10%
		// 겨울 : 25%

		Scanner sc = new Scanner(System.in);
		System.out.print("인원 입력 : ");
		int member = sc.nextInt();
		System.out.print("기간 입력 : ");
		int day = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		sc.close();

		int pricePerDay = 200000;

		// 계산
		// 최종금액 = 인원수 * 일자 * 기본금액 * 할인율(?) / 100
		// int rate = 5 or 10 or 20 or 25;
		int rate;
		if (month / 3 == 1) {// 봄
			rate = 20;
		} else if (month / 3 == 2) {// 여름
			rate = 5;
		} else if (month / 3 == 3) {// 가을
			rate = 10;
		} else {// 겨울
			rate = 25;
		}
		
		int price = day * member * pricePerDay;
		int discount = price * rate / 100;
		int totalPrice = price - discount;

		System.out.println(pricePerDay + "원 X " + member + "명 X " + day + "일 = " + price + "원");
		System.out.println("총 경비 : " + price + "원");
		System.out.println("할인 금액은 " + discount + "원 입니다");
		System.out.println("할인된 예상 경비 : " + totalPrice + "원");

	}

}
