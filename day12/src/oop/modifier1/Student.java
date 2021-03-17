package oop.modifier1;

public class Student {
	//변수는 외부의 접근을 차단해야 함 -> 메소드 없이 접근x
	//- 잠금처리 (은닉화 구조)
	//- private 키워드 사용
	private String name;
	private int java;
	private int database;

	// setter method
	//자바에서는 아무런 제한 키워드가 없으면 "패키지"까지만 접근 가능
	//- 외부의 접근을 허용해야 한다
	//- public
	public void setName(String name) {
		this.name = name;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public void setDatabase(int database) {
		this.database = database;
	}
	
	public void set(String anem, int java, int database) {
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}

	// getter method
	public String getName() {
		return this.name;
	}

	public int getJava() {
		return this.java;
	}

	public int getDatabase() {
		return this.database;
	}
	
	//가상의 getter method 추가 가능
	public int getTotal() {
		return this.java + this.database;
	}
	public double getAverage() {
		return this.getTotal()/2.0;
	}

}
