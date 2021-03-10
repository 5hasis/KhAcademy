package loop2;

import java.lang.*;
import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		// 구구단 맞추기 게임
		
		Scanner sc = new Scanner(System.in);
		
		int a = 2, b = 1;
		
		int life = 0;
		int correct = 0;
		int i = 1;
		
		while(true) {
			//입력
			System.out.println(a + " X " + b + " = ?");
			int answer = sc.nextInt();
			
			//판정
			if(answer == a*b) {
				System.out.println("정답!");
				correct++;
			}
			else {
				life++;
				System.out.println("땡! 남은 기회는 " + (3-life) + "번");
			}
				
			//종료
			if(life == 3) {
				System.out.println("Game Over");
				break;
			}
				
			if(i == 9) {
				System.out.println("Game Clear");
				break;
			}
			
			//증가
			b++;
			
		}
		
		System.out.println("총 맞은 개수 : " + correct);
		sc.close();
	}

}
