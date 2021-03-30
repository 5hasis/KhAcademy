package api.collection3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		// 투표 프로그램
		Map<String, Integer> singer = new HashMap<>();

		singer.put("임영웅", 0);
		singer.put("아이유", 0);
		singer.put("장범준", 0);
		singer.put("BTS", 0);
		singer.put("폴킴", 0);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("입력 : ");
			String vote = sc.nextLine().trim().toUpperCase();
			
			if(vote.equals("그만")){
				System.out.println("투표를 종료합니다.\n");
				break;
			}
			else if (singer.containsKey(vote)) {
				singer.replace(vote, singer.get(vote) + 1);
				System.out.print("[" + vote + "] 투표 완료되었습니다.");
				System.out.println(" 현재 득표수 " + singer.get(vote));
				System.out.println();
			} 
			else if (!singer.containsKey(vote)) {
				System.out.println("[" + vote + "]는 투표하실 수 없습니다.\n");
			} 
			
		}
		sc.close();
		
		System.out.println("<투표 결과>");
		//1.
		Set<String> set = singer.keySet();
		for (String name : set) {
			System.out.print("- " + name + " : " + singer.get(name) + "표\n");
		}
		
//		2.
//		Set<String> set = singer.keySet();
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println("-" + iter.next());
//		}
		
		
//		3.
//		for(Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue() + "표");
//		}

	}
}
