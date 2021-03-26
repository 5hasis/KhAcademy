package api.util.random;

import java.util.Random;

public class Test03_1 {
	public static void main(String[] args) {
		//시간외의 정보(일련번호 등)를 합쳐줘야 다른 사람들과 otp 번호가 겹칠 일이 없음
		String id1 = "khacademy"; //고유값(아이디)
		String id2 = "admin";
		
		Random r = new Random();
		
		while(true) {
			long current = System.currentTimeMillis() / 10000; //10초동안
			
			r.setSeed(current + id1.hashCode()); //시간 + 아이디의 해시코드를 seed로 설정
			int otp1 = r.nextInt(1000000) + 0; //000000 ~ 999999
			
			r.setSeed(current + id2.hashCode()); //시간 + 아이디의 해시코드를 seed로 설정
			int otp2 = r.nextInt(1000000) + 0; //000000 ~ 999999
			
			System.out.println("current : " + current + "otp1 : " + otp1 + "otp2 : " + otp2);
			
		}
	}
}
