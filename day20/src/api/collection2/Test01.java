package api.collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//Set : 순서가 내부적으로 정해져 있는 저장소
		//=TreeSet 과 HashSet
		//=빠른 전체 조회를 하기 위해서 사용(일괄처리용)
		//=개별적인 처리는 불가, index 개념이 없음
		
		//TreeSet<Integer> set = new TreeSet<>();
		//Set<Integer> set = new TreeSet<>(); //업-캐스팅
		Set<Integer> set = new HashSet<>(); 
		
		//추가 : add()
		set.add(25);
		set.add(10);
		set.add(32);
		set.add(43);
		set.add(29);
		set.add(5);
		set.add(17);
//		set.add(32); //중복제거
		
		//개수확인 : size()
		System.out.println(set.size());
		
		//검색 : contains()
		System.out.println(set.contains(10));
		
		//출력
		System.out.println(set);
		
		//삭제 : remove()
		set.remove(29);
		System.out.println(set);
	}
}
