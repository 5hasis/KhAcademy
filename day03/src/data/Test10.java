package data;

import java.lang.*;

public class Test10 {
	public static void main(String[] args) {
		// 타율 : 안타수(홈런포함) / 타수
		int tasu = 120;
		int anta = 25;
		int homerun = 11;
		
		double tayul = 1.0 * (anta + homerun) / tasu;
		System.out.println(tayul);

	}
}
