package oop.multi1;

//인터페이스(Interface)
//= 다주상속 전용 클래스
//= 다중상속에 문제되는 요소들을 제거하고 나머지만 가질 수 있는 클래스
public interface Temp {
	
	//멤버 변수
	//변수 생성 불가 -> 자동으로 상수 처리 (모호성 제거)
	/*public static final*/ int a = 10;
	
	//멤버 메소드 : 추상메소드만 생성가능
	/*public abstract*/void test();
	
	//생성자 : 생성 불가 -> 변수가 없는데 생성자?	

}
