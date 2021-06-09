package module;

import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class Test07 {
	public static void main(String[] args) throws Exception {
		
//		MemberDao, MemberDto를 이용하여 회원목록을 번호순으로 출력
		
//		데이터베이스 조회 : MemberDao ----> List<MemberDto>
		MemberDao memberDao = new MemberDao();
		List<MemberDto> list = memberDao.selectList();
		
		System.out.println(list.size());
		
		for(MemberDto memberDto: list) {
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
