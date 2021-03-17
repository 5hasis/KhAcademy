package oop.basic4;

public class Test01 {
	public static void main(String[] args) {
		// 
		Product a = new Product();
		Product b = new Product();
		Product c = new Product();
		
		a.set("A00001", "참이슬", "주류", 1200);
		b.set("A00002", "처음처럼", "주류", 1300);
		c.set("B00001", "고무장갑", "생필품", 2000);
		
		a.out();
		b.out();
		c.out();
		

	}

}
