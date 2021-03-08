package condition;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		//목표 : 다중 그룹 조건(이 중에 하나)
		
		//성적 분류기
		//1. 점수를 입력받아 성적을 분류하여 출력
		//2. A등급(90~100점) , B등급(70~89점) , C등급(0~69점)
		
		//한 번의 질문으로 등급을 파악할 수 없다.
		//= 두 번 질문하여 if else로 구분하여 처리한다.
		
		//입력
		int score = 50;
		
		//계산+출력
		if(score >= 90) //A등급인가?
			System.out.println("A등급");
		
		else if(score >= 70) {
			System.out.println("B등급");
		}
		else 
			System.out.println("C등급");
		
	}
}
