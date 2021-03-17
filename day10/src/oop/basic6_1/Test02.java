package oop.basic6_1;

public class Test02 {
	public static void main(String[] args) {
		//앞의 문제를 배열로 풀이
		//= 배열은 단순하게 묶어주는 역할만 수행한다(객체 생성과는 아무런 상관이 없다)
		Student[] data = new Student[3];
		
		//객체 생성
		//data[0] <--> a
		//data[1] <--> b
		//data[2] <--> c
		data[0] = new Student();
		data[1] = new Student();
		data[2] = new Student();
		
		//초기화
		data[0].set("마리오", 1, 90, 80, 70);
		data[1].set("루이지", 1, 85, 85, 83);
		data[2].set("쿠파", 3, 70, 60, 55);
		
		//출력
		data[0].result();
		data[1].result();
		data[2].result();
	}
}