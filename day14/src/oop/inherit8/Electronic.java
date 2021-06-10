package oop.inherit8;

//전자제품 클래스
//= 형태는 있지만 내용은 알 수 없는 애매한(추상적인) 메소드를 가져야 한다
//= 추상 클래스(abstract class)
//= 일반 클래스와 동일한 구성요를 가지면서 추가적으로 추상메소드를 가질 수 있다
public abstract class Electronic {
	//추상 메소드(abstract method) : 형태만 있는 메소드(자식클래스가 반드시 재정의해야 함)
	public abstract void on();
	public abstract void off();
}