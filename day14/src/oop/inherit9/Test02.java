package oop.inherit9;

public class Test02 {
	public static void main(String[] args) {
		//상속 구조의 응용 ----> 다형성
		//상위 형태의 리모컨(참조변수)로 하위 형태의 객체를 관리할 수 있다.
		File a = new MP3("test.mp3");
		File b = new AVI("test.avi");
		File c = new PPT("test.pptx");
		
		a.execute();
		b.execute();
		c.execute();
	}
}

