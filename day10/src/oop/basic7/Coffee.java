package oop.basic7;

public class Coffee {
	String item, type;
	int price;
	boolean event;
	
	void set(String item, String type, int price, boolean event) {
		this.item = item;
		this.type = type;
		this.price = price;
		this.event = event;
		
	}
	
	void out() {
		System.out.println("<커피숍 메뉴 정보>");
		System.out.println(this.item);
		System.out.println(this.type);
		System.out.println(this.price);
		if(this.event == true) {
			int discountPrice = this.price * 80 / 100;
			System.out.println("행사중");
			System.out.println("가격 : " + discountPrice + "원");
		}
		else
			System.out.println("행사아님");
	}
	
}
