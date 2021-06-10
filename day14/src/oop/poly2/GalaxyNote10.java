package oop.poly2;

public class GalaxyNote10 extends Galaxy{

	public GalaxyNote10(String color) {
		super(color);
	}
	public GalaxyNote10(String color, String number) {
		super(color, number);
	}
	
	@Override
	public void samsungStore() {
		System.out.println("갤럭시노트10의 삼성스토어 기능을 실행합니다.");
		
	}
	
	@Override
	public void call() {
		System.out.println("갤럭시노트10의 전화 기능을 실행합니다.");
		
	}
	@Override
	public void sms() {
		System.out.println("갤럭시노트10의 문자 기능을 실행합니다.");
		
	}
	
	public void note() {
		System.out.println("갤럭시노트10의 노트 기능을 실행합니다.");
	}

}
