package condition;
import java.lang.*;
import java.util.Scanner;
public class Test02_1 {
	public static void main(String[] args) {
		//Q : 사용자에게 소지금을 입력받아 주문 가능한 메뉴를 출력
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("소지금을 입력하세요");
		int money = sc.nextInt();
		sc.close();
		
		//계산
		boolean ttobbokki = money >= 3000;
		boolean omrais = money >= 5000;
		boolean jajang = money >= 7000;
		boolean chicken = money >= 15000;
		
		//출력
		// a == true 에서 == true 는 *1 , +0과 같이 의미 없는 코드이다.
		System.out.println("추천 메뉴");
		if(ttobbokki){
			System.out.println("떡볶이(3000원)");
		}
		if(omrais) {
			System.out.println("자장면(5000원)");
		}
		if(jajang) {
			System.out.println("오므라이스(7000원)");
		}
		if(chicken) {
			System.out.println("치킨(15000원)");
		}
	}
}