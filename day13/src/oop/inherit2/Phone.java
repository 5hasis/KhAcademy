package oop.inherit2;

//휴대폰이라면 가질 수 있는 공통 기능을 작성
//= 상위 클래스 = 슈퍼 클래스(super class) = 부모 클래스
//= 형태가 없는 추상적인 개념
public class Phone {
	//멤버 변수
	private String number;
	
	//멤버 메소드
	public void call() {
		System.out.println("전화 기능");
	}
	public void sms() {
		System.out.println("문자 기능");
	}
	public void camera() {
		System.out.println("카메라 기능");
	}
}