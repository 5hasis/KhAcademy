package loop2;

import java.lang.*;
import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		//while문의 좋은점
		//=무한반복 또는 특정 시점까지의 반복
		
		//=0을 입력할때 까지 숫자를 입력받는 프로그램
		Scanner sc = new Scanner(System.in);
		int user;
		
		while(true) { //무한반복
			System.out.println("숫자 입력(0 입력시 종료) : ");
			user = sc.nextInt();
			if(user == 0)
				//반복 종료후 탈출
				break; //if, try를 제외한 가장 가까운 범위를 탈출하는 구문
		}
		System.out.println("입력한 숫자 : " + user);
		
		sc.close();
	}

}
