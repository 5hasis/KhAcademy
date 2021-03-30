package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test04_1 {
	public static void main(String[] args) {
//		투표 프로그램
		// 숫자 or 이름 아무거나 선택해도 가능하게

//		1. 저장소 생성
		Map<String, Integer> map = new HashMap<>();
		Map<Integer, String> nameMap = new TreeMap<>();

//		2. 사전 데이터 추가
		nameMap.put(1, "임영웅");
		nameMap.put(2, "아이유");
		nameMap.put(3, "장범준");
		nameMap.put(4, "BTS");
		nameMap.put(5, "폴킴");

		map.put(nameMap.get(1), 0);
		map.put(nameMap.get(2), 0);
		map.put(nameMap.get(3), 0);
		map.put(nameMap.get(4), 0);
		map.put(nameMap.get(5), 0);

//		3 -> 4 -> 5를 반복
		Scanner sc = new Scanner(System.in);
		while (true) {
//			3. 출력 : 저장소의 key를 반복으로 출력
			System.out.println("<경연 투표>");
			Set<Integer> set = nameMap.keySet();
			for (int no : set) {
				System.out.println(no + " - " + nameMap.get(no));
			}

//			4. 입력
			System.out.print("입력 : ");
			String input = sc.nextLine();

//			종료조건
//			if(input == "그만") {
			if (input.equals("그만")) {
				break;
			}

			input = input.trim().toUpperCase();

			// 숫자일지 글자일지 모르니까 숫자를 먼저 검사해서 문자열로 변경
			try {
				int num = Integer.parseInt(input);
				input = nameMap.get(num);
			} catch (Exception e) {
			}

//			5. 투표 가능여부 판정
//			if(map의 이름 중에 input이 존재한다면) {
			if (map.containsKey(input)) {
				// 실제 투표수가 올라가는 코드
				int count = map.get(input);
				map.put(input, count + 1);
				System.out.println("투표가 완료되었습니다");
				System.out.println("[" + input + "] 현재 득표수 : " + map.get(input));
			} else {
				System.out.println("투표할 수 없는 이름입니다");
			}
		}

		sc.close();

//		종료 후 전체 목록 출력
		System.out.println("투표가 완료되었습니다");
		System.out.println("<투표 결과>");
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue() + "표");
		}
	}
}
