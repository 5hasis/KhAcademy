package api.util.scanner;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//Scnnaer에서 .next()와 .nextLine()을 섞어서 사용할 경우의 문제
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어 입력 : ");
		String word = sc.next();
		sc.nextLine(); // '\n'버리기...
		
		System.out.println("문장입력 : ");
		String line = sc.nextLine();
		
		sc.close();
		
		System.out.println("단어 : " + word);
		System.out.println("문장 : " + line);
	}

}
