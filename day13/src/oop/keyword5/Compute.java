package oop.keyword5;

public class Compute {
	//1.곱셈
	public static int multiple(int a, int b) {
		return a * b;
	}
	
	//2.제곱
	public static int square(int a) {
		return a * a;
		//return multiple(a, a)
	}
	
	//3.삼각형의 넓이
	public static double triangle(int a, int b) {
		return a * b * 0.5;
		//return multiple(a, b) / 2f
	}
	
	//4.원의 넓이
	public static double circle(int a) {
		return a * a * 3.14;
		//return 3.14f * square(a)
	}
	
}
