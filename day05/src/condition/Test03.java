package condition;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//그룹 조건
		//= 동시에 실행될 수 없는 조건
		//= if~else 로 표현하며, else에는 질문을 적으면 안됩니다
		
		//입력
		int num = 11;
		
		//계산
		//출력
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}
}