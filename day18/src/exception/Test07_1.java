package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test07_1 {
	public static void main(String[] args) {
		//모든 경우에 Scanner는 close가 되어야 하기 때문에 모든 경우에 코드를 추가한다
		//= 복잡하고 번거로워진다
		
		try {
			//입력
			Scanner sc= new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.next();
			String nameRegex = "^[가-힣]{2,7}$";
			if(!Pattern.matches(nameRegex, name)) {
				sc.close();
				throw new InputMismatchException("이름은 2~7글자 한글로 입력하세요");
			}
			
			System.out.print("국어점수 : ");
			int korean = sc.nextInt();
			if(!(korean >= 0 && korean <= 100)) {
				sc.close();
				throw new InputMismatchException("국어점수는 0~100 사이로 입력하세요");
			}
			
			System.out.print("영어점수 : ");
			int english = sc.nextInt();
			if(!(english >= 0 && english <= 100)) {
				sc.close();
				throw new InputMismatchException("영어점수는 0~100 사이로 입력하세요");
			}
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			if(!(math >= 0 && math <= 100)) {
				sc.close();
				throw new InputMismatchException("수학점수는 0~100 사이로 입력하세요");
			}
			
			sc.close();
			
			//계산
			int total = korean + english + math;
			double average = total / 3.0;
			
			//출력
			System.out.println("이름 : "+name);
			System.out.println("총점 : "+total+"점");
			System.out.println("평균 : "+average+"점");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

