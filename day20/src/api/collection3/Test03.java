package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
		//저장소의 모든 key,value를 출력
		//Map은 자페적으로 전체 출력하는 방법이 없음
		//1.key만 Set으로 추출하여 출력하는 방법
		//2.EntrySet을 이용하는 방법
		
		Map<String, Integer> map = new HashMap<>();

		map.put("피카츄", 80);
		map.put("라이츄", 77);
		map.put("파이리", 77);
		map.put("꼬부기", 95);
		
//		1. Map<String, Integer> → Set<String> → Iterator<String> 또는 확장 for
		Set<String> set = map.keySet();
		for(String name : set) {
			System.out.println("이름 = " + name);
			System.out.println("점수 = " + map.get(name));
		}
		
//		2. 
		Set<Entry<String, Integer>> entrys = map.entrySet();
		for(Entry<String, Integer> entry : entrys) {
			System.out.println("이름 = " + entry.getKey());
			System.out.println("점수 = " + entry.getValue());
		}
		
	}
}
