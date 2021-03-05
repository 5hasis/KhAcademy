package data;

import java.lang.*;

public class Test06 {
	public static void main(String[] args) {
		int gimbap = 900;
		int count = 5;

		//int totalPrice = (count % 2)*gimbap + (count / 2) * gimbap;
		int totalPrice = (count % 2 + count / 2) * gimbap; //2+1은 안됨TT
		
		System.out.println(totalPrice);
		
		//------------------------------------
		//무료개수 = 구매개수 / 2
		//유료개수 = 구매개수 - 무료개수
		//계산금액 = 유료개수 * 900원
		
		int free = count / 3; //2+1
		int pay = count - free;
		int total = pay * 900;
		System.out.println(total);
		
		
	}

}
