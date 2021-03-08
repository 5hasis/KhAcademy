package condition;
import java.lang.*;
import java.util.*;
public class Test04_1 {
	public static void main(String[] args) {
		
//		여행사 홍보 프로그램
//		= 1일당 10만원으로 계산하고, 여름에 20% 특가 적용되도록 계산
		
//		입력 : 기간(일), 월(1~12)
		Scanner sc = new Scanner(System.in);
		System.out.println("여행갈 달을 입력하세요");
		int month = sc.nextInt();
		System.out.println("여행갈 기간을 일단위로 입력하세요");
		int days = sc.nextInt();
		sc.close();
		
		int pricePerDay = 100000;
		int rate = 20;
		
//		계산
//		= 계산과정이 상황마다 다르므로, 변수를 선언만 해두고 계산은 안에서 한다
//		= 모든 상황에서 계산이 이루어지지 않으면 사용이 불가능하다.
		int total;
		if(month / 3 == 2) {
			total = days * pricePerDay * (100 - rate) / 100;
		}
		else {
			total = days * pricePerDay;
		}
		
//		출력
//		= if와 else 모두 동일한 결과를 보여줘야 한다
//		= 출력은 한번만 하고, 계산을 나눠서 한다!
		System.out.println("예상 경비 : "+total+"원");
		
	}
}
