package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03_4 {
	public static void main(String[] args) {
		//비복원추출 : 중복이 나올 수 없도록 한번 추첨한 번호는 제거
		
		//1. List를 만들고 1부터 45까지 추가한다.
		List<Integer> lotto = new ArrayList<>();
		
		for(int i=1; i<=45; i++) {
			lotto.add(i);
		}
		
		System.out.println(lotto);
		
		//2. List의 데이터를 무작위로 섞는다.
		Collections.shuffle(lotto);
		System.out.println(lotto);
		
		//3. 0번위치부터 6개를 분할하여 List로 만든다
		List<Integer> current = lotto.subList(0, 6);
		System.out.println(current);
		
		//4. 정렬
		Collections.sort(current);
		System.out.println(current);
	}
}

