package api.lang.string;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		String[] filter = new String[] {"시발", "개새끼", "좆", "썅", "병신"};

		Scanner sc = new Scanner(System.in);
		System.out.println("문장 입력 : ");
		String str = sc.nextLine();
		sc.close();

		for (int i = 0; i < filter.length; i++) {
			str = str.replace(filter[i], "***");
		}

		System.out.println(str);
	}
}
