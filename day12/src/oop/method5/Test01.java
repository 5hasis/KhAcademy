package oop.method5;

public class Test01 {
	public static void main(String[] args) {
		
		Student a = new Student();
		a.set("세종대왕", 100, 80);
		System.out.println(a.getTotal());
		System.out.println(a.getAverage());

	}

}
