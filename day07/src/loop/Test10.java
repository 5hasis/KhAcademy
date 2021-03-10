package loop;

import java.lang.*;
import java.util.*;

public class Test10 {
	public static void main(String[] args) {
		// 타이머 만들기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분 입력 : ");
		int minute = sc.nextInt();
		System.out.print("초 입력 : ");
		int second = sc.nextInt();
		sc.close();
		
		//int time = minute * 60 + second;
		for(int i = minute; i >= 0; i--) {
			for(int j = second; j > 0; j--)
			System.out.println(i + "분" + j + "초 후 알람이 울립니다");
			second = 59; // 초기화
			
		}
		
		System.out.println("띠링띠링~");
	}

}
