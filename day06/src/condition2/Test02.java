package condition2;

import java.lang.*;

public class Test02 {
	public static void main(String[] args) {
		//Test01의 문제점을 해결하기 위한 예제
		//= switch~case 구문은 한 번의 이동으로 해당지점을 탐색
		//= 탐색한 지점부터 종료시까지 쭉 실행된다
		//= 멈추고 싶으면 break 키워드를 사용하라!(구문 탈출 키워드)
		
		//입력
		int direction = 4;
		
		//출력
		switch(direction) {
		case 2:
			System.out.println("아래쪽으로 이동!");		
			break;
		case 4:
			System.out.println("왼쪽으로 이동!");
			break;
		case 6:
			System.out.println("오른쪽으로 이동!");
			break;
		//case 8:
		default:
			System.out.println("위쪽으로 이동!");
			break;
		}
		
	}
}