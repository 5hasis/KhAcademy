package condition;

import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		//Q.
		Scanner sc = new Scanner(System.in);
		System.out.println("여행 계획 중인 달 입력 : ");
		int month = sc.nextInt();
		System.out.println("기간 입력 : ");
		int day = sc.nextInt();
		sc.close();
		
		int price = day * 100000;
		if(month == 6 || month == 7 || month == 8) {
		//if(month / 3 == 2)
			price = price * (100 - 20) / 100;
		}
		System.out.println("가격 : " + price + "원");
	}

}
