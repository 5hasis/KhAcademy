package data;

import java.lang.*;

public class Test19 {
	public static void main(String[] args) {
		//문자열 : 문자가 여러개 모여있는 것
		//문자하나당 2byte로 계산
		//장점 : 저장공간을 효율적으로 쓸 수 있음. 만드는 김에 여러 기능 추가 가능
		//단점 : 만드는데 시간이 오래걸림
		
		//이러한 형태의 데이터를 "참조형" 데이터라고 부름(Reference type)
		String a = "hello";
		System.out.println(a);
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.charAt(0));
		
		//문자열 특징 : +를 이용하면 연결된다. 어떤 형태와 더해도 문자열이 된다
		System.out.println(a + "goodbye");
		System.out.println(a + 100);
		
		

	}

}
