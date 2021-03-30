package api.io.file;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
//		File 클래스를 이용해서 디렉터리(Directory) 제어
//		=파일을 구분지을 수 있는 이름을 가진 공간

		File dir = new File("file");

		System.out.println(dir.exists());

		System.out.println(dir.length()); //디렉토리는 크기가 없거나 내장된 기본 크기를 차지함

		System.out.println(dir.isDirectory()); // 디렉토리인가요?
		System.out.println(dir.isFile()); // 파일인가요?

//		디렉토리는 내부 구성 요소에 대한 정보를 확인할 수 있는 명령이 있어야함
//		1.이름만 확인 -> .list() -> String[] 또는 List<String>
//		2.파일 정보를 확인 -> .listFiles() -> File[] 또는 List<File>

		//1.
		//확장반복
		for (String name : dir.list()) {
			System.out.println("name : " + name);
		}

		//일반반복
		String[]names = dir.list();
		for (int i = 0; i < dir.list().length; i++) {
			System.out.println("name : " + names[i]);
		}
		
		//2.
		File[] files = dir.listFiles();
		for(File file : files) {
			System.out.println(file.getName() + "(" + file.length() + ")");
		}
		
	}

}
