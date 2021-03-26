package api.text.format;

import java.text.DecimalFormat;
import java.text.Format;

public class Test01 {
	public static void main(String[] args) {
//		DecimalFormat : 숫자 표시 형식을 변환
//		- # : 숫자(없으면 출력을 안함)
//		- 0 : 숫자(없어도 0으로 출력함)
		
		double a = 123456.789;
		
		System.out.println(a);
		
		Format f1 = new DecimalFormat("#####.##");
		System.out.println(f1.format(a));
		
		Format f2 = new DecimalFormat("00000.00");
		System.out.println(f2.format(a));
		
		Format f3 = new DecimalFormat("0.00");
		System.out.println(f3.format(a));
		
		long b = 1234567890123456789L;
		
		System.out.println(b);
		
		Format f4 = new DecimalFormat("#,###");
		System.out.println(f4.format(b));
	}
}