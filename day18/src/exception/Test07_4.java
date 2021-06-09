package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Test07_4 {
	public static void main(String[] args) {
		//자바 1.8 이후부터는 close가 필요한 도구를 try에 합쳐서 사용할 수 있다.
		//= try~with 구문이라고 부른다
		//= close를 해야하는 도구가 필요한 특수한 상황에서만 사용한다 
		
		try (
			Scanner sc= new Scanner(System.in);// 이 도구는 자동으로 close 작업이 진행된다
		) {
			
			Student stu = new Student();
			
			//입력
			System.out.print("이름 : ");
			String name = sc.next();
			stu.setName(name);//검사 + 설정 + 예외발생
			
			System.out.print("국어점수 : ");
			int korean = sc.nextInt();
			stu.setKorean(korean);//검사 + 설정 + 예외발생
			
			System.out.print("영어점수 : ");
			int english = sc.nextInt();
			stu.setEnglish(english);//검사 + 설정 + 예외발생
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			stu.setMath(math);//검사 + 설정 + 예외발생
			
			//출력
			System.out.println("이름 : "+stu.getName());
			System.out.println("총점 : "+stu.getTotal()+"점");
			System.out.println("평균 : "+stu.getAverage()+"점");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

