package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03_2 {
	public static void main(String[] args) {
		//비복원추출 : 중복이 나올 수 없도록 한번 추첨한 번호는 제거
		
		//1. List를 만들고 1부터 45까지 추가한다.
		List<Integer> lotto = new ArrayList<>();
		
		for(int i=1; i<=45; i++) {
			lotto.add(i);
		}
		
		System.out.println(lotto);
		
		//2. 무작위로 위치를 정하여 하나의 번호를 뽑고 저장소에서 해당 위치를 삭제한다.
		Random r = new Random();
		
		for(int i=0; i < 6; i++) {
			int index = r.nextInt(lotto.size()/*개*/) + 0/*부터*/;
			int number = lotto.get(index);
			System.out.println("number = " + number);
			lotto.remove(index);
		}
	}
}
