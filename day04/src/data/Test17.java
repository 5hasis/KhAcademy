package data;

import java.lang.*;

public class Test17 {
	public static void main(String[] args) {
		int subject1 = 50;
		int subject2 = 51;
		double average = (double)(subject1 + subject2) / 2;
		
		boolean pass = subject1 >= 40 && subject2 >=40 && average >= 60;
		
		//System.out.println(average);
		System.out.println("해당 과목을 이수하였습니까?");
		System.out.println(pass);

	}

}
