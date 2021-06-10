package oop.inherit8;

//냉장고 클래스
public class Fridge extends Electronic{

	@Override
	public void on() {
		System.out.println("냉장고 전원을 킵니다");
	}

	@Override
	public void off() {
		System.out.println("냉장고 전원을 끕니다");
	}

}