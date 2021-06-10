package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Test07_3 {
	public static void main(String[] args) {
		//자바 1.8 이후부터는 close가 필요한 도구를 try에 합쳐서 사용할 수 있다.
		//= try~with 구문이라고 부른다
		//= close를 해야하는 도구가 필요한 특수한 상황에서만 사용한다 
		
		try (
			Scanner sc= new Scanner(System.in);// 이 도구는 자동으로 close 작업이 진행된다
		) {
			//입력
			System.out.print("이름 : ");
			String name = sc.next();
			String nameRegex = "^[가-힣]{2,7}$";
			if(!Pattern.matches(nameRegex, name)) {
				throw new InputMismatchException("이름은 2~7글자 한글로 입력하세요");
			}
			
			System.out.print("국어점수 : ");
			int korean = sc.nextInt();
			if(!(korean >= 0 && korean <= 100)) {
				throw new InputMismatchException("국어점수는 0~100 사이로 입력하세요");
			}
			
			System.out.print("영어점수 : ");
			int english = sc.nextInt();
			if(!(english >= 0 && english <= 100)) {
				throw new InputMismatchException("영어점수는 0~100 사이로 입력하세요");
			}
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			if(!(math >= 0 && math <= 100)) {
				throw new InputMismatchException("수학점수는 0~100 사이로 입력하세요");
			}
			
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


