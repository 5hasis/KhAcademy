package quiz.program;

import quiz.beans.MusicDao;

public class Test09 {
	public static void main(String[] args) throws Exception {
		
//		데이터 준비
		long music_no = 5L;
		
//		데이터베이스 삭제
		MusicDao musicDao = new MusicDao();
		boolean result = musicDao.delete(music_no);
		
//		출력
		if(result) {
			System.out.println("음원 삭제 완료");
		}
		else {
			System.out.println("해당 번호의 음원이 존재하지 않습니다");
		}
		
	}
}