package random;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//랜덤 : 다음에 뭐가 나올 지 예측이 불가능한 상태
		//- 랜덤에서 가장 중요한 것은 범위 설정
		//- 일반적으로 정수를 랜덤으로 추첨하는 경우가 가장 많음
		
		//1. 기본 명령을 사용하는 방법
		// = Math.random()
		// = 0이상 1미만의 double이 추첨됨
		
		//1부터 10까지 랜덤한 정수 추첨
		double a = Math.random();//0이상 1미만의 double
		double b = a * 10;//0이상 10미만의 double
		int c = (int)b;//0이상 10미만의 int
		int d = c + 1;//1이상 11미만의 int(1부터 10까지)
		System.out.println(d);
		
		//공식화 시키면...
		int number = (int)(Math.random() * 10) + 1;//1부터 10까지가 아니라 1부터 10개
		System.out.println("number = " + number);
		
		//2. 도구를 사용하는 방법
		Random r = new Random();
		int n = r.nextInt(10) + 1;
		System.out.println("n = " + n);
	}
}