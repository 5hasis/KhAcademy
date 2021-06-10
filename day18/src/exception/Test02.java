package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
//		발생하는 예외 정리
//		1. java.util.InputMismatchException : 잘못된 입력 시
//		2. java.lang.ArithmeticException : 0으로 나눗셈을 할 경우
		
//		try 블록을 만들어서 문제가 될 소지가 있는 영역을 감시(CCTV)
//		catch 블록을 만들어서 발생한 문제에 대해 처리를 수행(경찰서 or 감옥)
		
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
		catch(InputMismatchException e){//InputMismatchException 처리블록
			System.err.println("똑바로 입력하자 ^^");
		}
		catch(ArithmeticException e) {//ArithmeticException 처리블록
			System.err.println("인원은 왜 없니~");
		}
		
	}
}

