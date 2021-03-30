package api.collection3;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map<K, V>
		//=Set<K>에 값(V)이 붙은 형태
		//=세트 데이터 저장소
		
		//ex) 학생명과 점수를 저장하기 위한 Map을
		// K = key. 식별자. 유일해야하는 항목(중복 불가)
		// V = value. 데이터. 중복이 허용되는 항목
	
		//HashMap<String, Integer>
		Map<String, Integer> map = new HashMap<>();
		
		//추가 : .add()가 아니라 .put()
		map.put("피카츄", 80);
		map.put("라이츄", 77);
		map.put("파이리", 77);
		map.put("꼬부기", 95);
		
		//개수확인 : .size()
		System.out.println(map.size());
		
		//검색 : 항목이 두종류이므로 검색 명령도 두개
		//-containsKey() : key 검색
		//-containsValue() : value 검색
		System.out.println(map.containsKey("피카츄"));
		System.out.println(map.containsValue(100));
		
		//추출 : key를 이용해 value를 추출하는 것만 가능, 반대는 불가능
		System.out.println(map.get("피카츄"));
		System.out.println(map.get("야도란")); //null
		
		//int score = map.get("야도란"); //error! null은 int에 저장X
		Integer score = map.get("야도란");
		System.out.println("score = " + score);
		
		//삭제 : 반드시 key가 있어야함
		map.remove("라이츄");
		map.remove("라이츄", 77);
		
		
		//출력 
		System.out.println(map);
	}

}
