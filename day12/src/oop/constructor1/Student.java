package oop.constructor1;

public class Student {
	//멤버 변수
	private String name;
	private int java;
	private int database;
	
	//생성자
	//= 모든 클래스에 1개이상 존재
	//= 클래스와 동일한 이름을 가져야함
	//= 반환타입을 작성할 수 없음
	//= 오로지 초기화를 위한 용도로 사용
	//= 과거에 만든 set 메소드와 기능상 유사
	//= 오버로딩 가능
	
	//생성방법 1 : 이름만 설정하여 생성이 가능하다
	public Student(String name) {
		this.setName(name);
	}
	
	//생성방법 2 : 이름과 점수를 모두 설정하여 생성이 가능하다
	public Student(String name, int java, int database) {
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	
	
}