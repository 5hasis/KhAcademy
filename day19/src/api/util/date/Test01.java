package api.util.date;

import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
//		java.util 패키지는 필수는 아니지만 매우 유용한 도구들이 존재
//		Date 클래스 : 시간 정보를 관리하는 클래스
//		= 1900년을 기준으로 하기 때문에 시간을 임의로 지정하는 기능은 현재 비추천 상태(다른 클래스 사용 권장)
		//(19)020101
		//(20)020101
//		= 현재 시간을 얻어오는 데 사용
		
		Date a = new Date();
		Date b = new Date(2021, 3, 26); //deprecated 비추천
		
		System.out.println("a = " + a); //a.toString()
		System.out.println("b = " + b);
		
	}
}