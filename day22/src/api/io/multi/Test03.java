package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	public static void main(String[] args) throws IOException {
		// 로또번호 6개 추첨해서 lotto.kh라는 파일에 저장
		Random r = new Random();

		File target = new File("kh", "lotto.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream data = new DataOutputStream(buffer);

		Set<Integer> lotto = new TreeSet<>();

		while (lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		List<Integer> targetList = new ArrayList<>(lotto);

		for (int i = 0; i < targetList.size(); i++) {
			data.writeInt(targetList.get(i));
			System.out.println(targetList.get(i));
		}
		
		data.close();
	}

}
