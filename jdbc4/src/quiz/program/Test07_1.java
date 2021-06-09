package quiz.program;

import java.util.List;

import quiz.beans.MusicDao;
import quiz.beans.MusicDto;

public class Test07_1 {
	public static void main(String[] args) throws Exception {
		
//		데이터 준비
		String keyword = "아이유";
		
//		데이터베이스 조회
		MusicDao musicDao = new MusicDao();
		List<MusicDto> artistList = musicDao.searchByArtist(keyword);
		List<MusicDto> nameList = musicDao.searchByName(keyword);
		List<MusicDto> albumList = musicDao.searchByAlbum(keyword);

//		출력
		System.out.println("노래 검색결과");
		if(nameList.isEmpty()) {
			System.out.println("검색결과가 존재하지 않습니다");
		}
		else {
			System.out.println("총 "+nameList.size()+"개의 검색 결과가 존재합니다");
			for(MusicDto musicDto : nameList) {
				System.out.println(musicDto);
			}
		}
		
		System.out.println("--------------------------------------");
		
		System.out.println("아티스트 검색결과");
		if(artistList.isEmpty()) {
			System.out.println("검색결과가 존재하지 않습니다");
		}
		else {
			System.out.println("총 "+artistList.size()+"개의 검색 결과가 존재합니다");
			for(MusicDto musicDto : artistList) {
				System.out.println(musicDto);
			}
		}
		
		System.out.println("--------------------------------------");
		
		System.out.println("앨범 검색결과");
		if(albumList.isEmpty()) {
			System.out.println("검색결과가 존재하지 않습니다");
		}
		else {
			System.out.println("총 "+albumList.size()+"개의 검색 결과가 존재합니다");
			for(MusicDto musicDto : albumList) {
				System.out.println(musicDto);
			}
		}
	}
}