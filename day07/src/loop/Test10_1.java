package loop;

import java.lang.*;
import java.util.*;

public class Test10_1 {
	public static void main(String[] args) throws InterruptedException {
		// 타이머 만들기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분 입력 : ");
		int minute = sc.nextInt();
		System.out.print("초 입력 : ");
		int second = sc.nextInt();
		sc.close();
		
		int time = minute * 60 + second;
		
		//time 부터 1까지 감소하는 반복문
		for(int i = time; i > 0; i--) {
			int m = i / 60, s = i % 60;
			System.out.println(m + "분" + s + "초 후 알람이 울립니다");
			
			//1초 정지(지연) 코드
			Thread.sleep(1000L);
			
		}
		
		System.out.println("띠링띠링~");
	}

}
