package module;

import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class Test09 {
	public static void main(String[] args) throws Exception {
//		Q. 회원 검색?
		
		String type = "member_id";
		String keyword = "test";
		
//		데이터베이스 조회
		MemberDao memberDao = new MemberDao();
		List<MemberDto> list = memberDao.searchList(type, keyword);
		
//		출력
		for(MemberDto memberDto : list) {
			System.out.print(memberDto.getMemberNo());
			System.out.print("/");
			System.out.print(memberDto.getMemberId());
			System.out.print("/");
			System.out.print(memberDto.getMemberNick());
			System.out.print("/");
			System.out.print(memberDto.getMemberBirth());
			System.out.print("/");
			System.out.print(memberDto.getMemberPhone());
			System.out.print("/");
			System.out.print(memberDto.getMemberJoin());
			System.out.print("/");
			System.out.print(memberDto.getMemberEmail());
			System.out.print("/");
			System.out.print(memberDto.getMemberPoint());
			System.out.print("/");
			System.out.println(memberDto.getMemberGrade());
		}
		
	}

}
