package data;

import java.lang.*;

public class Test09 {
	public static void main(String[] args) {
		//실수 : 소수점이 있는 숫자
		//1.실수는 부정확하다
		//-표시할 수 있는 자리의 제한이 있으며, 넘어가면 반올림 처리
		//2.실수가 포함된 계산은 결과가 실수로 나옴
		
		float a = 1.2345f; //float는 f 표시를 해야한다
		double b = 1.2345;
		
		double c = 1.23456234567892269271765827561874;
		System.out.println(c);
		
		System.out.println(10/3); // int/int
		System.out.println(10/3.0); //int/double
		System.out.println(10/3f); //int/float
	}

}
