package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		// 저장소 생성
		Set<Integer> lotto = new TreeSet<>();

		// 데이터 추가
		Random r = new Random();

		while (lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);

		}

		// 출력
		System.out.println(lotto);

	}
}
