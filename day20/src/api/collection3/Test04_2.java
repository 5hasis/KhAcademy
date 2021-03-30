package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test04_2 {
	public static void main(String[] args) {
//		투표 프로그램
		
//		1. 저장소 생성
		//Singer라는 클래스를 따로 생성하여 설정
		Map<Singer, Integer> map = new HashMap<>();
		
//		2. 사전 데이터 추가
		map.put(new Singer("임영웅"), 0);
		map.put(new Singer("아이유"), 0);
		map.put(new Singer("장범준"), 0);
		map.put(new Singer("BTS"), 0);
		map.put(new Singer("폴킴"), 0);
		
//		3 -> 4 -> 5를 반복
		Scanner sc = new Scanner(System.in);
		while(true) {
//			3. 출력 : 저장소의 key를 반복으로 출력
			System.out.println("<경연 투표>");
			Set<Singer> set = map.keySet();
			for(Singer singer : set) {
				System.out.println("- "+singer.getName());
			}
			
//			4. 입력
			System.out.print("입력 : ");
			String input = sc.nextLine();
			
//			종료조건
//			if(input == "그만") {
			if(input.equals("그만")) {
				break;
			}
			
			input = input.trim().toUpperCase();	
			
//			5. 투표 가능여부 판정
			Singer find = new Singer(input);
//			if(map의 이름 중에 input이 존재한다면) {
			if(map.containsKey(find)) {
				//실제 투표수가 올라가는 코드
				int count = map.get(find);
				map.put(find, count + 1);
				System.out.println("투표가 완료되었습니다");
				System.out.println("["+input+"] 현재 득표수 : " + map.get(find));
			}
			else {
				System.out.println("투표할 수 없는 이름입니다");
			}
		}
		
		sc.close();
		
//		종료 후 전체 목록 출력
		System.out.println("투표가 완료되었습니다");
		System.out.println("<투표 결과>");
		for(Entry<Singer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey().getName() + " : " + entry.getValue() + "표");
		}
	}
}
