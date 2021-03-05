package data;

import java.lang.*;

public class Test16 {
	public static void main(String[] args) {
		//목표 : 나이를 이용해서 무임승차 대상인지 판정
		//-기준 : 어르신(65세 이상), 유아(8세 미만)
		
		//입력
		int age = 7;
		
		//계산
		boolean a = age >= 65;
		boolean b = age < 8;
		
		boolean free = a || b;
		
		System.out.println(free);
	}

}
