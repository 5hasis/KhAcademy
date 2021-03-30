package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test03_1 {
	public static void main(String[] args) {
//		Q. PC에 존재하는 모든 드라이브를 List에 저장한 뒤 출력
		
		File[] list = File.listRoots();
		
		System.out.println("총" + list.length + "개의 드라이브가 감지되었습니다.");
		for(File drive : list) {
			System.out.println(drive.getAbsolutePath());
		}
		
	}

}
