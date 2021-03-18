package oop.inherit5;

//Q.상위클래스에 생성자를 만들 수 있을까?
public class Doll {
	
	//멤버 변수
	protected String name;
	protected int price;
	
	//생성자
	public Doll(String name) {
		this.name = name;
	}
	public Doll(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void hello() {
		System.out.println("안녕!");
	}

}
