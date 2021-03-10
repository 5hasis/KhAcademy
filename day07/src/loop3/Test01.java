package loop3;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		//do~while 반복문
		//= 최초 1회 실행 후 추가 실행 여부를 확인하여 반복하는 구문
		//= ex : 사용자에게 나이를 입력받는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int age;
		do {
			System.out.println("나이 입력");
			age = sc.nextInt();
		}
		while(age <= 0 || age > 150);

		sc.close();
		System.out.println("입력한 나이 : "+age+"세");
	}
}