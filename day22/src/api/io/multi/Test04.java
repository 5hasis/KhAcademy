package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws IOException {

		File target = new File("kh", "lotto.kh");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		DataInputStream data = new DataInputStream(buffer);

		List<Integer> list = new ArrayList<>();
		
		try {
			while (true) {
				int value = data.readInt();
				list.add(value);
				//System.out.println(value);
			}
		} 
		catch (Exception e) {
		}

		data.close();
		
		for(int value : list) {
			System.out.println(value);
		}
	}

}
