package array;

import java.lang.*;

public class Test04 {
	public static void main(String[] args) {
		// 
		int day = 10;
		int[] pushup = new int[day];
		int first = 10;
		
		for(int i = 0; i < day; i++) {
			pushup[i] = first;
			first += 3;
			System.out.println((i+1) + "일차 : " + pushup[i]);
		}
		
		
	}

}
