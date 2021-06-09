package quiz.program;

import quiz.beans.MusicDao;

public class Test03 {
	public static void main(String[] args) throws Exception {
//		데이터 준비
		long music_no = 1L;
		
//		재생
		MusicDao musicDao = new MusicDao();
		boolean result = musicDao.play(music_no);
		
		if(result) {
			System.out.println("음원 재생이 완료되었습니다");
		}
		else {
			System.out.println("해당 번호의 음원은 존재하지 않습니다");
		}
	}
}