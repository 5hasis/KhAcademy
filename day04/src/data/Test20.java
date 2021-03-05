package data;

import java.lang.*;

public class Test20 {
	public static void main(String[] args) {
		int num = 20190503;
		
		int year =  num / 10000;
		int month = num % 10000 / 100 ;
		int date = num % 100 ;
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(date + "일");
		
		

	}

}
