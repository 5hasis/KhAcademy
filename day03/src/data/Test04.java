package data;

import java.lang.*;

public class Test04 {

	public static void main(String[] args) {
		//시간 계산
		//Q : 1시간 50분 + 2시간 30분 = ?시간 ?분
		
		//입력값
		int hour1 = 1;
		int minute1 = 50;
		int hour2 = 2;
		int minute2 = 30;
		
		//계산
		int time1 = hour1 * 60 + minute1;
		int time2 = hour2 * 60 + minute2;
		int total = time1 + time2;
		
		int hour = total / 60;
		int minute = total % 60;
		
		//결과
		System.out.println(hour);
		System.out.println(minute);
	}

}
