package loop3;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		//Test01을 while로 대체
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("나이 입력");
			int age = sc.nextInt();
			
			if(age > 0 && age <= 150) {
				System.out.println("입력한 나이 : "+age+"세");
				break;
			}

		}
		
		sc.close();
	}
}