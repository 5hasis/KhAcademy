package api.lang.string;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		String id = new String("admin");
		String password = new String("test1234");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String inputId = sc.next();
		System.out.print("비밀번호 입력 : ");
		String inputPwd = sc.next();
		
		//로그인 성공 : 아이디 일치 + 비밀번호 일치
		//if(userId == id && userPassword == password) {//비교 불가능(동일비교)
		if(id.equals(inputId) && password.equals(inputPwd)) { //비교 가능(동등비교)
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
		
		
		sc.close();
		
	}
}
