package oop.poly2;

public class IPhone11 extends IPhone {

	public IPhone11(String color) {
		super(color);
	}

	public IPhone11(String color, String number) {
		super(color, number);
	}

	@Override
	public void siri() {
		System.out.println("아이폰11의 시리 기능을 실행합니다");
	}

	@Override
	public void call() {
		System.out.println("아이폰11의 전화 기능을 실행합니다");
	}

	@Override
	public void sms() {
		System.out.println("아이폰11의 문자 기능을 실행합니다");
	}

	public void iTunes() {
		System.out.println("아이폰11의 아이튠즈 기능을 실행합니다");
	}

}
