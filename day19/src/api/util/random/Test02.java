package api.util.random;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {

		// Random 클래스는 추첨할때마다 seed가 바뀌기 때문에 랜덤값이 추첨됨
		// = seed를 바꾸지 않으면 아무리 복잡한 계산을 해도 같은 값이 나온다

		// 의도적으로 Random 클래스의 seed를 통일하면 동일한 결과가 나오게 할 수 있다.
		// = 특정 시점동안 seed를 통일시켜 원하는 로직을 구현할 수 있다.(ex : OTP)

		Random r = new Random();

		r.setSeed(1L);
		System.out.println(r.nextInt(6) + 1);

		r.setSeed(1L);
		System.out.println(r.nextInt(6) + 1);

		r.setSeed(1L);
		System.out.println(r.nextInt(6) + 1);

		r.setSeed(1L);
		System.out.println(r.nextInt(6) + 1);
	}
}
