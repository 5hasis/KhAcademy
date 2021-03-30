package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
//		Q. PC에 존재하는 모든 드라이브를 List에 저장한 뒤 출력
		
		File drive = new File("C:/");
		System.out.println(drive.exists());
		
		System.out.println(drive.canRead());
		System.out.println(drive.canWrite());
		System.out.println(drive.canExecute());
		
		List<File> list = new ArrayList<>();
		
		for(char i = 'A'; i <= 'Z'; i++) {
			File drive1 = new File(i + ":/");
			//System.out.println(i + "드라이브 : " + drive.exists());
			if(drive1.exists()) {
				list.add(drive1);
			}
		}
		
		System.out.println("총" + list.size() + "개의 드라이브가 감지되었습니다.");
		
		for(int i = 0; i < list.size(); i++) {
			File dirve1 = list.get(i);
			System.out.println(drive.getAbsolutePath());
		}
		
//		for(File drive1 : list) {
//			System.out.println(drive.getAbsolutePath());
//		}
		
	}

}
