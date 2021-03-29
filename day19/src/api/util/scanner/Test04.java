package api.util.scanner;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

//		문장 읽기
		
		String song = "떳다떳다 비행기\n날아라 날아라\n떳다떳다 비행기\n우리 비행기";
//		System.out.println(song);
		
		Scanner sc = new Scanner(song);
		
		while(sc.hasNextLine()) {
			String word = sc.nextLine();
			System.out.println(word);
		}
		
		sc.close();
		
	}

}
