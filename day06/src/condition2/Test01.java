package condition2;

import java.lang.*;

public class Test01 {
	public static void main(String[] args) {
		//if구문의 2% 부족한 점과 보완 방법
		//=실행을 위한 과정이 다름
		//ex : 방향키를 입력 받아 처리하는 예제(2:아래, 4:왼쪽, 6:오른쪽, 8:위쪽)
		
		//입력
		int direction = 8;
		
		//출력
		if(direction == 2) {
			System.out.println("아래쪽으로 이동!");//검사횟수 1번
		}
		else if(direction == 4) {
			System.out.println("왼쪽으로 이동!");//검사횟수 2번
		}
		else if(direction == 6) {
			System.out.println("오른쪽으로 이동!");//검사횟수 3번
		}
		else {
			System.out.println("위쪽으로 이동!");//검사횟수 3번
		}

	}

}
