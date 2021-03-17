package oop.basic8;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Student[] a = new Student[5];

		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] grade = new int[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("이름 입력 : ");
			name[i] = sc.next();
			System.out.println("학년 입력 : ");
			grade[i] = sc.nextInt();
			System.out.println("국어 점수 입력 : ");
			kor[i] = sc.nextInt();
			System.out.println("영어 점수 입력 : ");
			eng[i] = sc.nextInt();
			System.out.println("수학 점수 입력 : ");
			mat[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < 5; i++) {
			a[i] = new Student();
			a[i].set(name[i], grade[i], kor[i], eng[i], mat[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			a[i].out();
		}
		

		sc.close();

	}

}
