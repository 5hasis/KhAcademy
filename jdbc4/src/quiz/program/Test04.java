package quiz.program;

import quiz.beans.MusicDao;

public class Test04 {
	public static void main(String[] args) throws Exception {
//		데이터 준비
		long music_no = 1L;
		
//		좋아요 처리
		MusicDao musicDao = new MusicDao();
		boolean result = musicDao.like(music_no);
		
//		출력
		if(result) {
			System.out.println("좋아요가 완료되었습니다");
		}
		else {
			System.out.println("해당 번호는 존재하지 않습니다");
		}
	}
}