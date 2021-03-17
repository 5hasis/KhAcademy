package oop.basic6_1;

public class Student {
	//멤버 변수 : 5개. 합계와 평균은 변수로 저장하지 않고 필요할 때마다 즉석에서 계산하도록 구현
	String name;
	int grade;
	int korean;
	int english;
	int math;
	
	//멤버 메소드 : 2개
	void set(String name, int grade, int korean, int english, int math) {
		this.name = name;
		this.grade = grade;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	void result() {
		int total = this.korean + this.english + this.math;
		double average = total / 3.0;
		
		System.out.println("<학생 정보>");
		System.out.println("이름 : "+this.name);
		System.out.println("학년 : "+this.grade);
		System.out.println("국어 : "+this.korean+"점");
		System.out.println("영어 : "+this.english+"점");
		System.out.println("수학 : "+this.math+"점");
		System.out.println("합계 : "+total+"점");
		System.out.println("평균 : "+average+"점");
	}
}