package oop.method2;

public class Student {
	String name;
	int java;
	int database;

	// 규칙 : 변수마다 설정하는 메소드를 한개씩은 만들자!
	// (세터메소드, setter method)
	void set(String name, int java, int database) {
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}

	void setName(String name) {
		this.name = name;
	}

	void setJava(int java) {
		if (java >= 0 && java <= 100)
			this.java = java;
	}

	void setDatabase(int database) {
		if (database >= 0 && database <= 100)
			this.database = database;
	}

	void result() {
		System.out.println("<학생 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("자바점수 : " + this.java);
		System.out.println("DB점수 : " + this.database);
	}

}
