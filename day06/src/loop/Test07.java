package loop;

import java.lang.*;

public class Test07 {
	public static void main(String[] args) {
		//한달 푸시업 개수
		//= 변수를 활용하여 누적계산을 수행
		
		int pushup = 30;
		int cnt = 0;
		
		for(int i = 1; i <= 30; i++) {
			System.out.println(i+"일 : "+pushup);
			cnt += pushup;
			pushup += 3;
		}
		System.out.println("총 푸시업 개수 : " + cnt);
		
	}

}
