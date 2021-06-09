package module;

import java.util.List;

import beans.AcademyDao;
import beans.AcademyDto;

public class Test08 {
	public static void main(String[] args) throws Exception {

		
		String keyword = "당";

		AcademyDao academyDao = new AcademyDao();
		List<AcademyDto> list = academyDao.searchList(keyword);

		//데이터베이스 검색
		if (list.isEmpty()) { //list.size == 0
			System.out.println("검색 결과가 존재하지 않습니다.");
		} 
		else {
			System.out.println("검색결과 : " + list.size() + "개");
			for (AcademyDto academyDto : list) {
				System.out.println("academy_no : " + academyDto.getAcademyNo());
				System.out.println("academy_name : " + academyDto.getAcademyName());
			}
		}

	}

}
