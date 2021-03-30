package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static final int EOF = -1;
	
	public static void main(String[] args) throws IOException {
		
		File origin = new File("file", "practice.kh");
		File copy = new File("file", "copy.kh");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(copy);
		
		while (true) {
			int n = in.read();
			if (n == EOF)break;
			out.write(n);
			//System.out.println(n);
		}
		
		in.close();
		out.close();
	}
}
