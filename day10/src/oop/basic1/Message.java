package oop.basic1;

//이 클래스는 "자바에게 메세지가 어떤 모양인지 알려주기 위해" 만들었다.
//메세지(Message) = 보낸사람 + 내용 + 시간 + 안읽은사람수
//메세지(Message) = String + String + String + int
public class Message {
	
	//멤버변수 : 객체의 내부에서 데이터를 저장하기 위한 공간(구성요소)
	String sender;
	String content;
	String time;
	int remain;
}
