package oop.basic4;

public class Product {
	String code, name, classification;
	int price;
	
	void set(String c, String n, String cf, int p) {
		this.code = c;
		this.name = n;
		this.classification = cf;
		this.price = p;
	}
	void out() {
		System.out.println("[상품 정보]");
		System.out.println(this.code);
		System.out.println(this.name);
		System.out.println(this.classification);
		System.out.println(this.price);
		System.out.println();
	}
}
