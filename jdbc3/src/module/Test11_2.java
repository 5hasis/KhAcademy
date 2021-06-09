package module;

import beans.MemberDao;
import beans.MemberDto;

public class Test11_2 {
	public static void main(String[] args) throws Exception {
//		아이디 중복검사 수행 후 회원가입을 진행(기능간의 조합).
		
//		데이터 준비 : MemberDto(회원정보)
		MemberDto memberDto = new MemberDto();
		memberDto.setMemberId("khstudent");
		memberDto.setMemberPw("khstudent");
		memberDto.setMemberNick("학생계정");
		memberDto.setMemberBirth("2000-01-01");
		memberDto.setMemberPhone("010-3333-4455");
		memberDto.setMemberEmail("khstudent@iei.or.kr");
		
//		아이디 중복검사
		MemberDao memberDao = new MemberDao();
		MemberDto target = memberDao.find(memberDto.getMemberId());
		
		if(target == null) {
			memberDao.regist(memberDto);//회원가입
			System.out.println("회원가입이 완료되었습니다");
		}
		else {
			System.out.println("이미 사용중인 아이디입니다");
		}
	}
}