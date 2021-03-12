package array;

import java.lang.*;

public class Test05 {
	public static void main(String[] args) {
		// 일자별 금액과 마지막 잔고를 출력
		// 30일동안 첫날은 1원만, 그 다음날부터는 전날의 2배

		//합계변수
		int total = 0;
		
		// 배열 생성
		int[] day = new int[10];
		
		//초기화 : for 적용
		int money = 1;
		for (int i = 0; i < day.length; i++) {
			System.out.println(i + 1 + "일차 금액 : " + money + "원");
			day[i] = money;
			total += money; //합계
			money *= 2;
		}
		
		
		System.out.println("총 합계 : " + total + "원");

	}

}
