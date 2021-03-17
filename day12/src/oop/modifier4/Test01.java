package oop.modifier4;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Ski a = new Ski();
		
		
		//초기화
		a.set("주간권", 900, 1800, 80000, 64000);
		
		
		//출력
		a.result();
		
		
		//Q : 주간권의 이용시간을 출력
		//A : 9시간 또는 9시간 0분
		System.out.println(a.getName() + " : " + a.getTimeString());
	}
}
