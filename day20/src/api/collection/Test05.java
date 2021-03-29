package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//사다리 게임
		
//		1. 저장소 2개 생성
		List<String> names = new ArrayList<>();
		List<String> events = new ArrayList<>();
		
//		2. 데이터 추가
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int people = sc.nextInt();
		sc.nextLine();//엔터 버리기
		
		for(int i=0; i < people; i++) {
			System.out.print("이름 : ");
			names.add(sc.nextLine());
		}
		
		for(int i=0; i < people; i++) {
			System.out.print("항목 : ");
			events.add(sc.nextLine());
		}
		
		sc.close();
		
//		3. 셔플
		Collections.shuffle(events);
		
//		4. 출력
		for(int i=0; i < people; i++) {
			System.out.println(names.get(i) + " → " + events.get(i));
		}
		
	}
}