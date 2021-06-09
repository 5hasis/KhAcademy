package oop.poly2;

public class Galaxy21S extends Galaxy{

	public Galaxy21S(String color) {
		super(color);
		
	}
	
	public Galaxy21S(String color, String number) {
		super(color, number);
	}
	
	@Override
	public void samsungStore() {
		System.out.println("갤럭시21S의 삼성스토어 기능을 실행합니다.");
		
	}
	
	@Override
	public void call() {
		System.out.println("갤럭시21S의 전화 기능을 실행합니다.");
		
	}
	@Override
	public void sms() {
		System.out.println("갤럭시21S의 문자 기능을 실행합니다.");
		
	}
	
	public void bixby() {
		System.out.println("갤럭시21S의 빅스비 기능을 실행합니다.");
	}

}