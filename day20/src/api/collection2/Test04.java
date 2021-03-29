package api.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		//set만 할 수 있는 계산
		//=서로 다른 두 집합간의 연산 ex)합집합, 교집합, 차집합
		
		//Set을 왜 쓸까? -> 중복이 필요 없는 경우, 집합 계산
		Set<Integer> a = new TreeSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Set<Integer> b = new TreeSet<>();
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		
		//합집합 : 새로운 Set을 만들어서 a와 b를 모두 추가
		Set<Integer> c = new TreeSet<>();
		c.addAll(a); //c에 a를 모두 추가
		c.addAll(b); //c에 b를 모두 추가
		System.out.println(c);
		
		//교집합 : 새로운 Set을 만들어서 계산. retainAll()
		Set<Integer> d = new TreeSet<>();
		d.addAll(a); //d에 a를 모두 추가
		d.retainAll(b); //d에 b를 교집합 연산
		System.out.println(d);
		
		//차집합 : removeAll()
		Set<Integer> e = new TreeSet<>(a); //a를 추가하면서 e를 생성
		e.removeAll(b); //e에서 b에 포함된 항목을 삭제(e-b)
		System.out.println(e);
		
		
	}
}
