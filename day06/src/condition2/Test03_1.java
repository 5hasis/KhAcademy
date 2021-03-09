package condition2;

import java.lang.*;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		//마지막 날짜 계산 프로그램
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		sc.close();
		
		//계산
		//int max = 31 or 30 or 28;
		int max;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {//1, 3, 5, 7, 8, 10, 12
			max = 31;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {//4, 6, 9, 11
			max = 30;
		}
		else{//2
			max = 28;
		}
		
		//출력
		System.out.println(max + "일까지 있습니다");
		
	}
}