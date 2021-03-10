package loop;

import java.lang.*;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		//일자별 금액과 마지막 잔고를 출력
		//30일동안 첫날은 1원만, 그 다음날부터는 전날의 2배
		
		Scanner sc = new Scanner(System.in);
		System.out.println("기간 입력");
		int max = sc.nextInt();
		sc.close();
		
		long money = 1L;
		long total = 0L;
		
		for(int day=1; day<=max; day++) {
			System.out.println(day+"일차 : "+money+"원");
			total += money;
			System.out.println(day+"일차 잔고 : "+total+"원");
			money *= 2;
		}
		

	}

}
