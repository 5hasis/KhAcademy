package oop.method5;

public class Student {
	String name;
	int java;
	int database;

	// setter method
	// 변수당 1개씩, 필요하다면 여러개 설정하는 것 추가
	void setName(String name) {
		this.name = name;
	}

	void setJava(int java) {
		this.java = java;
	}

	void setDatabase(int database) {
		this.database = database;
	}
	
	void set(String anem, int java, int database) {
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}

	// getter method
	// 변수당 1개씩, 필요하다면 다른 계산을 할 수 있는 것 추가
	String getName() {
		return this.name;
	}

	int getJava() {
		return this.java;
	}

	int getDatabase() {
		return this.database;
	}
	
	//가상의 getter method 추가 가능
	int getTotal() {
		return this.java + this.database;
	}
	double getAverage() {
		return this.getTotal()/2.0;
	}

}
