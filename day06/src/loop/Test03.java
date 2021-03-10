package loop;
import java.lang.*;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		//Q : 사용자에게 5명의 이름을 입력받아 화면에 출력
		//= 1번을 먼저 만들도록 연습!
		//= 1번 입력받아 출력하는 코드를 만들고 반복 처리
		
		//= 통로가 닫히면 다시 열 수 없어서 오류가 발생
		//= 도구는 가급적 바깥에 만들도록 한다
		Scanner sc = new Scanner(System.in);
		
		//for(int i=1 ; i<=5 ; i=i+1) {
		for(int i=0 ; i<5 ; i=i+1) {
			System.out.print("이름 입력 : ");
			String name = sc.next();
			
			System.out.println("입력한 이름 : "+name);
		}
		
		sc.close();
		
	}
}