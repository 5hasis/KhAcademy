package api.util.scanner;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		String str = "빨강 주황 노랑 초록 파랑 남색 보라";
		
		Scanner sc = new Scanner(str);
		
		System.out.println(sc.hasNext());
		String word = sc.next();
		System.out.println("word = " + word);
		
		System.out.println(sc.hasNext());
		word = sc.next();
		System.out.println("word = " + word);
		
		System.out.println(sc.hasNext());
		word = sc.next();
		System.out.println("word = " + word);
		
		System.out.println(sc.hasNext());
		word = sc.next();
		System.out.println("word = " + word);
		
		System.out.println(sc.hasNext());
		word = sc.next();
		System.out.println("word = " + word);
		
		System.out.println(sc.hasNext());
		word = sc.next();
		System.out.println("word = " + word);
		
		System.out.println(sc.hasNext());
		word = sc.next();
		System.out.println("word = " + word);
		
		System.out.println(sc.hasNext());
		word = sc.next();
		System.out.println("word = " + word);
		
	}
}