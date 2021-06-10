package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//자바가 이해하지 못하는 예외를 강제로 지정해줘야 하는 경우가 있다.
		//= 강제 예외라고 한다
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정산금액 : ");
			int money = sc.nextInt();
			if(money < 0) {
				//실행을 멈추고 catch블록으로 집어 던지는 코드
				//throw new InputMismatchException();
				throw new InputMismatchException("정산금액은 음수일 수 없습니다. 입력값 : "+money);
			}
			
			System.out.print("인원수 : ");
			int people = sc.nextInt();
			if(people < 0) {
				throw new InputMismatchException("인원수는 음수로 설정할 수 없습니다");
			}
			
			sc.close();
			
			int pricePerPerson = money / people;
			int change = money % people;
			
			System.out.println("1인당 "+pricePerPerson+"원을 내야 합니다");
			System.out.println("잔돈 "+change+"원은 저희가 지원해 드려요!");
		}
		catch(Exception e){//Exception과 자식클래스들을 처리하는 블록
			e.printStackTrace();//개발용으로 사용
		}
		
	}
}

