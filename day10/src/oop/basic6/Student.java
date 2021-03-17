package oop.basic6;

public class Student {

	String name;
	int grade, kor, eng, mat, sum;
	double avg;
	
	void set(String n, int g, int k, int e, int m) {
		this.name = n;
		this.grade = g;
		this.kor = k;
		this.eng = e;
		this.mat = m;
		
	}
	
	void out() {
		this.sum = this.kor + this.eng + this.mat;
		this.avg = this.sum / 3.0;
		
		System.out.println("<학생 성적 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.grade);
		System.out.println("총점 : " + this.sum);
		System.out.println("평균 : " + this.avg);
		
	}
}
