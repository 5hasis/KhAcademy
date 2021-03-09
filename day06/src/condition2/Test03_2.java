package condition2;

import java.lang.*;
import java.util.*;

public class Test03_2 {
	public static void main(String[] args) {
		//마지막 날짜 계산 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇월? ");
		int month = sc.nextInt();
		sc.close();
		
		int max;
		//계산
		switch(month) {
		case 2:
			max = 28;
			/*
			 * if(윤년이면){
			 *     max = 29;
			 * }
			 * else{
			 *     max = 28
			 * }
			 * */
			break;
		
		case 4: 
		case 6:
		case 9:
		case 11:
			max = 30;
			break;
			
		/*case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:*/
		default:
			max = 31;
			break;
		
		
		}

	}

}
