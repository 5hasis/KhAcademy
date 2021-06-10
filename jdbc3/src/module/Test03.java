package module;

import java.util.Scanner;

import beans.MemberDao;

public class Test03 {
	public static void main(String[] args) throws Exception {
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		System.out.print("기존 비밀번호 입력 : ");
		String memberPw = sc.next();
		System.out.print("새로운 비밀번호 입력 : ");
		String newPw = sc.next();
		sc.close();
		
		MemberDao memberDao = new MemberDao();
		boolean result = memberDao.changePassword(memberId, memberPw, newPw);
		
		if(result) {
			System.out.println("비밀번호가 변경되었습니다.");
		}
		else {
			System.out.println("정보가 일치하지 않습니다.");
		}
	}

}
