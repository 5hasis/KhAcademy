package quiz.program;

import quiz.beans.MusicDao;
import quiz.beans.MusicDto;

public class Test02 {
	public static void main(String[] args) throws Exception {
		
//		데이터 준비
		MusicDto musicDto = new MusicDto();
		musicDto.setMusicNo(1L);
		musicDto.setMusicName("수정된노래제목");
		musicDto.setMusicArtist("수정된아티스트");
		musicDto.setMusicAlbum("수정된앨범");
		
//		데이터베이스 변경
		MusicDao musicDao = new MusicDao();
		boolean result = musicDao.change(musicDto);
		
//		출력
		if(result) {
			System.out.println("음원 정보 변경이 완료되었습니다");
		}
		else {
			System.out.println("해당 번호의 음원이 존재하지 않습니다");
		}
		
	}
}