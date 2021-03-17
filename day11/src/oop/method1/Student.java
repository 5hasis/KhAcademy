package oop.method1;

public class Student {
	//멤버 변수 : 객체(인스턴스)가 가져야 할 값(데이터)을 저장
	String name;
	int java;
	int database;
	
	//멤버 메소드 : 객체(인스턴스)가 실행할 수 있는 코드(기능)를 저장
	void set(String name, int java, int database) {
		this.name = name;
		this.java = java;
		this.database = database;
	}
	void set(String name, int java){
		this.name = name;
		this.java = java;
	}
	void set(String name) {
		this.name = name;
	}
	void set(int database) {
		this.database = database;
	}
	
	void result() {
		System.out.println("<학생정보>");
		System.out.println("이름 : "+this.name);
		System.out.println("자바점수 : "+this.java+"점");
		System.out.println("DB점수 : "+this.database+"점");
	}
}