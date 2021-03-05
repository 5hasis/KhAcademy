package data;

import java.lang.*;

public class Test11 {
	public static void main(String[] args) {
		int height = 180; //cm
		int weight = 80; //kg
		
		//몸무게(kg) / 키*키(m)
		double bmi = weight / (height/100.0 * height/100.0);
		System.out.println(bmi);
	}

}
