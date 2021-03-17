package oop.basic6_1;

public class Test01 {
	public static void main(String[] args) {
		//문제점(1) : 실제의 총점,평균과 다른값을 설정할 수 있다.
		//= 총점과 평균을 설정하지 않도록 set 메소드를 구성
		Student a = new Student();
		a.set("해킹범", 1, 0, 0, 0);
		a.result();
		
		//문제점(2) : 총점과 평균이 실시간으로 반영이 안된다.
		//= 계산의 위치를 result로 바꾼다
		//= 어짜피 출력을 result에서 하니까....
		Student b = new Student();
		b.set("루이지", 1, 85, 85, 83);
		b.korean = 100;
		//b.total = b.korean + b.english + b.math;
		//b.average = b.total / 3.0;
		b.result();
	}
}