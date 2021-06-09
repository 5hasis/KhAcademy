package quiz.program;

import java.util.List;

import quiz.beans.MusicDao;
import quiz.beans.MusicDto;

public class Test06 {
	public static void main(String[] args) throws Exception {
//		데이터 준비
		
//		데이터 조회
		MusicDao musicDao = new MusicDao();
//		List<MusicDto> musicChart = musicDao.top3();
		List<MusicDto> musicChart = musicDao.rank(1, 3);
		
//		출력
		for(MusicDto musicDto : musicChart) {
			System.out.println(musicDto);
		}
	}
}