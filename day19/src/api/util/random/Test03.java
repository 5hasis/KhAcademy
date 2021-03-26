package api.util.random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		Random r = new Random();
		
		while(true) {
			long current = System.currentTimeMillis() / 10000; //10초동안
			r.setSeed(current); //시간을 seed로 설정
			int otp = r.nextInt(1000000) + 0; //000000 ~ 999999
			System.out.println("current : " + current + "otp : " + otp);
			
			//시간외의 정보(일련번호 등)를 합쳐줘야 다른 사람들과 otp 번호가 겹칠 일이 없음
		}
	}
}
