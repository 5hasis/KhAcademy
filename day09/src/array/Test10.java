package array;

//import java.lang.*;

public class Test10 {
	public static void main(String[] args) {
		//데이터 교체(맞교환)
		
		int a = 10, b = 20;
		
		//Q : a와 b의 값을 서로 교체(swap) 하려면 어떻게 해야 하는가?
		//= 자바는 맞교환이 불가능하다
		//= 임시로 변수 1개를 추가하여 교환한다
		int c = a;
		a = b;
		b = c;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}