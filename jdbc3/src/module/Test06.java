package module;

import java.util.List;

import beans.AcademyDao;
import beans.AcademyDto;

public class Test06 {
	public static void main(String[] args) throws Exception {
//		Q. MemberDao, MemberDto를 활용한 데이터베이스 조회(Read)작업 수행하기
		
//		준비 데이터 없음.
		
//		데이터베이스 조회.
		
		AcademyDao academyDao = new AcademyDao();
		List<AcademyDto> list = academyDao.select();
		
		System.out.println("데이터 개수 : " + list.size());
		
		for(AcademyDto academyDto :list) {
			System.out.println(academyDto.getAcademyName());
		}
		
	}

}
