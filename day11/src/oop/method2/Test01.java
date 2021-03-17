package oop.method2;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Student a = new Student();
		
		a.setName("홍길동");
		//(2)잘못된 점수가 들어갈 수 있지 않을까?
		a.setJava(-70);
		a.setDatabase(60);
		
		a.set("홍길동", -70, 60);
		
		a.result();

	}

}
