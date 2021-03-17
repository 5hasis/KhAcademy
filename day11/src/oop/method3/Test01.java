package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		// 
		
		Smartphone a = new Smartphone();
		Smartphone b = new Smartphone();
		
		a.set("Galaxy21S", "SK", 24, 1500000);
		b.set("iPhone12", "hello", 48, -1800000);
		
		a.out();
		b.out();
	}

}
