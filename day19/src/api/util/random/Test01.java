package api.util.random;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//Random 클래스 : 무작위 값을 추첨하는 기능을 가진 클래스
		
		Random r = new Random();
		
		System.out.println(r.nextBoolean()); //무작위 논리값(50% 확률로 true/flase)
		System.out.println(r.nextInt()); //무작위 정수(int)값
		System.out.println(r.nextInt(5) + 6); //범위를 설정한 정수 = 6부터 5개
		System.out.println(r.nextFloat()); //무작위 실수(float)
		System.out.println(r.nextDouble()); //무작위 실수(Double) = Math.random()과 동일
		System.out.println(r.nextGaussian()); //가우스 분포(정규분포)
		
	}

}
