package api.collection2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
		//Q. Set의 출력은 어떻게?
		//1. Iterator 사용 -> .iterator()
		//1)잔여 데이터 유뮤 : .hasNext() 2)데이터추출 : .next()
		
		//2. 확장 for 사용
		
		Set<String> set = new HashSet<>();
		
		set.add("자바");
		set.add("파이썬");
		set.add("C++");
		set.add("안드로이드");
		set.add("ios");
		
		System.out.println(set);
		
		//1.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
		}
		
		//2.
		for(String item : set) { //set 저장소의 요소(element)들을 한바퀴에 하나씩 item에 저장
			//일부만 반복하는것은 불가능
			//Iterable 인터페이스의 자식은 모두 가능(배열, List, Set, ...)
			//반복수 i를 사용하지 않으르모 index를 알 수 없음
			System.out.println(item);
		}
		
	}
}
