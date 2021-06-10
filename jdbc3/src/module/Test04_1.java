package module;

import beans.MemberDao;
import beans.MemberDto;

public class Test04_1 {
	public static void main(String[] args) throws Exception {
//		Q : MemberDao와 MemberDto를 이용한 회원 등록.
		
//		데이터 준비 : MemberDto(회원정보)
		MemberDto memberDto = new MemberDto();
		memberDto.setMemberId("khstudent");
		memberDto.setMemberPw("khstudent");
		memberDto.setMemberNick("학생계정");
		memberDto.setMemberBirth("2000-01-01");
		memberDto.setMemberPhone("010-3333-4455");
		memberDto.setMemberEmail("khstudent@iei.or.kr");
		
//		계산(데이터베이스 등록)
		MemberDao memberDao = new MemberDao();
		memberDao.regist(memberDto);
		
//		출력
		System.out.println("회원 등록 완료");
		
	}
}