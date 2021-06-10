package module;

import java.util.Scanner;
import beans.MemberDao;

public class Test02 {
	public static void main(String[] args) throws Exception {
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		System.out.print("증정 포인트 입력 : ");
		int point = sc.nextInt();
		sc.close();
		
		MemberDao memberDao = new MemberDao();
		
		int count = memberDao.givePoint(memberId, point);
		
		if(count > 0) {
			System.out.println(memberId + " 회원에게 " + point + " 포인트 증정이 완료되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}

}
