package exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//예외 처리를 한 뒤 처리블록에서 기존의 예외 메세지(stack trace)를 보고 싶은 경우
		//= 오류를 추적하여 해결하기 위해서 위치정보를 봐야 할 경우가 발생한다
		//= 예외 객체를 이용하여 예외 메세지(stack trace)를 출력하도록 지시한다
		
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
			e.printStackTrace();//개발용으로 사용
		}
		
	}
}

