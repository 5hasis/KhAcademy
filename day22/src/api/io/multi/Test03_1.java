package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
//		로또 번호 6개 추첨 후 kh/lotto.kh에 저장
		List<Integer> base = new ArrayList<>();
		for(int i=1; i <=45; i++) {
			base.add(i);
		}
		Collections.shuffle(base);
		
		List<Integer> lotto = base.subList(0, 6);
		Collections.sort(lotto);
		
//		파일 출력
		File target = new File("kh", "lotto.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream data = new DataOutputStream(buffer);
		
		for(int number : lotto) {
			data.writeInt(number);
		}
		
//		data.flush();
		data.close();
	}
}
