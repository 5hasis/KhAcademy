package oop.inherit2;

public class Test01 {
	public static void main(String[] args) {
		//Galaxy21S와 IPhone12를 객체로 생성
		//(주의) Phone은 객체 생성이 되지만 만들면 안된다.
		
		Galaxy21S a = new Galaxy21S();
		a.call();
		a.sms();
		a.camera();
		a.bixby();
		
		IPhone12 b = new IPhone12();
		b.call();
		b.sms();
		b.camera();
		b.siri();
	}
}