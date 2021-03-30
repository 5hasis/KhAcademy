package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

public class Test03_1 {
	public static final int EOF = -1;

	public static void main(String[] args) throws IOException {
//		Q. 실제로 용량이 큰 파일들도 잘 복사가 될까?
		File origin = new File("D:/", "test.mp4");
		FileInputStream in = new FileInputStream(origin);

		File copy = new File("D:/", "copy.mp4");
		FileOutputStream out = new FileOutputStream(copy);

		long total = origin.length();
		long count = 0L;
		Format f = new DecimalFormat("0.00");

		while (true) {
			int n = in.read();
			if (n == EOF)
				break;
			out.write(n);
			count++;
			double percent = count * 100.0 / total;
			System.out.println("총 " + total + "중" + count + "byte 이동 완료");
			System.out.println("(" + f.format(percent) + "%");
		}

		in.close();
		out.close();
	}
}
