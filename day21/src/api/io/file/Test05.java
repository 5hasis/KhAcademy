package api.io.file;

import java.io.File;

import java.io.File;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
//		파일 및 폴더의 생성 또는 삭제
		try {
		File dir = new File("file", "test");
		
		System.out.println(dir.exists());
		
//		파일 생성
		dir.createNewFile();
		
//		삭제
		dir.delete();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

		

		
	}

}
