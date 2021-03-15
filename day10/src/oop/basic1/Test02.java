package oop.basic1;

public class Test02 {
	public static void main(String[] args) {
		//미리 만들어놓은 클래스(Message)를 이용해 객체를 생성
		Message a = new Message();
		Message b = new Message();
		Message c = new Message();
		Message d = new Message();
		
		//a = "초롱초롱 라이언";
		a.sender = "초롱초롱 라이언";
		a.content = "응 먹고 들어가는중";
		a.time = "오후 12:29";
		a.remain = 0;
		
		System.out.println(a);//참조변수정보
		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.time);
		System.out.println(a.remain);
		
		System.out.println(b.sender);
		System.out.println(b.content);
		System.out.println(b.time);
		System.out.println(b.remain);
	}
}