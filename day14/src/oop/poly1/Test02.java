package oop.poly1;

public class Test02 {
	public static void main(String[] args) {
		//정적 타입
		Galaxy21S a = new Galaxy21S();
		IPhone12 b = new IPhone12();
		
		//동적 타입(다형성)
		Phone c = new Galaxy21S();
		Phone d = new IPhone12();
		
		c.call();
		d.call();
	}
}