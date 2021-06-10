package oop.inherit9;

public class Test01 {
	public static void main(String[] args) {
//		MP3 a = new MP3("학교종.mp3");
		MP3 a = new MP3("학교종.mp3", 20000, 30);
		a.forward();
		a.rewind();
		a.execute();
		
//		AVI b = new AVI("자바수업.avi");
		AVI b = new AVI("자바수업.avi", 50000, 1.5f);
		b.forward();
		b.rewind();
		b.execute();
		
//		PPT c = new PPT("발표.pptx");
		PPT c = new PPT("발표.pptx", 15000, 12);
		c.information();
		c.execute();
	}
}
