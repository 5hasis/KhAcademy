package array;

import java.lang.*;
import java.util.*;

public class Test06 {
	public static void main(String[] args) {
		// int[] score = new int[10];
		//int[] score = {50, 65,77,82,90,90,59,72,85,88};
		
		//데이터 준비 : 생성과 초기화를 동시에(주의사항은 칸 수를 절대로 지정하면 안된다)
		int[] score = new int[] {50, 65, 77, 82, 90, 90, 59, 72, 85, 88};
		int sum = 0;
		int cnt = 0;
		
		//3. 80점인 학생의 반 예상 순위를 계산
		//= 80점보다 점수가 높은 사람 수 + 1
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int addScore = sc.nextInt();
		sc.close();
		
		//addScore = 80;
		int rank = score.length - 1;
		
		//1. 평균 = 합계 / 개수 = 합계 / score.length
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if(score[i] < 60)
				//2. 재평가자 인원수(60점 미만) - 카운트
				cnt += 1;
			if(score[i] < addScore)
				rank -= 1;
		}
		
		System.out.println("합계 : "+sum);
		double average = (double)sum / score.length;
		System.out.println("평균 : "+average);
		System.out.println("재시험 봐야할 인원 수 : " + cnt);
		System.out.println("80 점 몇등 ? " + rank);
		
		
		
		
		

	}

}
