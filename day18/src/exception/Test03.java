package exception;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//예외의 통합 처리가 가능한가?
		//= 상속과 다형성을 사용하여 통합 예외 처리 블록을 만들어본다
		//= 특별한 상황이 아니라면 catch 블록에는 Exception을 처리할 수 있도록 구성하면 통합이 가능
		
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
			System.err.println("오류 발생!");
		}
		
	}
}

