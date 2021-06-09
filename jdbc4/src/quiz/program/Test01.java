package quiz.program;

import quiz.beans.MusicDao;
import quiz.beans.MusicDto;

public class Test01 {
	public static void main(String[] args) {
		try {
//			데이터 준비
			MusicDto musicDto = new MusicDto();
			musicDto.setMusicName("운전만해 (We Ride)");
			musicDto.setMusicArtist("브레이브걸스");
			musicDto.setMusicAlbum("We Ride");
			
//			데이터베이스 등록
			MusicDao musicDao = new MusicDao();
			musicDao.insert(musicDto);
			
			System.out.println("등록 완료");
		}
		catch(Exception e) {
			System.err.println("등록 오류 발생");
			e.printStackTrace();
		}
	}
}