package oop.inherit5;

//생성자가 있는 상위클래스 상속
//= 상위 클래스의 생성 형태를 맞춰야함
public class Pororo extends Doll {
	public Pororo(String name) {
		super(name); //부모클래스의 생성자에 값 전달
	}
	
	public Pororo(String name, int price) {
		super(name, price);
	}
}
