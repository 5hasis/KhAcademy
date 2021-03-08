package input;

import java.lang.*;
import java.util.*;
//import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//목표 : 도구(Scanner)를 이용한 입력 방법 살펴보기
		//= 기본적으로 제공되는 도구가 아니므로 만들어서 사용해야함
		
		//도구 생성 구문 : import 해야함
		Scanner sc = new Scanner(System.in); 
		//표준 입력 통로와 결합된 스캐너 생성! //참조형
		
		//[1] sc.next() : 띄어쓰기 전까지 문자열을 입력받아 String 형태로 저장
		String a = sc.next();
		System.out.println("a = " + a);
		
		//[2] .nextInt() : 띄어쓰기 전까지 숫자를 입력 받아 int 형태로 저장
		int b = sc.nextInt();
		System.out.println("b = " + b);
		
		//[3] .nextDouble()
		//[4] .nextFloat()
		
		//주의 : 다쓰고나면 내가 만든 도구는 정리해야함
		sc.close();
		
		
		
		
	}

}
