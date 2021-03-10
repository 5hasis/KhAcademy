package loop2;
import java.util.Scanner;
public class Test04_2 {
	public static void main(String[] args) {
		//콤보 추가
		//= 콤보는 정답일 경우 늘어나는 카운트, 오답이면 초기화
		Scanner sc = new Scanner(System.in);
		
		int combo = 0;
		int score = 0;
		int correct = 0;
		int a = 6 , b = 1;
		int life = 3;
		while(true) {
			//입력
			System.out.print(a + " X " + b + " = ");
			int user = sc.nextInt();
			
			//판정
			if(a * b == user) {//정답인 경우
				correct++;
				combo++;
				if(combo >= 2) {
					System.out.println(combo+"콤보!");
				}
				//score += 10;
				if(a >= 6 && b >= 3) {
					score += 25;
				}
				else {
					score += 10;
				}
			}
			else {
				System.out.println("땡");
				combo = 0;
				life --;
				System.out.println("남은 목숨 : "+life+"개");
			}
			
			//종료 : (1 : X9 까지 다 맞춘 경우) , (2: 목숨이 0인 경우)
			if(b == 9) {
				System.out.println("Game Clear!");
				break;
			}
			if(life == 0) {
				System.out.println("Game Over...");
				break;
			}
			
			//증가
			b++;
		}
		
		sc.close();
		
		System.out.println("정답 개수 : " + correct);
		System.out.println("점수 : "+score+"점");
		
	}
}