package api.lang.string;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//given.charAt(2) == input.charAt(0) 
		// 왜 == 을 쓸까요?
		// 반환형이 char -> 원시형 데이터이기 때문에
		
//		쿵쿵따 1턴 구현
		
//		준비
		String given = "바나나";//제시어
		
		Scanner sc = new Scanner(System.in);
		System.out.println("제시어 : "+given);
		System.out.print("입력 : ");
		String input = sc.next();//사용자 입력
		sc.close();
		
//		계산
		boolean first = input.length() == 3;
		int position = given.length() - 1;
		boolean second = given.charAt(position) == input.charAt(0);
		
//		출력
		if(first && second) {
			System.out.println("쿵쿵따!");
		}
		else {
			System.out.println("게임오버!");
		}
		
	}
}