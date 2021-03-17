package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		//객체(인스턴스) 생성
		Student a = new Student();
		
		//초기화 : 단계별로 하고 싶다면? (이름, 자바점수 먼저 -> DB점수 나중)
		//-변수를 가급적 이용하고 싶지 않다면?
		//-객체 지향 프로그래밍은 메소드 위주로 실행
		
		//문제점 
		//(1)set() 하나만 가지고는 부분적인 데이터 변경이 어렵다.
		//- 하나로는 안되니까 여러개 만들자!
		//- 이름은?
		a.set("피카츄", 70);
		a.set(60); 
		//메소드 오버로딩
		//같은 이름의 메소드를 여러개 만들어서 동일한 기능이지만 다양한 상황을 처리할 수 있도록 구현
		//=뭘 좋아할지 몰라서 다 준비했어
		
		//(2)잘못된 점수가 들어갈 수 있지 않을까?
		//a.set(-60);
		
	}

}
