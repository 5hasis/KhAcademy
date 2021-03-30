package api.io.file;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
//		파일 및 폴더의 생성 또는 삭제
		
		File dir = new File("file", "test");
		
//		디렉토리 생성
//		-mkdir : 중간경로 없으면 생성 안됨
//		-mkdirs : 중간 경로가 없으면 중간 경로 디렉토리까지 생성해줌
		dir.mkdir();
		
//		삭제: 폴더나 파일 모두 같은 명령 사용
		dir.delete();
		
	}

}
