package module;

import beans.MemberDao;

public class Test01 {
	public static void main(String[] args) throws Exception {
//		Q. 우리가 만든 MemberDao라는 모듈을 이용하여 회원 탈퇴를 구현
		
//		데이터 준비
		String memberId = "test12345";
		String memberPw = "test12345";
		
//		계산
		MemberDao memberDao = new MemberDao();
		int count = memberDao.exit(memberId, memberPw);
		
//		출력
		if(count > 0) {
			System.out.println("회원 탈퇴가 완료되었습니다.");
		}
		else {
			System.out.println("정보가 일치하지 않습니다.\n회원 탈퇴 실패");
		}
		
	}

}
