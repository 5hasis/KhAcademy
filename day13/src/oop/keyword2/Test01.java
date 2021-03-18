package oop.keyword2;

public class Test01 {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		c.setFirst(10);
		c.setSecond(20);
		
		System.out.println(c.plus());
		System.out.println(c.minus());
	}
}
