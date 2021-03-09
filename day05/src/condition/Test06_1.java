package condition;
import java.util.Calendar;
import java.util.Scanner;
public class Test06_1 {
	public static void main(String[] args) {
		
		//지하철 요금 계산기
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일 8자리 입력");
		int birth = sc.nextInt();
		sc.close();
		
		//요금 계산
		int birthYear = birth / 10000;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - birthYear + 1;
		
		//int fare = 1250 or 720 or 450 or 0;
		int fare;
		if(age < 8 || age >= 65) {
			fare = 0;
		}
		else if(age >= 20) {
			fare = 1250;
		}
		else if(age >= 14) {
			fare = 720;
		}
		else {
			fare = 450;
		}
		
		//출력
		System.out.println("나이 : "+age+"세");
		System.out.println("요금 : "+ fare +"원");
		
		//이 프로그램은 fare에 최종 요금이 저장되기 때문에 확장성이 좋다
		
		//ex : 카드 보증금 500원 추가
		int card = 500;
		int result1 = fare + card;
		
		//ex : 5정류장당 100원씩 구간요금을 추가
		int stop = 9;
		int result2 = result1 + stop / 5 * 100;
		
		System.out.println("카드보증금 : "+card+"원");
		System.out.println("중간합계 : "+result1+"원");
		System.out.println("정류장 수 : "+stop);
		System.out.println("결제금액 : "+result2+"원");
		
	}
}