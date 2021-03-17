package oop.basic5;

//학생 클래스
public class Student {
	//멤버 변수
	String name;
	int score;
	
	//멤버 메소드
	void set(String name, int score) {
		this.name = name;
		this.score = score;
	}
	void result() {
		System.out.println("<학생 정보>");
		System.out.println("이름 : "+this.name);
		System.out.println("점수 : "+this.score+"점");
		if(this.score >= 60) {
			System.out.println("통과");
		}
		else {
			System.out.println("재평가");
		}
	}
}