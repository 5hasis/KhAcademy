package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03_1 {
	public static void main(String[] args) {
//		이번 주 로또번호 6개를 추첨하여 List에 저장한 뒤 출력
//		로또번호는 1부터 45 사이의 숫자 6개이며, 중복은 발생할 수 없습니다
		
//		Collection은 원시형 데이터를 저장할 수 없다.
		List<Integer> lotto = new ArrayList<>();
		
//		추가
		Random r = new Random();
		
//		복원추출 : 중복값이 나올 수 있다.
		while(lotto.size() < 6) {
			int number = r.nextInt(45) + 1;
			if(!lotto.contains(number)) {
				lotto.add(number);
			}
		}
		
//		출력
//		System.out.println(lotto);
		for(int i=0; i < lotto.size(); i++) {
			System.out.println(lotto.get(i));//lotto[i]
		}
		
	}
}
