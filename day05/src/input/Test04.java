package input;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 시간 : ");
		int start = sc.nextInt();
		System.out.print("종료 시간 : ");
		int end = sc.nextInt();
		sc.close();
		
		int startHour = start / 100;
		int startMinute = start % 100;
		int endHour = end / 100;
		int endMinute = end % 100;
		
		int time = (endHour * 60 + endMinute) - (startHour * 60 + startMinute);
		int timeHour = time / 60;
		int timeMinute = time % 60;
		
		System.out.println("이용시간 : " + timeHour + "시간" + timeMinute + "분");
		
		

	}

}
