package api.lang.object;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//Q. Object가 최상위 클래스면 어떤 객체든 Object 리모컨으로 참조가 가능하지 않을까?
		//업캐스팅이 가능하지 않을까?
		//-> 저장할 대상이 불확실할 때, Object 형태로 관리할 수 있다. (실제 사용은 어렵고 저장만)
		//= '아무거나'에 해당하는 역할을 수행할 수 있음
		
		Object a = 10;
		Object b = "Hello";
		Object sc = new Scanner(System.in);
		Object d = 3.14;
		Object r = true;
		
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		
		System.out.println(a instanceof Integer);//a가 Integer 형태인지?
		System.out.println(b instanceof String); //b가 String 형태인지?
	}
}
