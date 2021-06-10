package api.lang.object;

//import java.lang.*;

public class Test01 {
	public static void main(String[] args) {
		//목표 : 자바 표준 API에 있는 java.lang.Object를 사용해보기
		
		//1.객체 생성
		Object a = new Object();
		Object b = new Object();
		
		//2.객체 사용
		//=hashCode() : 일련번호 반환(동일함을 판단하는 기준)
		System.out.println(a.hashCode()); //10진수
		System.out.println(b.hashCode());
		
		//= toString() : 객체의 요약 정보 반환
		System.out.println(a.toString()); //16진수
		System.out.println(b.toString());
		
	}

}
