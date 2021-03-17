package oop.keyword1;

public class Test01 {
	public static void main(String[] args) {
		//목표 : 변수의 값을 바꿀 수 없도록 설정
		//= final 키워드를 변수 좌측에 추가하면 최초 1회만 설정이 가능
		
		final int a = 10;
		
		//a = 20;//2번째 초기화 불가
		
		//a = 30;//3번째 초기화 불가
		
		System.out.println("a = " + a);//30
		
	}
}