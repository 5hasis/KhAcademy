package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//통합 처리된 예외의 분리방법
		//= 예외 객체인 e 를 활용하여 통합된 예외의 구별이 가능
		
		try {
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
		catch(Exception e){//Exception과 자식클래스들을 처리하는 블록
//			System.out.println(e);
//			System.out.println(e.getClass());//클래스 정보
			System.err.println("오류 : "+e.getMessage());//원인 정보
		}
		
	}
}

