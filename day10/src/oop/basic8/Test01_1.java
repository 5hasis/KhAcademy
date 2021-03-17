package oop.basic8;

import java.util.Scanner;

public class Test01_1 {
	public static void main(String[] args) {
		Student[] st = new Student[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
			
			System.out.println("이름 입력 : ");
			st[i].name = sc.next();
			System.out.println("학년 입력 : ");
			st[i].grade = sc.nextInt();
			System.out.println("국어 점수 입력 : ");
			st[i].kor = sc.nextInt();
			System.out.println("영어 점수 입력 : ");
			st[i].eng = sc.nextInt();
			System.out.println("수학 점수 입력 : ");
			st[i].mat = sc.nextInt();

		}

		for (int i = 0; i < st.length; i++) {
			st[i].set(st[i].name, st[i].grade, st[i].kor, st[i].eng, st[i].mat);
		}

		for (int i = 0; i < st.length; i++) {
			st[i].out();
		}

		sc.close();

	}

}
