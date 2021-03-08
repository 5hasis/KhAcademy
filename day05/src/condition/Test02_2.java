package condition;
import java.lang.*;
import java.util.Scanner;
public class Test02_2 {
	public static void main(String[] args) {
		//Q : 사용자에게 소지금을 입력받아 주문 가능한 메뉴를 출력
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("소지금을 입력하세요");
		int money = sc.nextInt();
		sc.close();
		
		//계산 + 출력
		//= 구문이 하나밖에 없다면 { } 를 생략할 수 있다.
		//= 추천하지 않음(구문 파악이 어려워짐)
		System.out.println("추천 메뉴");
		if(money >= 3000)
			System.out.println("떡볶이(3000원)");
		if(money >= 5000) 
			System.out.println("자장면(5000원)");
		if(money >= 7000) 
			System.out.println("오므라이스(7000원)");
		if(money >= 15000) 
			System.out.println("치킨(15000원)");
	}
}