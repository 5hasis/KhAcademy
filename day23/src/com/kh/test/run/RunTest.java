package com.kh.test.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RunTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("출력 횟수 : ");
		int a = sc.nextInt();
		sc.close();

		//출력 횟수만큼 반복
		for (int k = 0; k < a; k++) {
			Set<Integer> set = new HashSet<>();

			Random r = new Random();
			
			//해시셋에 랜덤값 저장
			while (true) {
				if(set.size()==6) break;
				int num = r.nextInt(45) + 1;
				set.add(num);
			}

			
			
			//해시셋 리스트로 변환
			List<Integer> list = new ArrayList<>(set);
			
			//리스트 랜덤 중복 없이 생성
//			for(int i = 0; i < 6; i++) {
//				
//				int rnd = r.nextInt(45) + 1; 
//				list.add(rnd);
//				
//				for(int j = 0; j < i; j++) {
//					if(list.get(i).equals(list.get(j))) {
//						list.remove(i);
//						i--;
//					}
//				}
//			}

			//오름차순 정렬
			for (int i = 0; i < list.size() - 1; i++) {
				int min = i;
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(min) > list.get(j)) {
						min = j;
					}
				}
				int temp = list.get(min);
				list.remove(min);
				list.add(min, list.get(i));
				list.remove(i);
				list.add(i, temp);
			}
			
			Collections.sort(list);
			
			//출력
			System.out.println(list);
		}
	}

}
