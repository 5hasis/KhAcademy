package module;

import beans.MemberDao;
import beans.MemberDto;

public class Test11 {
	public static void main(String[] args) throws Exception {
//		회원 단일 조회

		int member_no = 1;

		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = memberDao.find(member_no);

		if (memberDto != null) {
			
			System.out.println(memberDto.getMemberNo());
			System.out.println(memberDto.getMemberId());
			System.out.println(memberDto.getMemberNick());
			System.out.println(memberDto.getMemberBirth());
			System.out.println(memberDto.getMemberGrade());
		} 
		else {
			System.out.println("회원이 존재하지 않습니다");
		}
	}

}
