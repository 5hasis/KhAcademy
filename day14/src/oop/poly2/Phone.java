
package oop.poly2;

//휴대폰 공용 기능 정의
public abstract class Phone {
	protected String number;
	protected String color;
	
	//생성자
	public Phone(String color) {
		//this.setNumber(null);
		//this.setColor(color);
		this(null, color);
	}
	public Phone(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
	}
	
	//추상메소드
	public abstract void call();
	public abstract void sms();
	
	//setter & getter
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		//if(color == "") return;
		this.color = color;	

	}
	
	//전화기 종류별 상수
	public static final int GALAXY21S = 0;
	public static final int GALAXYNOTE10 = 1;
	public static final int IPHONE11 = 2;
	public static final int IPHONE12 = 3;
	
}


