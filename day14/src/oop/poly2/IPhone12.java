package oop.poly2;

public class IPhone12 extends IPhone {

	public IPhone12(String color) {
		super(color);
	}

	public IPhone12(String color, String number) {
		super(color, number);
	}

	@Override
	public void siri() {
		System.out.println("아이폰12의 시리 기능을 실행합니다");
	}

	@Override
	public void call() {
		System.out.println("아이폰12의 전화 기능을 실행합니다");
	}

	@Override
	public void sms() {
		System.out.println("아이폰12의 문자 기능을 실행합니다");
	}

	public void iCloud() {
		System.out.println("아이폰12의 아이클라우드 기능을 실행합니다");
	}

}

