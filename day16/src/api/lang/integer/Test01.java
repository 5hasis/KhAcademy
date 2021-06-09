package api.lang.integer;

public class Test01 {
	public static void main(String[] args) {
		//java.lang.Integer 클래스
		//1. 100이라는 값을 가지는 객체를 생성
		Integer a = new Integer(100);
		Integer b = new Integer("100");
		
		System.out.println("a = " + a.toString());
		System.out.println("b = " + b.toString());
		
		//Q. a와 b는 똑같아요(동등)? 완전 똑같아요(동일)? **진짜 중요합니다. No.1
		System.out.println(a == b); //동일한지?
		System.out.println(a.equals(b)); //동등한지?
		//참조형은 .equals() 명령으로 비교해야한다.
	}

}
