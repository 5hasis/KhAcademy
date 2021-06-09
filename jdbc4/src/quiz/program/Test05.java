package quiz.program;

import java.util.List;

import quiz.beans.MusicDao;
import quiz.beans.MusicDto;

public class Test05 {
	public static void main(String[] args) throws Exception {
		
//		데이터 준비
		
//		데이터베이스 조회
		MusicDao musicDao = new MusicDao();
		List<MusicDto> musicList = musicDao.list();
		
//		출력
//		for(int i=0; i < musicList.size(); i++) {
//			MusicDto musicDto = musicList.get(i);
		for(MusicDto musicDto : musicList) {
			System.out.println(musicDto);
		}
		
	}
}