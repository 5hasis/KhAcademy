package api.util.scanner;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		String str = "빨강,주황,노랑,초록,파랑,남색,보라";
		
		Scanner sc = new Scanner(str);
		
		//구분자(delimiter)
		sc.useDelimiter(",");
		
		while(sc.hasNext()) {
			String word = sc.next();
			System.out.println("word = " + word);
		}
		
		sc.close();
	}

}
