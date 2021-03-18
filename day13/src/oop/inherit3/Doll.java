package oop.inherit3;

//인형 공용 기능
public class Doll {
	//멤버 변수 : 상위 클래스는 접근제한의 선택지 하나더 
	//- private : 자식클래스조차 접근 불가능
	//- protected : 자식클래스는 접근 가능~
	protected String name;
	protected int price;
	
	public void hello() {
		System.out.println("안녕!");
	}
}
