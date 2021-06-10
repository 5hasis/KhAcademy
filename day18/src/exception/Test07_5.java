package exception;

import java.util.Scanner;

public class Test07_5 {
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
			
			System.out.print("국어점수 : ");
			int korean = sc.nextInt();
			
			System.out.print("영어점수 : ");
			int english = sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
			//객체 생성을 나중에 해도 된다
			Student stu = new Student(name, korean, english, math);
			
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

