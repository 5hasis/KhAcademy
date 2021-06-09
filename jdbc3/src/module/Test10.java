package module;

import beans.AcademyDao;
import beans.AcademyDto;

public class Test10 {
	public static void main(String[] args) throws Exception {
//		Q : DAO, DTO를 이용한 상세보기 구현
		
//		데이터 준비
		int academy_no = 10;
		
//		데이터베이스 조회
		AcademyDao academyDao = new AcademyDao();
		AcademyDto academyDto = academyDao.find(academy_no);
		
//		출력
		if(academyDto != null) {
			System.out.println("번호 : " + academyDto.getAcademyNo());
			System.out.println("이름 : " + academyDto.getAcademyName());
		}
		else {
			System.out.println("없어요");
		}
	}
}