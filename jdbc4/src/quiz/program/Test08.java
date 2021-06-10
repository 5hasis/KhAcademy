package quiz.program;

import quiz.beans.MusicDao;
import quiz.beans.MusicDto;

public class Test08 {
	public static void main(String[] args) throws Exception {
		
//		데이터 준비
		long music_no = 1L;
		
//		데이터베이스 검색
		MusicDao musicDao = new MusicDao();
		MusicDto musicDto = musicDao.get(music_no);
		
//		출력
		if(musicDto == null) {
			System.out.println("해당 음원 정보가 존재하지 않습니다");
		}
		else{
			System.out.println(musicDto);
		}
		
	}
}