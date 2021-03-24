package api.lang.string;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//1.닉네임에는 절대로 "운영자"라는 글자 들어갈 수 없음
		//2.닉네임은 2-10글자 이내로만 설정이 가능
		//3.닉네임의 첫글자는 숫자일수 없음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임 설정 : ");
		String nickName = sc.next();
		sc.close();
		
		boolean operator = nickName.contains("운영자");
		//boolean operator = nickName.indexOf("운영자") == -1;
		boolean length = nickName.length() <= 2 || nickName.length() >= 10;
		boolean firstLetter = nickName.charAt(0) >= '0' && nickName.charAt(0) <= '9';
		
		if(operator || length || firstLetter) {
			System.out.println("잘못된 닉네임 입니다.");
		}
		else {
			System.out.println("닉네임 설정이 완료되었습니다.");
		}
	}

}
