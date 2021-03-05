package data;

import java.lang.*;

public class Test03 {
	public static void main(String[] args) {
		//정수에 대한 이해, 분석
		//1.정수는 범위가 있다.
		//- byte : -128 ~ 127까지의 256개의 숫자를 저장할 수 있음
		byte a = 120;
		//int b = 10000000000; //오류
		long c = 10000000000L; //long은 표시를 해줘야 한다
		
		//2.정수는 순환형 구조를 가진다.
		int d = 2100000000 + 100000000; //21억 + 1억 = 22억? -> X
		System.out.println(d);
		
		//3.정수는 끼리끼리 논다
		//=정수의 계산 결과는 정수
	}

}
