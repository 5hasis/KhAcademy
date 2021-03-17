package oop.basic6;

public class Test01 {
	public static void main(String[] args) {
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		
		a.set("마리오", 1, 90, 80, 70);
		a.kor = 100;
		b.set("루이지", 1, 85, 85, 83);
		c.set("쿠파", 3, 70, 60, 55);
		
		a.out();
		b.out();
		c.out();

	}

}
