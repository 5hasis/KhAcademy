package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		File target = new File("kh", "object2.kh");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream obin = new ObjectInputStream(buffer);
		
		List<Integer> list = (List<Integer>)obin.readObject();
		//List : 상자, Integer : 내용물 => 대충 상자만 전달
		//List<String>이든 List<Integer>든 큰 차이 없다고 생각해버림
		
		obin.close();
		
		System.out.println(list);
	}

}
