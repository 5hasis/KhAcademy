package oop.basic7;

public class Test01 {
	public static void main(String[] args) {
		Coffee a = new Coffee();
		Coffee b = new Coffee();
		Coffee c = new Coffee();
		Coffee d = new Coffee();
		
		a.set("아메리카노", "음료", 2000, true);
		b.set("프라푸치노", "음료", 3500, false);
		c.set("치즈케이크", "빵", 5000, true);
		d.set("유기농샌드위치", "빵", 3000, false);
		
		a.out();
		b.out();
		c.out();
		d.out();

	}

}
