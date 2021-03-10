package loop2;

import java.lang.*;
import java.util.*;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int cnt = 0;
		
		int i = 0;
		while(true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			if(cnt + num > 100) 
				// 기존 합계와 입력값을 더한 값이 100이 넘으면 탈출
				break;
			
			cnt += num;
			
			System.out.println("총 합계 : " + cnt);
			i++;
		}		
		
		sc.close();
		System.out.println("총 입력 횟수 : " + i);
	}
}
