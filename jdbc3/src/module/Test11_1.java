package module;

import beans.MemberDao;
import beans.MemberDto;

public class Test11_1 {
	public static void main(String[] args) throws Exception {
//		회원 단일조회
		
//		데이터 준비
		String memberId = "khacademy";
		
//		데이터베이스 조회
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = memberDao.find(memberId);
		
//		출력
		if(memberDto != null) {
			System.out.println("번호 : "+memberDto.getMemberNo());
			System.out.println("아이디 : "+memberDto.getMemberId());
			System.out.println("닉네임 : "+memberDto.getMemberNick());
		}
		else {
			System.out.println("회원이 존재하지 않습니다");
		}
	}
}