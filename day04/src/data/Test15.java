package data;

import java.lang.*;

public class Test15 {
	public static void main(String[] args) {
		//목표 : 나이를 이용하여 청소년인지 판정하는 프로그램
		//-청소년 : 14세 이상 19세 이하(20세 미만)
		
		//입력
		int age = 15;
		
		//계산
		boolean teen = age >= 14 && age <= 19;
		
		//출력
		System.out.println(teen);

	}

}
