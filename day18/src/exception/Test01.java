package exception;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//예외(Exception)와 오류(Error)
		//- 오류 : 실행이 불가능하게 만드는 상황(100% 실행 불가)
		//- 예외 : 실행 이후에 발생하는 돌발 상황(오류가 날 수도, 안 날 수도 있다)
		
		//예외의 상황 : 사용자에게 숫자 2개를 입력받아서 나눗셈을 구현(1/n 계산기)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정산금액 : ");
		int money = sc.nextInt();
		
		System.out.print("인원수 : ");
		int people = sc.nextInt();
		
		sc.close();
		
		int pricePerPerson = money / people;
		int change = money % people;
		
		System.out.println("1인당 "+pricePerPerson+"원을 내야 합니다");
		System.out.println("잔돈 "+change+"원은 저희가 지원해 드려요!");
	}
}

