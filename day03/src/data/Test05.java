package data;

import java.lang.*;

public class Test05 {
	public static void main(String[] args) {
		int hour1 = 10, minute1 = 20, second1 = 30;
		int hour2 = 15, minute2 = 10, second2 = 25;
		
		int start = hour1*60*60 + minute1*60 + second1;
		int end = hour2*60*60 + minute2*60 + second2;
		
		int hourTime = (end - start) / 60 / 60;
		int minuteTime = (end - start) / 60 % 60;
		int secondTime = (end - start) % 60;
		
		int price = hourTime * 1000;
		if(secondTime > 1) {
			price += 1000;
		}
		
		System.out.println(hourTime);
		System.out.println(minuteTime);
		System.out.println(secondTime);
		System.out.println(price);
		
		//반올림, 올림, 버림
		int puls = (minuteTime + secondTime + 99)/100;
		//int puls = (minuteTime + secondTime + 3599)/3600;
		//plus는 0 또는 1이 됨
		
		
		

	}

}
