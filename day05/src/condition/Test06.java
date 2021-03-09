package condition;

import java.lang.*;
import java.util.*;

public class Test06 {
	public static void main(String[] args) {
		//Q : 지하철 요금 계산기
		//사용자에게 출생년도 4자리를 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년도 입력 : ");
		int year = sc.nextInt();
		sc.close();
		
		//나이를 계산 후 요금을 구하여 출력
		//Calendar.getInstance().get(Calendar.YEAR);
		int age = 2021 - year + 1;
		
		if(year > 1900 && year <= 2021) {
			
			System.out.print(age + "세의 지하철 요금은 ");
			if(age > 65 || age < 8) 
				System.out.println("무료");
			else if(age >= 20) 
				System.out.println("1250원");
			else if(age >= 14)
				System.out.println("720원");
			else if(age >= 8)
				System.out.println("450원");
		}
		else
			System.out.println("잘못된 입력");
		
	}

}
